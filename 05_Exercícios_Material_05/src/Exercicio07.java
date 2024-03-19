import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		// variáveis
		Scanner in = new Scanner(System.in);
		double x, y;
		
		DecimalFormat mascara = new DecimalFormat("#.000");
		
		// entrada de dados
		System.out.print("x ");
		x = in.nextDouble();

		// processamento de dados
		y = Math.sqrt(1 + Math.pow(Math.pow(x, 4) - 1 / Math.pow(2 * x, 2), 2) - Math.pow(-x, 2) / 2); 
				
		// saída de dados
		System.out.println();
		System.out.println("y = " + mascara.format(y));

	}

}
