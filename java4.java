package java4;

import java.util.Scanner;

public class java4 {

	public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
		
        int idade;
		String categoria;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInforme sua idade:");
		idade = ler.nextInt();
		
		if (idade >= 18 && idade <= 18) {
			categoria = "Adulto";
	
		} else if (idade >= 15 && idade <= 17) {
			categoria = "Juvenil";
		
		} else if (idade >= 10 && idade <= 14) {
			categoria = "Infantil";
		
		} else {
			categoria = "Não é possível categorizar a idade inserida.";
		}

		System.out.println("\nIdade: " + idade + "\nCategoria: " + categoria);
		ler.close();

	}

}
