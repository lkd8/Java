import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double media, nota1, nota2, nota3;
		
		System.out.println("Nota 1");
		nota1 = in.nextDouble();
		System.out.println("Nota 2");
		nota2 = in.nextDouble();
		System.out.println("Nota 3");
		nota3 = in.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
				
		System.out.println("Média " + String.format("%.2f", media));
		
		if(media >= 6) {
			System.out.println("Aprovado");
		}
		
		else {
			System.out.println("Reprovado");
		}
		
		in.close();
		
		
		

	}

}
