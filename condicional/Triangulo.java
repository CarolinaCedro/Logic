package condicional;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A,B,C,triangulo,area;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if ((B - C) < A && (B + C ) > A && (C - A) < B && (C + A ) > B && (A - B) < C && (A + B ) > C ){
            triangulo = A + B + C;
            System.out.printf("Perimetro = %.1f%n",triangulo);
        }else{
            area =  ((A + B)*C)/2;
            System.out.printf("Area = %.1f%n",area);
        }
    }
}
