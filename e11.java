import java.util.Scanner;

public class e11 {

	public static void main(String[] args) {
		String [] lista = new String[];
		
		lerPalavra(lista);
		localizarPalavra(lista);
		
		public static void lerPalavra(String[] lista) {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < lista.length; i++) {
				System.out.print("-->");
				lista[i] = sc.next();
			}
		}
		
		public static void localizarPar(String[] lista) {
			String invertida;
			for (String string : lista) {
				invertida = inverter(palavra);
		}
		}
		
		public static String inverter(String palavra) {
			char[] letra = new char[palavra.length()];
			for (int i = palavra.length() -1; i >= 0; i++) {
				letra[palavra.length() - 1 - i] = palavra.charAt(i);
			}
			String aux = new String(letra);
			System.out.println(aux);
		}

	}

}
