import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		// variáveis
		Scanner in = new Scanner(System.in);
		double salario, Kw, valorKw, valorTotal, valorComDesconto;

		DecimalFormat mascara = new DecimalFormat("0.00");
		
		// entrada de dados
		System.out.print("Valor do salário mínimo ");
		salario = in.nextDouble();
		System.out.print("Quilowatts gastos ");
		Kw = in.nextDouble();
		
		// processamento de dados
		valorKw = salario / 7 / 100;
		valorTotal = valorKw * Kw;
		valorComDesconto = valorTotal * 0.90;
		
		// saída de dados
		System.out.println("Valor do kilowatt --> R$ " + mascara.format(valorKw));
		System.out.println("Valor total a pagar --> R$ " + mascara.format(valorTotal));
		System.out.println("Valor total com 10% de desconto --> R$ " + mascara.format(valorComDesconto));
		
		in.close();
		

	}
}
