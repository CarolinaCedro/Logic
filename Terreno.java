//Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
//casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
//o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
//duas casas decimais.

import java.util.Scanner;

public class Terreno {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        double largura,comprimento,valorMetroQuadrado,area,preco;

        System.out.println("Entre com a largura do terreno: ");
         largura  = sc.nextDouble();

        System.out.println("Entre com o comprimento do terreno: ");
         comprimento = sc.nextDouble();

        System.out.println("Entre com o valor do metro quadrado: ");
        valorMetroQuadrado = sc.nextDouble();

         area = (largura * comprimento);
         preco = (area * valorMetroQuadrado);

        System.out.println("A área do terreno é: "+area);
        System.out.println("O preço do terreno por metro quadrado é: "+preco);

    }
}
