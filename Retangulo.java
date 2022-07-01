//Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
//da área, perímetro e diagonal deste retângulo.

import java.util.Scanner;
import java.lang.Math;

public class Retangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double baseRetangulo,alturaRetangulo,area,perimetro,diagonal;

        System.out.println("Entre com a base do retângulo: ");
        baseRetangulo = sc.nextDouble();

        System.out.println("Entre com a altura de um retângulo: ");
        alturaRetangulo = sc.nextDouble();

        area = (baseRetangulo * alturaRetangulo);
        perimetro = 2 * (alturaRetangulo + baseRetangulo);
        diagonal = Math.sqrt(Math.pow(baseRetangulo,2)+ Math.pow(alturaRetangulo,2));

        System.out.println("A Área do retângulo é: "+area);
        System.out.println("O perimetro do retângulo é: "+perimetro);
        System.out.printf("A Diagonal do retângulo é: %.4f",diagonal);
    }
}
