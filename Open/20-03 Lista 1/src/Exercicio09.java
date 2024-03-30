import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {


		// variáveis
		Scanner in = new Scanner(System.in);
		int valor, cent, dez, uni, inv;
		
		// entrada de dados
		System.out.print("valor com três digitos ");
		valor = in.nextInt();
		
		// processamento de dados
		cent = valor / 100;
		dez = valor % 100 /10;
		uni = valor % 10;
		
		inv = uni * 100 + dez * 10 + cent;
		
		
		// saída de dados
		System.out.println();
		System.out.println("valor invertido = " + inv);
		
		in.close();

	}

}
