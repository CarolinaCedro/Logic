//Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
//O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
//e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
//mostrar o valor do troco a ser devolvido ao cliente.

import java.util.Scanner;

public class Troco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoUnitario,qtdProduto,valorRecebidoCliente,troco,contaTotal;

        System.out.println("Entre com o preço do produto: ");
        precoUnitario = sc.nextDouble();

        System.out.println("Qual a quantidade do produto: ");
        qtdProduto = sc.nextDouble();

        System.out.println("Entre com o valor em pagamento: ");
        valorRecebidoCliente = sc.nextDouble();

        contaTotal = (precoUnitario * qtdProduto);
        troco = (valorRecebidoCliente - contaTotal);

        System.out.println("Preço unitario do produto: "+precoUnitario);
        System.out.println("Quantidade comprada: "+qtdProduto);
        System.out.println("Dinheiro recebido :"+valorRecebidoCliente);
        System.out.println("TROCO: "+troco);


    }
}
