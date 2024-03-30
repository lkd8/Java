import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		// variáveis
		Scanner in = new Scanner(System.in);
		double x, y;
		
		DecimalFormat mascara = new DecimalFormat("0.000");
		
		// entrada de dados
		System.out.print("x ");
		x = in.nextDouble();

		// processamento de dados
		y = Math.sqrt(Math.cbrt(x - 1 / 2));
				
		// saída de dados
		System.out.println();
		System.out.println("y = " + mascara.format(y));
		
		in.close();

	}

}
