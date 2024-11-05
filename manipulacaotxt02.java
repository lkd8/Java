package estudo;

import java.util.Scanner;

public class manipulacaotxt02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// inicia-se a string como o exercicio pede
		String palavra, codificada;
		int deslocamento;
		
		// preenchimento das variáveis pelo usuário
		System.out.print("palavra");
		palavra = sc.next();
		
		System.out.print("rotação");
		deslocamento = sc.nextInt();
		
		// variável codificada recebe o resultado do método codificar para as variáveis palavra e deslocamento
		codificada = codificar(palavra, deslocamento);
		
		// impressão da palavra codificada
		System.out.println("codificação: " + codificada);
		
		sc.close();
		
	}
	
	
	// método para codificação da palavra
	public static String codificar(String palavra, int deslocamento) {
	// declara as variáveis letra e letra codificada
		char letra, letraCodificada;
		String palavraCodificada = "";
		
	// loop para retirar as letras da palavra
		for (int i = 0; i < palavra.length(); i++) {
			letra = palavra.charAt(i);
			if(Character.isUpperCase(letra)) {
				letraCodificada = (char) ((letra - 'A' + deslocamento) % 26 + 'A');
				palavraCodificada += letraCodificada;
			}
			
		}
		return palavraCodificada;
	}

}
