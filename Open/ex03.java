
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um valor ");
		valor = in.nextInt();
		
		
		if (valor % 2 == 0) {
			System.out.println("Par");
		}
		
		else {
			System.out.println("Ímpar");
		}
		
		//switch(valor % 2) {
			//case 0:
				//System.out.println("Par");
				//break;
			//default: 
				//System.out.println("ímpar");
		
		//System.out.println(valor % 2 == 0 ? "é par" : "é ímpar");
		
		in.close();
		
	}
}
