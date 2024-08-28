package arrays;

import java.util.Random;

public class exe203 {

    public static void main(String[] args) {
        double[][] temperaturas = new double[10][12];
        Random random = new Random();


        double[] mediasAnuais = new double[10];
        double somaAnual;
        
        for (int i = 0; i < 10; i++) {
            somaAnual = 0;
            for (int j = 0; j < 12; j++) {
                somaAnual += temperaturas[i][j];
            }
            mediasAnuais[i] = somaAnual / 12;
        }

        int anoMaiorMedia = 0;
        int anoMenorMedia = 0;
        double maiorMedia = mediasAnuais[0];
        double menorMedia = mediasAnuais[0];
        
        for (int i = 1; i < 10; i++) {
            if (mediasAnuais[i] > maiorMedia) {
                maiorMedia = mediasAnuais[i];
                anoMaiorMedia = i;
            }
            if (mediasAnuais[i] < menorMedia) {
                menorMedia = mediasAnuais[i];
                anoMenorMedia = i;
            }
        }

        System.out.println("Médias anuais:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ano " + (i + 1) + ": " + mediasAnuais[i]);
        }

        System.out.println("\nAno com a maior média: Ano " + (anoMaiorMedia + 1) + " (" + maiorMedia + "°C)");
        System.out.println("Ano com a menor média: Ano " + (anoMenorMedia + 1) + " (" + menorMedia + "°C)");
    }
}