package Arrays;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class SistemaLucro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double lucroTotal = 0, valorTotalVenda = 0, valorTotalCompra = 0, lucroAbaixo10 = 0, lucro10e20 = 0, lucroAcima20 = 0;

        String produto[] = new String[N];
        double precoC[] = new double[N];
        double precoV[] = new double[N];

        for (int i = 0; i < N; i++) {
            sc.nextLine();
            produto[i] = sc.nextLine();
            precoC[i] = sc.nextDouble();
            precoV[i] = sc.nextDouble();
            lucroTotal += (precoC[i] - precoV[i]);
            valorTotalVenda += precoV[i];
            valorTotalCompra += precoC[i];

            double percentual = (lucroTotal / precoC[i]) * 100.0;
            if (percentual < 10.0) {
                lucroAbaixo10++;
            } else if (percentual <= 20.0) {
                lucro10e20++;
            } else {
                lucroAcima20++;
            }
        }


        System.out.println("Lucro abaixo de 10%: " + lucroAbaixo10);
        System.out.println("Lucro entre de 10% e 20%: " + lucro10e20);
        System.out.println("Lucro acima de 20%: " + lucroAcima20);
        System.out.printf("Valor total de compra: %.2f%n", valorTotalCompra);
        System.out.printf("Valor total de venda: %.2f%n", valorTotalVenda);
        System.out.printf("Lucro total: %.2f%n", Math.abs(lucroTotal));

    }
}
