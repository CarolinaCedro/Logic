package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class ConjuntoDados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char sexo[] = new char[N];
        double altura[] = new double[N];
        double maior = altura[0], menor = altura[0], cont = 0, contMedia = 0, aux = 0, media = 0;

        for (int i = 0; i < N; i++) {
            altura[i] = sc.nextDouble();
            sc.nextLine();
            sexo[i] = sc.next().charAt(0);

            if (sexo[i] == 'M') {
                cont++;
            } else {
                contMedia += altura[i];
                aux++;
            }
        }

        for (int i = 0; i < N; i++) {
            if (altura[i] > maior){
                maior = altura[i];
            }
        }
        menor = maior;
        for (int i = 0; i < N; i++) {
            if (altura[i] < menor){
                menor = altura[i];
            }
        }

        media = (double) contMedia / aux;


        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", media);
        System.out.printf("Numero de homens = %.0f", cont);

    }
}
