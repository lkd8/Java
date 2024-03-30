import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		// variáveis
		Scanner in = new Scanner(System.in);
		double base, altura, area, perimetro;
		
		// entrada de dados
		System.out.print("Valor da base ");
		base = in.nextDouble();
		System.out.print("Valor da altura ");
		altura = in.nextDouble();
		
		// processamento de dados
		area = base * altura;
		perimetro = 2 * (base + altura);
		
		// saída de dados
		System.out.println();
		System.out.println("Área do retângulo " + area);
		System.out.println("Perímetro do retângulo " + perimetro);
		
		in.close();

	}
}
