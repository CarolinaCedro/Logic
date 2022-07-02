//Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
//quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
//uma mensagem explicativa, conforme exemplo.

import java.util.Scanner;

public class Pagamento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome do funcionário: ");
        String Nome = sc.nextLine();

        System.out.println("Valor da hora trabalhadas: ");
        double valor = sc.nextDouble();

        System.out.println("Entre com as hora trabalhadas: ");
        double hora = sc.nextDouble();

        double pagammento = (hora * valor);

        System.out.println("Nome: " + Nome);
        System.out.println("Valor por horas: "+valor);
        System.out.println("Horas trabalhadas: "+hora);

        System.out.println("O pagamento para "+Nome+" deve ser "+pagammento);
    }
}
