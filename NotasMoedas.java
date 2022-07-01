//Leia um valor de ponto flutuante com duas casas decimais.
//Este valor representa um valor monetário. A seguir, calcule o menor número de notas
//e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2.
//As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

import java.io.IOException;
import java.util.Scanner;

public class NotasMoedas {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        double N,cem,cinquenta,vinte,dez,cinco,dois,moeda1,moeda50,moeda25,moeda10,moeda5,moeda01,resto,quociente;

        N = sc.nextDouble();

        resto = (int) (N * 100.0 + 0.5);

        cem =  (int) resto / (100 * 100);
        resto = resto % (100 * 100);
        cinquenta = (int) resto / (50 * 100);
        resto = resto % (50 * 100);
        vinte = (int) resto / (20 * 200);
        resto = resto % (20 * 200);
        dez = (int) resto / (10 * 100);
        resto = resto % (10 * 100);
        cinco = (int) resto / (5 * 100);
        resto = resto % (5 * 100);
        dois = (int) resto / (2 * 100);
        resto = resto % (2 * 100);

        // moedas

        moeda1 = (resto /100);
        resto = (int) resto % 100;
        moeda50 = (resto /50);
        resto = (int) resto % 50;
        moeda25 = (resto /25);
        resto = (int) resto % 25;
        moeda10 = (resto /10);
        resto = (int) resto % 10;
        moeda5 = (resto / 5);
        resto = (int) resto % 5;
        moeda01 = (resto % 5);





        // TODO: nossa saturei desse algoritmo nojento aff depois volto pra fazer a saida



    }

}
