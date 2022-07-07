package repetitivas;

import java.util.Scanner;

public class Multiplos13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X, Y, soma = 0, maior, menor;

        X = sc.nextInt();
        Y = sc.nextInt();

        if (X > Y) {
            menor = Y;
            maior = X;
        } else {
            menor = X;
            maior = Y;
        }

        for (int i = menor; i <=maior; i++) {

            if (i % 13 != 0) {
                soma+=i;
            }
        }

        System.out.println(soma);
    }
}
