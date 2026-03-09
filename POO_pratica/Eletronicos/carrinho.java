package POO_pratica.Eletronicos;

import java.util.ArrayList;
import java.util.List;

public class carrinho {
    public static void main(String[] args) {
        caixa i1 = new caixa();
        i1.nome = "Teclado";
        i1.preco = 1240.0;
        i1.quantidade = 7;
 
        caixa i2 = new caixa();
        i2.nome = "Mouse";
        i2.preco = 60.0;
        i2.quantidade = 2;
 
        List<caixa> carrinho = new ArrayList<>();
        carrinho.add(i1);
        carrinho.add(i2);
 
        double totalCompra = 0;
        for (caixa item : carrinho) {
            totalCompra += item.calcularTotal();

    }
     System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
}
}
