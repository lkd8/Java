package texto;

import java.util.Scanner;

public class e0910 {

	public static void main(String[] args) {
		
		String[] lista = new String[5];
		
		lerPalavra(lista);
		localizarPar(lista);

	}

	public static void localizarPar(String[] lista) {
		String invertida;
		for(String palavra : lista) {
			invertida = inverter(palavra);
			for(String word : lista) {
				if(word.equalsIgnoreCase(invertida)) {
					System.out.println(palavra + "-->" + invertida);
				}
			}
		}		
	}

	public static String inverter(String palavra) {
		char[] letra = new char[palavra.length()];
		for(int i = palavra.length() - 1; i >= 0; i--) {
			letra[palavra.length() - 1 - i] = palavra.charAt(i);
		}
		return new String(letra);
	}

	public static void lerPalavra(String[] lista) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < lista.length; i++) {
			System.out.print("--> ");
			lista[i] = sc.next();
		}
		sc.close();
	}
}