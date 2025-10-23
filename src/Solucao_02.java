import java.util.InputMismatchException;
import java.util.Scanner;

public class Solucao_02 {
    public static void main(String[] args) {
        System.out.println("""
                \n2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
                (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
                ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
                IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;""");

        Scanner leitura = new Scanner(System.in);
        System.out.print("\nDigite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = 0;
        try{
            numero = leitura.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Número inválido, por favor digite um número válido.");
        }
        leitura.close();

        int a = 0;
        int b = 1;
        boolean pertence = false;

        if (numero == 0 || numero == 1) {
            pertence = true;
        } else {
            while (b <= numero) {
                int proximo = a + b;
                if (proximo == numero) {
                    pertence = true;
                    break;
                }
                a = b;
                b = proximo;
            }
        }

        if (pertence) {
            System.out.println("\nO número " + numero + " PERTENCE à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

    }
}