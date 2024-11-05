package estudo;

import java.util.Scanner;

public class manipulacaotxt01 {

	public static void main(String[] args) {
		// cria o array para armazenar as palavras
		String[] lista = new String[5];
		// indica que o array vai passar pelo método de ler a palavra dentro da lista
		lerPalavra(lista);
		// indica que o array vai passar pelo método que localiza as palavras pares
		localizarPar(lista);
		
	}
	
	
	// método para localizar as palavras pares
	public static void localizarPar(String[] lista) {
	// cria-se uma string "invertida" fora do loop para armazenar a palavra invertida
		String invertida;
	// usa-se um foreach com uma variável "palavra" que armazena cada item da lista, depois essa variável vai ser usada no método inverter
		for (String palavra : lista) {
	// a variável "invertida" recebe o resultado do método inverter que usa a variável palavra
			invertida = inverter(palavra);
	// usa-se um foreach com uma variável "word" para cada item da lista original ser comparado com a lista invertida
			for (String word : lista) {
	// usa-se um if e um equals para comparar as palavras
				if(word.equalsIgnoreCase(invertida)) {
	// imprime a palavra original e a palavra invertida
					System.out.println(palavra + "-->" + invertida);
				}
			}
		}
	}
	
	
	// método para inverter as palavras
	public static String inverter(String palavra) {
	// array em char para as letras da palavra, do tamanho da palavra
		char[] letra = new char[palavra.length()];
	// 
		for (int i = palavra.length() -1; i >= 0; i--) {
			letra[palavra.length() -1 -i] = palavra.charAt(i);
		}
		return new String(letra);
	}
	
	// método para leitura das palavras
	public static void lerPalavra(String[] lista) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < lista.length; i++) {
			System.out.println(":");
			lista[i] = sc.next();
		}
		sc.close();
		
	}
}
