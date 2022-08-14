package java7;


import java.util.Scanner;

public class java7 {

    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        int idade = 0, contador2 = 0, contador5 = 0;


        while (idade != -99) {
            System.out.println("\nDigite sua idade: ");
            idade = scan.nextInt();

            if (idade<21){
               contador2++;
            }
            if (idade>50){
                contador5++;
            }

        }

        System.out.println("\nTotal de pessoas com menos de 21 anos: " + contador2);
        System.out.println("\nTotal de pessoas com mais de 50 anos: " + contador5);
}
}