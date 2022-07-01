//Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
//combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
//médio do carro, com três casas decimais.

import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distanciaPercorrida,totalCombustivelGasto,consumoMedio;

        System.out.println("Distancia total em Km: ");
        distanciaPercorrida = sc.nextDouble();

        System.out.println("Total de combustivel gasto: ");
        totalCombustivelGasto = sc.nextDouble();

        consumoMedio = (distanciaPercorrida / totalCombustivelGasto);

        System.out.println("Distancia percorrida: "+distanciaPercorrida);
        System.out.println("Combustível gasto: "+totalCombustivelGasto);
        System.out.printf("Consumo medio = %.3f",consumoMedio);

    }
}
