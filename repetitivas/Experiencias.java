package repetitivas;

import java.util.Scanner;

public class Experiencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int totalCobaias=0,totalCoelhos=0,totalRatos=0,totalSapos=0;
        double percentualCoelhos=0,percentualRatos=0,percentualSapos=0;

        for (int i = 0; i < N; i++) {
            int quantia = sc.nextInt();
            char Tipo =  sc.next().charAt(0);

            totalCobaias+=quantia;

            if (Tipo == 'C'){
               totalCoelhos+=quantia;

            } else if (Tipo == 'R') {
                totalRatos+=quantia;

            } else if (Tipo == 'S') {
                totalSapos+=quantia;

            }

        }

        percentualCoelhos = (double) totalCoelhos/totalCobaias*100;
        percentualRatos = (double) totalRatos/totalCobaias*100;
        percentualSapos = (double) totalSapos/totalCobaias*100;

        System.out.printf("Total: %d cobaias%n",totalCobaias);
        System.out.printf("Total de coelhos: %d%n",totalCoelhos);
        System.out.printf("Total de ratos: %d%n",totalRatos);
        System.out.printf("Total de sapos: %d%n",totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n",percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n",percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n",percentualSapos);
    }
}
