import java.util.Random;

public class exe07 {

	public static void main(String[] args) {


		int[] v = new int[10];
		double media,desvio;
		
		lerDados(v);
		imprimir(v);
		media = calcularMedia(v);
		System.out.println("\nmédia = " + media);
		desvio = calcularDesvio(v, media);
		System.out.println("desvio padrão = " + desvio);
	}
	
	public static double calcularDesvio(int[] v, double media) {
		double total = 0;
		for(int i : v) {
			total += Math.pow(i - media, 2);
		}
		return Math.sqrt(total / v.length - 1);
	}
	
	public static double calcularMedia(int[] v) {
		int total = 0;
		for(int i : v) {
			total += i;
		}
		return (double) total / v.length;
	}
	
	public static void imprimir(int[] v) {
		for(int i : v) {
			System.out.print(i + " ");
		}
	}
	public static void lerDados(int[] v ) {
		Random rd = new Random();
		for(int i = 0; i < v.length; i++) {
			v[i] = rd.nextInt(0, 101);
		}
	}

}
