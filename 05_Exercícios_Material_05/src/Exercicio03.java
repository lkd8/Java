import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		// variáveis
		Scanner in = new Scanner(System.in);
		double tempo, velocidade, distancia, combustivel;
		
		// entrada de dados
		System.out.print("Tempo gasto ");
		tempo = in.nextDouble();
		System.out.print("Velocidade média ");
		velocidade = in.nextDouble();
		
		// processamento de dados
		distancia = tempo * velocidade;
		combustivel = distancia / 10.5;
		
		// saída de dados
		System.out.println();
		System.out.println("Combustível gasto " + String.format("%.2f", combustivel));

	}

}
