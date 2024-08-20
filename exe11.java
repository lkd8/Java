package arrays;

import java.io.File;
import java.util.Scanner;

public class exe11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("quantidade de arquivos? ");
        int numArquivos = in.nextInt();
        in.nextLine();

        String[] nomesArquivos = new String[numArquivos];
        long[] tamanhosBytes = new long[numArquivos];

        for (int i = 0; i < numArquivos; i++) {
            System.out.print("Digite o caminho completo do arquivo " + (i + 1) + ": ");
            String caminho = in.nextLine();
            File arquivo = new File(caminho);

            if (arquivo.exists() && arquivo.isFile()) {
                nomesArquivos[i] = arquivo.getName();
                tamanhosBytes[i] = arquivo.length();
            } else {
                System.out.println("Arquivo não encontrado ou o caminho não é um arquivo válido.");

            }
        }

        System.out.println("\nListagem dos arquivos e seus tamanhos:");
        for (int i = 0; i < numArquivos; i++) {
            double tamanhoMB = tamanhosBytes[i] / (1024.0 * 1024.0);
            double tamanhoGB = tamanhosBytes[i] / (1024.0 * 1024.0 * 1024.0);

            System.out.printf("Arquivo: %s, Tamanho: %.2f MB, %.6f GB\n", nomesArquivos[i], tamanhoMB, tamanhoGB);
        }

        in.close();
    }
}