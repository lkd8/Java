import java.util.Scanner;

/* programa para ler dois valores (o primeiro valor deverá ser menor que o segundo). 
 * Seu programa deverá imprimir todos os números ímpares entre o primeiro valor e o
 * segundo (inclusive).
 */
public class while02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int valor1, valor2;

		System.out.println("Digite um valor ");
		valor1 = in.nextInt();

		System.out.println("Digite um valor menor que o primeiro ");
		valor2 = in.nextInt();

		if (valor1 > valor2) {
			System.out.println("Segundo valor inválido");

		}

		else {
			while (valor1 <= valor2) {
				if (valor1 % 2 == 1) {
					System.out.println(valor1 + "");
				}
				valor1 = valor1 + 1;
			}
		}

		in.close();
	}

}