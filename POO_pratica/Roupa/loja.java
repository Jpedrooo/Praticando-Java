package POO_pratica.Roupa;

import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite a quantidade vendida");
        int venda = leitor.nextInt();
        
        estoque r1 = new estoque();
        r1.nome = "sapato puma";
        r1.quantidade = 3;

        estoque r2 = new estoque();
        r2.nome = "jorts";
        r2.quantidade = 7;

        r1.venda(venda);

        leitor.close();
        
    }
}
