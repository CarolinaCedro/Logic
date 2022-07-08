package Arrays;

import java.util.Scanner;

public class PessoaMaisVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String nomes[] = new String[N];
        int idades[] = new int[N];
        int maior = idades[0];
        int posicao = 0;

        for (int i = 0; i < N; i++) {
            sc.nextLine();
            nomes[i] = sc.nextLine();
            idades[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (idades[i] > maior){
                maior = idades[i];
                posicao = i;
            }
        }

        System.out.println("Pessoa mais velha: "+nomes[posicao]);

    }
}
