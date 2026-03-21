import models.Cart;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Cart> list = new ArrayList<>();
        int next;

        System.out.println("Digite o limite do cartão:");
        double limiteCartao = Double.parseDouble(scan.nextLine());

        do {
            System.out.println("Digite a descrição do produto:");
            String produto = scan.nextLine();

            System.out.println("Digite o valor da compra:");
            double valorCompra = Double.parseDouble(scan.nextLine());

            if (valorCompra > limiteCartao) {

                System.out.println("Limite insuficiente.");

            } else {
                Cart cashier = new Cart(produto, valorCompra);

                list.add(cashier);
                limiteCartao -= valorCompra;

                System.out.println("Compra realizada!");
            }
            System.out.println("Valor disponivel R$" + limiteCartao);

            System.out.println("Precione 0 para sair, ou 1 para continuar");
            next = Integer.parseInt(scan.nextLine());
        } while (next != 0);

        System.out.println("********************************");
        System.out.println();

        for (Cart cart : list) {
            System.out.println(cart);
        }

        System.out.println();
        System.out.println("********************************");
    }
}

