package repetitivas;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        double a,b,c;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            double mediaPonderada = (((a*2)+(b*3)+(c*5))/10);
            System.out.printf("%.1f%n",mediaPonderada);

        }

    }
}
