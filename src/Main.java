import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int next = 1;
        System.out.println("Digite o limite do cartão:");
        double limiteCartao = Double.parseDouble(scan.nextLine());

        while (next != 0) {
            System.out.println("Digite a descrição do produto:");
            String produto = scan.nextLine();

            System.out.println("Digite o valor da compra:");
            double valorCompra = Double.parseDouble(scan.nextLine());
            if (valorCompra > limiteCartao) {
                System.out.println("Limite insuficiente.");
            } else {
                System.out.println("Compra realizada!");
                list.add(produto);
                limiteCartao -= valorCompra;
            }

            System.out.println("Precione 0 para sair, ou 1 para continuar");
            next = Integer.parseInt(scan.nextLine());
        }

        System.out.println("Você comprou: " + list);
        System.out.println("Seu saldo ficou: R$" + limiteCartao);
    }
}

