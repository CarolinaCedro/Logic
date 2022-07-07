package repetitivas;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            int x = sc.nextInt();

            if (x == 0){
                System.out.println("NULL");
            } else if (x % 2 == 0 && x < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (x % 2 != 0 && x < 0) {
                System.out.println("ODD NEGATIVE");
            } else if (x % 2 != 0 && x > 0) {
                System.out.println("ODD POSITIVE");
            }else {
                System.out.println("EVEN POSITIVE");
            }
        }

    }
}




