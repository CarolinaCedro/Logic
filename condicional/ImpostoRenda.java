package condicional;

import java.util.Scanner;

public class ImpostoRenda {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        double salario,impostoRenda,resto;

        salario = sc.nextDouble();

        if (salario <= 2000.00){
            impostoRenda = salario * 0.00;
        } else if (salario <= 3000.00) {
            impostoRenda = (salario - 2000)* 0.08;
        } else if (salario <= 4500.00) {
            impostoRenda = (salario - 3000)* 0.18 + 1000.0 * 0.08;
        }else {
            impostoRenda = (salario - 4500)*0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (impostoRenda == 0.0){
            System.out.println("Isento");
        }else {
            System.out.printf("R$ %.2f%n",impostoRenda);
        }


    }
}
