package texto;

import java.util.Scanner;

public class e0911 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String palavra, codificada;
		int deslocamento;
       
		System.out.println("Digite a palavra");
		palavra = in.next();
		
		System.out.println("Deslocamento");
		deslocamento = in.nextInt();
		
		codificada = codificar(palavra,deslocamento);
		
		System.out.println("Palavra codificada --> " + codificada);
		
		in.close();
	}
	public static String codificar(String palavra, int deslocamento) {
		char letra, letraCodificada;
		String palavraCodificada = "";
		
		for (int i = 0; i < palavra.length(); i++) {
			letra = palavra.charAt(i);
			if(Character.isUpperCase(letra)) {
				letraCodificada = (char)((letra - 'A' + deslocamento) % 26 + 'A');
				palavraCodificada += letraCodificada;
			}
		}
		
		return palavraCodificada;
	}
	

}