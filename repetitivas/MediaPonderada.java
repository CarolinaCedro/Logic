package repetitivas;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        double x1,x2,x3;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            x3 = sc.nextDouble();

            double mediaPonderada = (((x1*2)+(x2*3)+(x3*5))/10);
            System.out.printf("%.1f",mediaPonderada);

        }

    }
}
