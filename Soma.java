//Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
//números.

import java.util.Scanner;

import static java.time.Clock.system;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,x;

        System.out.println("Entre com um numero :");
        n = sc.nextInt();

        System.out.println("Entre com outro numero :");
        x = sc.nextInt();
        System.out.println("A soma dos números é: "+(n+x));

    }
}
