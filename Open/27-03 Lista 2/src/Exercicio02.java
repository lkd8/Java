import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double prova1, prova2, trabalho1, trabalho2, trabalho3, media, mediaprova, mediatrab;
		
		System.out.println("Prova 1");
		prova1 = in.nextDouble();
		System.out.println("Prova 2");
		prova2 = in.nextDouble();
		System.out.println("Trabalho 1");
		trabalho1 = in.nextDouble();
		System.out.println("Trabalho 2");
		trabalho2 = in.nextDouble();
		System.out.println("Trabalho 3");
		trabalho3 = in.nextDouble();
		
		mediaprova = (prova1 + prova2) /2 * 0.7;
		mediatrab = (trabalho1 + trabalho2 + trabalho3) / 3 * 0.3;
		media = mediaprova + mediatrab;
		
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
