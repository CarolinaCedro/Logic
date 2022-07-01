//Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
//
//Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
//Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
// Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

import java.io.IOException;
import java.util.Scanner;

public class IdadeDias {

    public static void main (String [] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        int N,anos,meses,dias,resto;

        N = sc.nextInt();

        anos = N/365;
        resto = N % 365;
        meses = resto/30;
        resto = resto % 30;
        dias = resto % 30;

        System.out.println(anos+" ano(s)");
        System.out.println(meses+" mes(es)");
        System.out.println(dias+" dia(s)");

    }


}
