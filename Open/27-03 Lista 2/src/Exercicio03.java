import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double valortotal, desconto15, desconto8, valorcomdesconto15, valorcomdesconto8;
		
		System.out.println("Valor total em compras ");
		valortotal = in.nextDouble();
		
		desconto15 = (valortotal * 15) / 100;
		desconto8 = (valortotal * 8) / 100;
		valorcomdesconto15 = valortotal - desconto15;
		valorcomdesconto8 = valortotal - desconto8;
		
		
		System.out.println("Valor ");
		
		if(valortotal >= 1000) {
			System.out.println("Valor final " + valorcomdesconto15);
			System.out.println("Valor do desconto " + desconto15);
		}
		
		else {
			System.out.println("Valor final " + valorcomdesconto8);
			System.out.println("Valor do desconto " + desconto8);
		}
		
		in.close();
	}

}
