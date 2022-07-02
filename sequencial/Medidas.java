package sequencial;//Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
//com quatro casas decimais):
//a) a área do quadrado que tem lado A
//b) a área do triângulo retângulo que base A e altura B
//c) a área do trapézio que tem bases A e B, e altura C


import java.util.Scanner;
import java.lang.Math;

public class Medidas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C,area,triangulo,trapezio;

        System.out.println("Entre com 3 medidas: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        area = (A*A);
        triangulo = (A*B)/2;
        trapezio = ((A+B)*C)/2;

        System.out.println("AREA DO QUADRADO: "+area);
        System.out.println("AREA DO TRIANGULO: "+triangulo);
        System.out.println("AREA DO TRAPEZIO: "+trapezio);




    }
}
