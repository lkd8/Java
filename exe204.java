package arrays;

import java.util.Random;

public class exe204 {

    public static void main(String[] args) {
        double[][] vendas = new double[3][6];
        Random random = new Random();

        double[] totalVendasPorCategoria = new double[3];
        for (int i = 0; i < 3; i++) {
            double somaVendas = 0;
            for (int j = 0; j < 6; j++) {
                somaVendas += vendas[i][j];
            }
            totalVendasPorCategoria[i] = somaVendas;
        }

        double[] totalVendasPorMes = new double[6];
        for (int j = 0; j < 6; j++) {
            double somaVendas = 0;
            for (int i = 0; i < 3; i++) {
                somaVendas += vendas[i][j];
            }
            totalVendasPorMes[j] = somaVendas;
        }

        int mesMaiorVendas = 0;
        double maiorVendas = totalVendasPorMes[0];
        for (int j = 1; j < 6; j++) {
            if (totalVendasPorMes[j] > maiorVendas) {
                maiorVendas = totalVendasPorMes[j];
                mesMaiorVendas = j;
            }
        }

        double[] mediaVendasPorCategoria = new double[3];
        for (int i = 0; i < 3; i++) {
            mediaVendasPorCategoria[i] = totalVendasPorCategoria[i] / 6;
        }

        System.out.println("Total de vendas por categoria:");
        System.out.println("Eletrônicos: R$ " + totalVendasPorCategoria[0]);
        System.out.println("Roupas: R$ " + totalVendasPorCategoria[1]);
        System.out.println("Alimentos: R$ " + totalVendasPorCategoria[2]);

        System.out.println("\nMês com o maior número de vendas totais: Mês " + (mesMaiorVendas + 1) + " (R$ " + maiorVendas + ")");

        System.out.println("\nMédia de vendas mensais por categoria:");
        System.out.println("Eletrônicos: R$ " + mediaVendasPorCategoria[0]);
        System.out.println("Roupas: R$ " + mediaVendasPorCategoria[1]);
        System.out.println("Alimentos: R$ " + mediaVendasPorCategoria[2]);
    }
}