package Encapsulamento.Mercado;

public class Principal {
    public static void main(String[] args) {
        estoque cliente1 = new estoque();
        cliente1.setnome("Jorge");
        cliente1.setpreco(-1);

         System.out.printf("Produto: %s\nPreço: %.2f\n", cliente1.getNome(), cliente1.getPreco());
        

    }
}
