import java.util.Scanner;

public class CifraCesar {
    public static String rotacionar(String texto, int deslocamento) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + deslocamento + 26) % 26 + base);
            }
            resultado.append(c);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        System.out.print("Digite o número de posições para rotacionar: ");
        int rotacao = scanner.nextInt();

        String resultado = rotacionar(palavra, rotacao);
        System.out.println("Resultado rotacionado: " + resultado);

        scanner.close();
    }
}




--------------------------------


import java.util.*;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palavras = {"banana", "laranja", "uva", "maçã"};
        Random random = new Random();
        String palavraSecreta = palavras[random.nextInt(palavras.length)];
        char[] palavraOculta = new char[palavraSecreta.length()];
        Arrays.fill(palavraOculta, '_');

        int tentativas = 6;
        Set<Character> letrasTentadas = new HashSet<>();

        while (tentativas > 0) {
            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            if (letrasTentadas.contains(letra)) {
                System.out.println("Você já tentou essa letra. Tente outra.");
                continue;
            }

            letrasTentadas.add(letra);

            if (palavraSecreta.indexOf(letra) >= 0) {
                for (int i = 0; i < palavraSecreta.length(); i++) {
                    if (palavraSecreta.charAt(i) == letra) {
                        palavraOculta[i] = letra;
                    }
                }
                if (String.valueOf(palavraOculta).equals(palavraSecreta)) {
                    System.out.println("Parabéns! Você acertou a palavra: " + palavraSecreta);
                    break;
                }
            } else {
                tentativas--;
                System.out.println("Você errou. Restam " + tentativas + " tentativas.");
            }
        }

        if (tentativas == 0) {
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
        }

        scanner.close();
    }
}