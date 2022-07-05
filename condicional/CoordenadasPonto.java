package condicional;

import java.util.Locale;
import java.util.Scanner;

public class CoordenadasPonto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float x,y,coordernadas=0;


        if (coordernadas >= 0){ //if pai

            if (coordernadas == 1){ //if filho simples
                System.out.println("igual a 1");
            }

            if (coordernadas % 2 == 0){ //if filho com condiçoes
                System.out.println("é par");
            }else if (coordernadas > 0){
                System.out.println("Positivo");
            }else {
                System.out.println("não é par");
            }

        }else{ //else pai
            System.out.println("Numero negativo");
        }


    }
}




