import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double valor1, valor2, valor3;
		
		System.out.println("Lado A");
		valor1 = in.nextDouble();
		
		System.out.println("Lado B");
		valor2 = in.nextDouble();
		
		System.out.println("Lado C");
		valor3 = in.nextDouble();
		
		
		if(valor1 + valor2 > valor3 && valor2 + valor3 > valor1 && valor3 + valor1 > valor2) {
			System.out.println("Valores válidos ");
		}
		
		else {
			System.out.println("Valores inválidos para lados de um triângulo ");
		}
		
		in.close();

		
		
		

	}

}
