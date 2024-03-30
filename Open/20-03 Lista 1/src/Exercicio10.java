import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int valor, bit1, bit2, bit3, bit4, decimal;
		
		System.out.println("Valor em binário com quatro bits ");
		valor = in.nextInt();
		
		bit1 = (int) (valor / 1000 * Math.pow(2,3));
		bit2 = (int) (valor / 100 % 10 * Math.pow(2, 2));
		bit3 = (int) (valor % 100 /10 * Math.pow(2, 1));
		bit4 = (int) (valor % 10 * Math.pow(2, 0));
		
		decimal = bit1 + bit2 + bit3 + bit4;
		
		System.out.println();
		System.out.println("Valor na base decimal " + decimal);
		
		in.close();
		

	}

}
