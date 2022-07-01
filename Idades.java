//Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
//nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.

import java.util.Scanner;



public class Idades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaIdade;

        System.out.println("Entre com seu Nome: ");
        String nomePrimeira = sc.nextLine();
        System.out.println("Entre com sua Idade: ");
        int idadePrimeira =sc.nextInt();
        sc.nextLine();
        System.out.println("Entre com outro Nome: ");
        String nomeSegunda = sc.nextLine();
        System.out.println("Entre com outra Idade: ");
        int idadeSegunda =sc.nextInt();


        System.out.println("Dados da primeira pessoa: ");
        System.out.println("Nome: "+nomePrimeira);
        System.out.println("Idade: "+idadePrimeira);
        System.out.println();

        System.out.println("Dados da segunda pessoa: ");
        System.out.println("Nome: "+nomeSegunda);
        System.out.println("Idade: "+idadeSegunda);
        System.out.println();

        mediaIdade = (idadePrimeira + idadeSegunda)/2;

        System.out.println("A idade média de "+nomePrimeira+" e "+nomeSegunda+" é de "+mediaIdade+" anos");

    }
}
