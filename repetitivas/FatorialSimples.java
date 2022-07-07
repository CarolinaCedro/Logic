package repetitivas;

import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, fat=1;

        N = sc.nextInt();

        for (int i = 1; i <=N; i++) {
            fat = fat*i;
        }

        System.out.println(fat);
    }
}
