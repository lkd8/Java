package arrays;

import java.util.Random;

public class exe201 {

	public class MaiorValorMatriz {
	    public static void main(String[] args) {
	        int[][] x = new int[10][10];
	        Random gerador = new Random();
	        int maiorValor = 0;


	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                x[i][j] = gerador.nextInt(1001);
	                if (x[i][j] > maiorValor) {
	                    maiorValor = x[i][j];
	                }
	            }
	        }

	        System.out.println("Matriz 10x10:");
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                System.out.print(x[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        System.out.println("\nMaior valor: " + maiorValor);
	        System.out.println("linha, coluna:");
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                if (x[i][j] == maiorValor) {
	                    System.out.println("(" + i + ", " + j + ")");
	                }
	            }
	        }
	    }
	}
}