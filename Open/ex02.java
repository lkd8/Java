
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String caractere;

		System.out.println("Digite uma letra ");
		caractere = in.next();

		caractere = caractere.toLowerCase();
		
		switch (caractere) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("Vogal");
			break;
		default:
			System.out.println("Consoante");

		}
		
		in.close();

	}

}
