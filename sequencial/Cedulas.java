//Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas)
//no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
//A seguir mostre o valor lido e a relação de notas necessárias.

import java.io.IOException;
import java.util.Scanner;

public class Cedulas {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N,cem,cinquenta,vinte,dez,cinco,dois,um,resto;

        N = sc.nextInt();

        cem = N/100;
        resto = N%100;
        cinquenta = resto/50;
        resto = resto % 50;
        vinte = resto/20;
        resto = resto % 20;
        dez = resto/10;
        resto = resto % 10;
        cinco = resto/5;
        resto = resto % 5;
        dois = resto/2;
        resto = resto % 2;
        um = resto/1;

        System.out.println(N);
        System.out.println( cem+" nota(s) de R$ 100,00");
        System.out.println( cinquenta+" nota(s) de R$ 50,00");
        System.out.println( vinte+" nota(s) de R$ 20,00");
        System.out.println( dez+" nota(s) de R$ 10,00");
        System.out.println( cinco+" nota(s) de R$ 5,00");
        System.out.println( dois+" nota(s) de R$ 2,00");
        System.out.println( um+" nota(s) de R$ 1,00");

    }

}
