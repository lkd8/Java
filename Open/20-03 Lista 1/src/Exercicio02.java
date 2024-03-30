import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		// variáveis
		Scanner in = new Scanner(System.in);
		double tempcel, tempfahr;
		
		// entrada de dados
		System.out.print("Informe a temperatura em celsius ");
		tempcel = in.nextDouble();
		
		// processamento de dados
		tempfahr = tempcel * 9 / 5 + 32;
		
		// saída de dados
		System.out.println("temperatura fahrenheit = " + String.format("%.4f", tempfahr));

		in.close();
	}
}
