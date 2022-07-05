package condicional;

import java.util.Locale;
import java.util.Scanner;

public class TiposTriangulos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float  n1,n2,n3;
        double A,B,C;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();

        if (n1 > n2 && n1 > n3){
            A = n1;
            if (n2 > n3){
                B = n2;
                C = n3;
            }else{
                B = n3;
                C = n2;
            }
        }else if (n2 > n3) {
            A = n2;
            if (n1 > n3) {
                B = n1;
                C = n3;
            }
            else {
                B = n3;
                C = n1;
            }
        }
        else {
            A = n3;
            if (n1 > n2) {
                B = n1;
                C = n2;
            }
            else {
                B = n2;
                C = n1;
            }
        }

        if (A >= A + B){
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(A,2) == (Math.pow(B,2)+Math.pow(C,2))) {
            System.out.println("TRIANGULO RETANGULO");
        }else if(Math.pow(A,2) > (Math.pow(B,2)+Math.pow(C,2)) ){
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if (Math.pow(A,2) < (Math.pow(B,2)+Math.pow(C,2)) ){
            System.out.println("TRIANGULO ACUTANGULO");
        }else if( A == B && A == C && B == C && B == A && C == A && C == B){
            System.out.println("TRIANGULO EQUILATERO");
        }

        if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if (A == B || A == C || B == C) {
            System.out.println("TRIANGULO ISOSCELES");
        }
        sc.close();
    }
}
