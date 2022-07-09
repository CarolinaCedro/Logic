package Matrizes;



import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] Matriz = new double[4][4];
        double vet[] = new double[4];
        double somaLinha = 0;

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                Matriz[i][j] = sc.nextDouble();
            }

        }

        for (int i = 0; i < Matriz.length; i++) {
            somaLinha = 0;
            for (int j = 0; j < Matriz.length; j++) {
                somaLinha *= Matriz[i][j];
                vet[i] = somaLinha;
            }
        }

        double aux = vet[0];
        for (int i = 0; i < vet.length; i++) {
            aux = i;
            if (vet[i] % aux == 0) {
                System.out.printf("%d multipla%n",i);

            }
        }

    }
}
