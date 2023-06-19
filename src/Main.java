import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        System.out.println("Informe o valor da compra: ");
        double valorCompra = scan.nextDouble();
        double valorFrete = 15.0;

        if (valorCompra >= 100.00) {
            System.out.println("Valor final: R$" + valorCompra);
            System.out.println("Frete nao cobrado");
        } else {
            double valorFinal = valorCompra + valorFrete;
            System.out.println("Valor final: R$" + valorFinal);
            System.out.println("Frete cobrado: R$" + valorFrete);
        }

        scan.close();
    }
}