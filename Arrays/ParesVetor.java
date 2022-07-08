package Arrays;

import java.util.Scanner;

public class ParesVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int vet[] = new int[N], total = 0;

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                System.out.printf(" %d",vet[i]);
                total = total + 1;
            }
        }
        System.out.println("\n"+total);
    }
}
