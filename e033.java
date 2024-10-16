import java.util.Random;
import java.util.Scanner;

public class e033 {
	
	static String[] lista = new String[3];
	static String palavraSecreta;
	static char[] letraDescoberta;
	static int erro = 0;
	static char letra;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("digite as palavras:");
		for(int i = 0; i < lista.length; i++) {
			lista[i] = sc.next().toUpperCase();
			
		}
		
		palavraSecreta = lista[rd.nextInt(lista.length)];
		letraDescoberta = new char[palavraSecreta.length()];
		for(int i = 0; i < letraDescoberta.length; i++) {
			letraDescoberta[i] = '_';
		}
		
		while(erro < 6 && !descobrir()) {
			System.out.println("A palavra é:");
			for (char ch : letraDescoberta) {
				System.out.println(ch + "");
			}
			
			System.out.println("\nDigite uma letra: ");
			letra = sc.next().toUpperCase().charAt(0);
			
			if(!verificar()) {
				erro++;
				System.out.println("Você errou pela" + erro + "ª vez! ");
			}
			
			System.out.println();
			
		}

	}
	
	public static boolean descobrir() {
		for (char ch : letraDescoberta) {
			if(ch == '_') {
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean verificar() {
		boolean achou = false;
		for(int i = 0; i < palavraSecreta.length(); i++) {
			if(letra == palavraSecreta.charAt(i)) {
				letraDescoberta[i] = letra;
				achou = true;
			}
		}
		return achou;
	}

}
