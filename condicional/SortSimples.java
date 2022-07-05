package condicional;

import java.util.Scanner;

public class SortSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3,a=0,b=0,c=0;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3){
           c = n1;
           if (n2 > n3){
               b = n2;
               a = n3;
           }else{
               b = n3;
               a = n2;
           }
        } else if (n2 > n1 && n2 > n3) {
            c = n2;

            if (n1 > n3){
                b = n1;
                a = n3;
            }else{
                b = n3;
                a = n1;
            }
            
        } else if (n3 > n1 && n3 > n2) {
            c = n3;

            if (n1 > n2){
                b = n1;
                c = n2;
            }else{
                b = n2;
                c = n1;
            }

        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
