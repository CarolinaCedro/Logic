package condicional;

import java.util.Scanner;

public class ParesImparesPositivosNegativos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4, n5, pares = 0, impares = 0, positivos = 0, negativos = 0;

        n1 = sc.nextInt();
        if (n1 % 2 == 0) {
            pares += 1;
        } else {
            impares += 1;
        }
        if (n1 <= 0) {
            negativos += 1;
        } else {
            positivos += 1;
        }

        n2 = sc.nextInt();
        if (n2 % 2 == 0) {
            pares += 1;
        } else {
            impares += 1;
        }
        if (n2 <= 0) {
            negativos += 1;
        } else {
            positivos += 1;
        }

        n3 = sc.nextInt();
        if (n3 % 2 == 0) {
            pares += 1;
        } else {
            impares += 1;
        }
        if (n3 <= 0) {
            negativos += 1;
        } else {
            positivos += 1;
        }

        n4 = sc.nextInt();
        if (n4 % 2 == 0) {
            pares += 1;
        } else {
            impares += 1;
        }
        if (n4 <= 0) {
            negativos += 1;
        } else {
            positivos += 1;
        }

        n5 = sc.nextInt();
        if (n5 % 2 == 0) {
            pares += 1;
        } else {
            impares += 1;
        }
        if (n5 <= 0) {
            negativos += 1;
        } else {
            positivos += 1;
        }


        System.out.printf("%d valor(es) par(es)%n", pares);
        System.out.printf("%d valor(es) impar(es)%n", impares);
        System.out.printf("%d valor(es) positivo(s)%n", positivos);
        System.out.printf("%d valor(es) negativo(s)%n", negativos);

    }
}
