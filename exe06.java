package arrays;

import java.util.Scanner;

public class exe06 {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        int tamanho;
        System.out.println("tamanho: ");
        tamanho = in.nextInt();
        int[] vetor = new int[tamanho];
        boolean status = true;
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("elemento " + (i + 1) + ": ");
            vetor[i] = in.nextInt();
        }

        if(tamanho != 1) {
        	for (int i = 0; i < vetor.length; i++) {
				if(vetor[i] % 2 != vetor[i+1] % 2) {
					status = false;
					break;
				}
			}
        }

        if(status) {
        	System.out.println("especial");
        }
        else {
        	System.out.println("nao e especial");
        }
        
        

        


        in.close();
    }
}