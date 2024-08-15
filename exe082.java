package arrays;

import java.util.Random;

public class exe082 {

    public static void main(String[] args) {
        Random rd = new Random();
        int[] vetor = new int[10];
        boolean status;
        
        
        for (int i = 0; i < vetor.length;) {
			vetor[i] = rd.nextInt(vetor.length);
			status = false;
        	for(int j = 0; j < i; j++) {
        		if(vetor[i] == vetor [j]) {
        			status = true;
        			break;
        		}
        	}
        	
        	if(!status) {
        		System.out.println(vetor[i] + " ");
        		i++;
   
        	}
		}
        
        


        }

}