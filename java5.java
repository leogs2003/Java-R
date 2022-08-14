package Java5;
import java.util.Scanner;
public class java5 {
	public static void main(String[] args) {
	
		double a, b, c, d, r, s;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor para A: ");
		a = ler.nextInt();
		System.out.print("Informe o valor para B: ");
		b = ler.nextInt();
		System.out.print("Informe o valor para C: ");
		c = ler.nextInt();
		
		s = Math.pow((b + c), 2);
		r = Math.pow((a + b), 2);
		d = (r + s) / 2;
		
		System.out.println("\nResultado: " + d);
				
		ler.close();
	}

}
