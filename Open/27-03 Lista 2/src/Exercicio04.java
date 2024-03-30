import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double x, y;
		
		System.out.println("X");
		x = in.nextDouble();
		
		if(x <= 5 && x >= -5) {
			System.out.println("Valor inválido para x");
		}
		
		else {
			y = 8 / Math.sqrt(x * x -25);
			System.out.println("Y = " + );
		}
		
		in.close();
		
		

	}

}
