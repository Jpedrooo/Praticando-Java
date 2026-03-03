package POO_pratica.Biblioteca;


public class Livros {
    public String nome;
    public String autor;
    public int numpag;

    public void exibirInformacoes(){
        System.out.printf("Título: %s | Autor: %s | Páginas: %d%n", nome, autor, numpag);
    }
}
