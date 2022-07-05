package condicional;

import java.util.Scanner;

public class Animal {

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String caracteristica1,caracteristica2,caracteristica3;

        caracteristica1 = sc.nextLine();
        caracteristica2 = sc.nextLine();
        caracteristica3 = sc.nextLine();


        if (caracteristica1.equals("vertebrado")){
            if (caracteristica2.equals("ave")){
                if (caracteristica3.equals("carnivoro")){
                    System.out.println("aguia");
                }else if (caracteristica3.equals("onivoro")){
                    System.out.println("pomba");
                }
            } else if (caracteristica2.equals("mamifero")) {
                if (caracteristica3.equals("onivoro")){
                    System.out.println("homen");
                } else if (caracteristica3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (caracteristica1.equals("invertebrado")) {

            if (caracteristica2.equals("Inseto")){
                if (caracteristica3.equals("hematofago")){
                    System.out.println("pulga");
                }else if (caracteristica3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            } else if (caracteristica2.equals("anelideo")) {
                if (caracteristica3.equals("hematofago")){
                    System.out.println("sanguessuga");
                } else if (caracteristica3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }

        }


    }

}
