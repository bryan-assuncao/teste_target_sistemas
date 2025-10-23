import java.util.Map;
import java.util.LinkedHashMap;

public class Solucao_04 {

    public static void main(String[] args) {
        System.out.println("""
                \n4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
                  • SP – R$67.836,43
                  • RJ – R$36.678,66
                  • MG – R$29.229,88
                  • ES – R$27.165,48
                  • Outros – R$19.849,53
                
                  Escreva um programa na linguagem que desejar onde calcule o percentual de representação que
                  cada estado teve dentro do valor total mensal da distribuidora.  """);

        Map<String, Double> faturamentoPorEstado = new LinkedHashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        double valorTotal = 0.0;
        for (double valor : faturamentoPorEstado.values()) {
            valorTotal += valor;
        }

        System.out.println("\nPercentual de Representação por Estado");
        System.out.printf("Valor Total Mensal: R$ %,.2f\n", valorTotal);
        System.out.println("----------------------------------------------");

        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double valorEstado = entry.getValue();

            double percentual = (valorEstado / valorTotal) * 100.0;

            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}