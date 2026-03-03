package POO_pratica.Biblioteca;

public class Biblioteca {

    public static void main(String[] args) {

        Livros livro1 = new Livros();
        livro1.nome = "Metamorfose";
        livro1.autor = "Renato money";
        livro1.numpag = 100;

        Livros livro2 = new Livros();
        livro2.nome = "A magia do habito";
        livro2.autor = "Aisten";
        livro2.numpag = 300;

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}