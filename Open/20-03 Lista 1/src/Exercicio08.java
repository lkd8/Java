import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		// variáveis
		Scanner in = new Scanner(System.in);
		int valor, dezena, div;
		
		// entrada de dados
		System.out.print("valor ");
		valor = in.nextInt();
		
		// processamento de dados
		dezena = valor % 100;
		div = dezena / 10;
		
		
		// saída de dados
		System.out.println();
		System.out.println("dezena = " + div);
		
		in.close();

	}

}
