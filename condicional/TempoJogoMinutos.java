package condicional;

import java.util.Scanner;

public class TempoJogoMinutos {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        int horaInicial,minInicial,horaFinal,minFinal,duracao=0,hinicial,hfinal;

        horaInicial = sc.nextInt();
        minInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minFinal = sc.nextInt();

        hinicial = horaInicial * 60 + minInicial;
        hfinal = horaFinal * 60 + minFinal;

        if (hinicial < hfinal){
            duracao = hfinal - hinicial;
        }

        else {
            duracao = (24 * 60 - hinicial) + hfinal;
        }

        int duracaoHoras = duracao / 60;
        int duracaoMinutos = duracao % 60;

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");

        sc.close();
    }


}
