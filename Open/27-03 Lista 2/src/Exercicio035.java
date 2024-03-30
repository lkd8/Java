import java.util.Scanner;

public class Exercicio035 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double valortotal, valorfinal, valordesconto;
		
		System.out.println("Valor total em compras ");
		valortotal = in.nextDouble();

		
		if(valortotal <= 1000) {
			valorfinal = valortotal * 0.92;
		}
		
		else {
			valorfinal = valortotal * 0.85;
			
		}
		valordesconto = valortotal - valorfinal;
		System.out.println("Valor final a pagar R$" + valorfinal);
		System.out.println("Valor do desconto R$" + valordesconto);
		
		in.close();
	}

}
