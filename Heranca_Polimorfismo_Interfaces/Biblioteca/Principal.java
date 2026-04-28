package Heranca_Polimorfismo_Interfaces.Biblioteca;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("O Guia do Mochileiro das Galáxias", 1979, "Douglas Adams");
        Revista revista = new Revista("National Geographic", 2023, "especial");
        EBook ebook = new EBook("Clean Code", 2008, "PDF");
 
        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();
    }
}
