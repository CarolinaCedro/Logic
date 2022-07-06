package condicional;

import java.util.Scanner;

public class Pares5Numeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3,n4,n5,pares=0;

        n1 = sc.nextInt();
        if (n1 % 2 == 0){
            pares+=1;
        }
        n2 = sc.nextInt();
        if (n2 % 2 == 0){
            pares+=1;
        }
        n3 = sc.nextInt();
        if (n3 % 2 == 0){
            pares+=1;
        }
        n4 = sc.nextInt();
        if (n4 % 2 == 0){
            pares+=1;
        }
        n5 = sc.nextInt();
        if (n5 % 2 == 0){
            pares+=1;
        }

        System.out.printf("%d valores pares%n",pares);

    }
}
