public class Solucao_05 {
    public static void main(String[] args) {
        System.out.println("""
                \n5) Escreva um programa que inverta os caracteres de um string.
                
                IMPORTANTE:
                a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
                b) Evite usar funções prontas, como, por exemplo, reverse;
                """);

        String original = "Target Sistemas";

        StringBuilder invertida = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {

            char caractere = original.charAt(i);

            invertida.append(caractere);
        }

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida.toString());
    }
}
