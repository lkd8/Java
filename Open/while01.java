import java.util.Scanner;

public class while01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int contador = 1;
				
		while (contador <= 10) {
			System.out.println("Boa noite ");
			contador = contador + 1;
		}
		
		in.close();
	}
}
