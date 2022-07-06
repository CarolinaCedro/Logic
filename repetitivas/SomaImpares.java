package repetitivas;

import java.util.Scanner;

public class SomaImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, somaImpar = 0;
        int maior, menor;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1 < n2) {
            menor = n1;
            maior = n2;
        } else {
            menor = n2;
            maior = n1;
        }

        for (int i = menor+1; i < maior; i++) {
            if (i % 2 != 0) {
                somaImpar+=i;
            }
        }
        System.out.println(somaImpar);
    }
}
