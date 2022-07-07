package repetitivas;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = sc.nextInt();
        int posicao = 0, N;

        for (int i = 1; i <= 100; i++) {
            N = sc.nextInt();
            if (N > maior) {
                maior = N;
                posicao = i;
            }

        }

        System.out.println(maior);
        System.out.println(posicao);

    }
}
