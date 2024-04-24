
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String caractere;

		System.out.println("Digite uma letra ");
		caractere = in.next();

		caractere = caractere.toLowerCase ();
		
		//if (caractere.equalsIgnoreCase("a") || caractere.equalsIgnoreCase("e") || caractere.equalsIgnoreCase("i")|| caractere.equalsIgnoreCase("o") || caractere.equalsIgnoreCase("u")) {
		if (caractere.equals("a") || caractere.equals("e") || caractere.equals("i")|| caractere.equals("o") || caractere.equals("u")) {
		System.out.println("Vogal");
		} 
			else {
			System.out.println("Consoante" );
		}

		in.close();
	}

}