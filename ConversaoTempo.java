/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
e informe-o expresso no formato horas:minutos:segundos.
*/

import java.io.IOException;
import java.util.Scanner;

public class ConversaoTempo {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int N,horas,min,seg,resto;

        N = sc.nextInt();

        horas = N/3600;
        resto = N % 3600;
        min = resto/60;
        seg = resto % 60;

        System.out.println(horas+":"+min+":"+seg);
    }
}
