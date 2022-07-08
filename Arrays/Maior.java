package Arrays;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double vet[] = new double[N];

        double maior = vet[0];
        int posicao=0;

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();

            if (vet[i] > maior) {
                maior = (int) vet[i];
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

    }
}
