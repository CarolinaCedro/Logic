package Arrays;

import java.util.Scanner;

public class MediaAritmeticaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int somaPares=0,cont=0;
        int vet[] = new int[N];
        double media;

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();

            if (vet[i] % 2 == 0){
                somaPares+=vet[i];
                cont++;
            }
        }

        media = somaPares/cont;
        System.out.println(media);
        
    }
}
