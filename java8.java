package java8;

import java.util.Scanner;

public class java8 {

    public static void main (String[]args){

        int numero, soma=0, mediaMult = 0, quantidadeNum =0;
        Scanner scan = new Scanner(System.in);


       do {
           System.out.println("\nDigite um número: ");
           numero = scan.nextInt();
       }
       while (numero !=0);

       if (numero % 3 ==0){
          quantidadeNum++;
          soma = soma + numero;
          mediaMult = soma / quantidadeNum;

       }
        System.out.println("\nMédia dos números múltiplos de 3:" + quantidadeNum);










	}
}
