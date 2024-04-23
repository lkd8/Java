
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double caractere;

		System.out.println("Digite uma letra ");
		caractere = in.nextDouble();

				
		if (caractere == "a" || caractere == "e" || caractere == "i" || caractere == "o" || caractere == "u")
		//if (str.equalsIgnoreCase("A") || str.equalsIgnoreCase("E") || str.equalsIgnoreCase("I")|| str.equalsIgnoreCase("O") || str.equalsIgnoreCase("U")) {
			System.out.println("Vogal");
		} else {
			System.out.println(caractere + "Consoante" );
		}

		in.close();
	}

}
