package condicional;

import java.util.Scanner;

public class PositivosMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n1,n2,n3,n4,n5,n6,positivos=0,mediaPositivos=0;

        n1 = sc.nextDouble();
        if (n1 > 0){
            positivos+=1;
            mediaPositivos+=n1;

        }

        n2 = sc.nextDouble();
        if (n2 > 0){
            positivos+=1;
            mediaPositivos+=n2;
        }

        n3 = sc.nextDouble();
        if (n3 > 0){
            positivos+=1;
            mediaPositivos+=n3;
        }

        n4 = sc.nextDouble();
        if (n4 > 0){
            positivos+=1;
            mediaPositivos+=n4;
        }

        n5 = sc.nextDouble();
        if (n5 > 0){
            positivos+=1;
            mediaPositivos+=n5;
        }

        n6 = sc.nextDouble();
        if (n6 > 0){
            positivos+=1;
            mediaPositivos+=n6;
        }

        System.out.printf("%.0f valores positivos%n",positivos);
        System.out.printf("%.1f%n",mediaPositivos/positivos);
    }
}
