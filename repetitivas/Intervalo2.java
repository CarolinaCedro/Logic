package repetitivas;

import java.util.Scanner;

public class Intervalo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, in=0,out=0;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            }else{
                out++;
            }


        }

        System.out.println(in+" in");
        System.out.println(out+" out");

    }
}



