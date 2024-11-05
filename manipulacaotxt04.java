package estudo;

import java.util.Scanner;

public class manipulacaotxt04 {

	// Método para remover espaços extras no início, no final e entre as palavras
    public static String removerEspacosExtras(String frase) {
        return frase.trim().replaceAll("\\s+", " ");
    }

    // Método para contar letras, ignorando espaços e caracteres especiais
    public static int contarLetras(String frase) {
        int totalLetras = 0;
        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                totalLetras++;
            }
        }
        return totalLetras;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Leitura da frase fornecida pelo usuário
        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();

        // a) Remover espaços extras
        String fraseCorrigida = removerEspacosExtras(frase);

        // b) Contar letras
        int totalLetras = contarLetras(fraseCorrigida);

        // Exibição dos resultados
        System.out.println("Frase corrigida: \"" + fraseCorrigida + "\"");
        System.out.println("Total de letras: " + totalLetras);

        in.close();
    }
}