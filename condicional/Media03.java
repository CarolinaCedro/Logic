package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Media03 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1,n2,n3,n4,media,notaExame,novaNota;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;

        if (media > 7.0){
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno aprovado.");
        }else if(media < 5.0){
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            notaExame = sc.nextFloat();
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n",notaExame);
            novaNota = (media + notaExame)/2;

            if (novaNota >= 5){

                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",novaNota);
            } else if (novaNota < 5) {

                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n",novaNota);
            }
        }

    }
}
