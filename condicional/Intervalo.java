package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero;

        numero = sc.nextDouble();

        if (numero >= 0 && numero <= 25.0000){
            System.out.println("Intervalo [0,25]");
        }else if (numero > 25.0000 && numero <= 50.0000){
            System.out.println("Intervalo (25,50]");
        }else if (numero > 50.0000 && numero <= 75.0000){
            System.out.println("Intervalo (50,75]");
        }else if (numero > 75.0000 && numero <= 100.0000){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }

    }
}
