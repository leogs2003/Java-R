package java10;

import java.util.Scanner;

public class java10
{

	public static void main(String[] args)
	{
		int[][] mat = new int[3][3];
		int soma10=0, l, c, x;
		
		Scanner leia = new Scanner (System.in);
		
		for (l=0;l<3;l++)
		{
			for (c=0;c<3;c++)
			{
				System.out.print("Preencha a matriz com valores: ");
				x=leia.nextInt();
				if (x>10)
				{
					soma10++;
				}
			}
		}
		System.out.print("Quantidade numeros maiores do que 10: "+soma10);
	}

}