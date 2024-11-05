package estudo;

import java.util.Random;
import java.util.Scanner;

public class manipulacaotxt03 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Leitura da quantidade de palavras e armazenamento em um array fixo
        System.out.print("Quantas palavras você deseja inserir? ");
        int n = in.nextInt();
        in.nextLine(); // Consumir a linha pendente após o nextInt()

        // Criação do array de palavras
        String[] palavras = new String[n];
        
        // Entrada das palavras
        for (int i = 0; i < n; i++) {
            System.out.print("Informe a palavra " + (i + 1) + ": ");
            palavras[i] = in.nextLine().toLowerCase(); // Armazena as palavras em minúsculas
        }

        // Escolha aleatória de uma palavra do array
        Random random = new Random();
        String palavraEscolhida = palavras[random.nextInt(n)];

        // Criação da palavra mascarada com underscores
        char[] palavraMascarada = new char[palavraEscolhida.length()];
        for (int i = 0; i < palavraMascarada.length; i++) {
            palavraMascarada[i] = '_';
        }

        int erros = 0;
        final int MAX_ERROS = 6;

        // Loop do jogo
        while (erros < MAX_ERROS && new String(palavraMascarada).contains("_")) {
            System.out.print("Digite uma letra: ");
            char letra = in.next().toLowerCase().charAt(0);
            boolean acertou = false;

            // Verifica se a letra está na palavra escolhida
            for (int i = 0; i < palavraEscolhida.length(); i++) {
                if (palavraEscolhida.charAt(i) == letra) {
                    palavraMascarada[i] = letra; // Revela a letra na palavra mascarada
                    acertou = true;
                }
            }

            // Se o jogador errou, incrementa o contador de erros
            if (!acertou) {
                erros++;
                System.out.println("-> Você errou pela " + erros + "ª vez. Tente de novo!");
            } else {
                // Exibe a palavra com as letras descobertas
                System.out.println("A palavra é: " + String.valueOf(palavraMascarada));
            }
        }

        // Verifica condição de vitória ou derrota
        if (erros == MAX_ERROS) {
            System.out.println("Você foi enforcado! A palavra era: " + palavraEscolhida);
        } else {
            System.out.println("Parabéns! Você adivinhou a palavra: " + palavraEscolhida);
        }

        in.close();
    }
}