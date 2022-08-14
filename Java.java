import java.util.Scanner;

public class Java {
	public static void main(String[] args) {
		
		int numero;		
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Digite um numero: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("\nO número " + numero + " é PAR.\n"
					+ "Elevando  quadrado, dá: " + Math.pow(numero, 2));
			
		} else {
			System.out.println("\nO número " + numero + " é ÍMPAR.");
		}
		
		ler.close();
	}	
}




