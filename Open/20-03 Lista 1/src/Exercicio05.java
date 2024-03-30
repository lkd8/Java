import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		// variáveis
		Scanner in = new Scanner(System.in);
		double valorhora, horatrab, desconto, bruto, liquido;
		
		DecimalFormat mascara = new DecimalFormat("0.00");
		
		// entrada de dados
		System.out.print("Valor da hora-aula ");
		valorhora = in.nextDouble();
		System.out.print("Horas trabalhadas ");
		horatrab = in.nextDouble();
		System.out.print("Desconto INSS ");
		desconto = in.nextDouble();
		
		// processamento de dados
		bruto = valorhora * horatrab;
		liquido = bruto - desconto;
		
		// saída de dados
		System.out.println();
		System.out.println("Salário liquido " + mascara.format(liquido));
		
		in.close();

	}

}
