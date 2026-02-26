import java.util.Scanner;

public class ConversorRealDolar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em dolares: ");
         Double valor = leitor.nextDouble();

        double convertendo = conversao(valor);

        System.out.println("O valor em reais convertido é " + convertendo + " Reais");

        leitor.close();
    }

    public static Double conversao(double real) {
         Double dolar = real *  5.25;
         return dolar;
    }
}
