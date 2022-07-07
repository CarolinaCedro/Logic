package repetitivas;

import java.util.Scanner;

public class DividindoXporY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,X,Y;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            X = sc.nextInt();
            Y = sc.nextInt();


            if (Y == 0){
                System.out.println("divisao impossivel");
            }else {
                double div = (double) X/Y;
                System.out.printf("%.1f%n",div);
            }

        }
    }
}
