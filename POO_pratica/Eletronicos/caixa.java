package POO_pratica.Eletronicos;

public class caixa {
    String nome;
    double preco;
    int quantidade;
 
    double calcularTotal() {
        return preco * quantidade;
    }
}
