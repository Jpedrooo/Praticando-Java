package POO_pratica.Livraria;

public class recepcao {
    public static void main(String[] args) {
        calculador livro1 = new calculador();
        livro1.titulo = "6 dicas";
        livro1.dias_de_atraso = 6;
        livro1.preco = 39.90;

        livro1.calcular();
    }
}
