package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class AlunosAprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String nomes[] = new String[N];
        double nota1[] = new double[N];
        double nota2[] = new double[N];
        double medias[] = new double[N];

        for (int i = 0; i < N; i++) {
            sc.nextLine();
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();

             medias[i] = (nota1[i] + nota2[i]) / 2;
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < N; i++) {

            if (medias[i] >= 6.0){
                System.out.println(nomes[i]);
            }
        }

    }
}
