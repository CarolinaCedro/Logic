//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
//A seguir, calcule e mostre o valor da conta a pagar.


import java.io.IOException;
import java.util.Scanner;

public class Lanche {

    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int cod1,cod2;
        double total;

        cod1 = sc.nextInt();
        cod2 = sc.nextInt();

        switch (cod1){
            case 1:
                System.out.printf("Total: R$ %.2f",cod2 * 4.00);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f",cod2 * 4.50);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f",cod2 * 5.00);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f",cod2 * 2.00);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f",cod2 * 1.50);
                break;

        }


    }
}
