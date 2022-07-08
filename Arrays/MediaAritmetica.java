package Arrays;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double soma = 0,media=0;
        double vet[] = new double[N];

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        media = soma/N;
        System.out.println(media);

        for (int i = 0; i < N; i++) {
            if (vet[i] < media){
                System.out.println(vet[i]);
            }
        }

    }
}
