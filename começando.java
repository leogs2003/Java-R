package aprendendo;

import java.util.Scanner;

public class começando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int anos, meses, dias, totais;
		System.out.println("Entre com quantos dias de vida você possui até a data de hoje: ");
		totais = leia.nextInt();

		anos = totais / 365;
		meses = 30 % anos;
		dias = (totais % 365) % 30;

		System.out.println("Parabéns você possui: " + anos + " Anos " + meses + " Meses e " + dias + " dias!!!");

	}

}
