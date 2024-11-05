package estudo;

import java.util.Scanner;

public class manipulacaotxt05 {

    // Método para verificar se uma frase é um palíndromo
    public static boolean ehPalindromo(String frase) {
    	// tudo que não for entre a-z e A-Z é substituido por uma espaço vazio, e muda tudo para minúsculas
        String fraseLimpa = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        //
        int n = fraseLimpa.length();
        // inverte a palavra
        for (int i = 0; i < n / 2; i++) {
        // compara a palavra original com a invertida
            if (fraseLimpa.charAt(i) != fraseLimpa.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Entrada da frase
        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();

        // Verificar e exibir resultado
        if (ehPalindromo(frase)) {
            System.out.println("A frase é um palíndromo.");
        } else {
            System.out.println("A frase não é um palíndromo.");
        }

        in.close();
    }
}