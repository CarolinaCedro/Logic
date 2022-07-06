package condicional;

import java.util.Scanner;

public class NumerosPositivos {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double n1,n2,n3,n4,n5,n6,cont=0;

        n1 = sc.nextDouble();
        if (n1 >= 0){
            cont+=1;
        }
        n2 = sc.nextDouble();
        if (n2 >= 0){
            cont+=1;
        }
        n3 = sc.nextDouble();
        if (n3 >= 0){
            cont+=1;
        }
        n4 = sc.nextDouble();
        if (n4 >= 0){
            cont+=1;
        }
        n5 = sc.nextDouble();
        if (n5 >= 0){
            cont+=1;
        }
        n6 = sc.nextDouble();
        if (n6 >= 0){
            cont+=1;
        }

        System.out.printf("%.0f valores positivos%n",cont);

    }

}
