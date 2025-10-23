import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.text.NumberFormat;
import java.util.Locale;

public class Solucao_03 {

    public static void main(String[] args) {

        System.out.println("""
                \n3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
                • O menor valor de faturamento ocorrido em um dia do mês;
                • O maior valor de faturamento ocorrido em um dia do mês;
                • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
                
                IMPORTANTE:
                a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;""");

        Locale localeBR = new Locale("pt", "BR");
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(localeBR);

        List<Double> todosOsValores = new ArrayList<>();

        try {
            File xmlFile = new File("dados (2).xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("row");

            for (int i = 0; i < nList.getLength(); i++) {
                Element element = (Element) nList.item(i);
                String valorStr = element.getElementsByTagName("valor").item(0).getTextContent();
                todosOsValores.add(Double.parseDouble(valorStr));
            }

        } catch (Exception e) {
            System.err.println("Ocorreu um erro ao ler o arquivo XML:");
            e.printStackTrace();
            return;
        }

        List<Double> diasComFaturamento = todosOsValores.stream().filter(valor -> valor > 0.0).collect(Collectors.toList());

        if (diasComFaturamento.isEmpty()) {
            System.out.println("Atenção: Nenhum dia com faturamento encontrado no arquivo.");
            System.out.println("Menor valor: " + formatadorMoeda.format(0));
            System.out.println("Maior valor: " + formatadorMoeda.format(0));
            System.out.println("Média mensal: " + formatadorMoeda.format(0));
            System.out.println("Dias acima da média: 0");
            return;
        }

        double menorValor = Collections.min(diasComFaturamento);
        double maiorValor = Collections.max(diasComFaturamento);
        double mediaMensal = diasComFaturamento.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        long diasAcimaDaMedia = diasComFaturamento.stream().filter(valor -> valor > mediaMensal).count();

        System.out.println("\nMenor valor de faturamento: " + formatadorMoeda.format(menorValor));
        System.out.println("Maior valor de faturamento: " + formatadorMoeda.format(maiorValor));
        System.out.println("Média mensal: " + formatadorMoeda.format(mediaMensal));
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
