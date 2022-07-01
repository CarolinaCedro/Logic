//Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
//círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟 . Você pode
//usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
//diretamente o valor 3.14159.

import java.util.Scanner;
import java.lang.Math;

public class Circulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio,area;

        System.out.println("Entre com o raio de um circulo: ");
        raio = sc.nextDouble();

        area = (Math.PI * Math.pow(raio,2));

        System.out.printf("AREA: %.3f",area);
    }
}
