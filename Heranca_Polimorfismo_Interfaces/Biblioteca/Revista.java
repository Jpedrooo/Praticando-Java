package Heranca_Polimorfismo_Interfaces.Biblioteca;

public class Revista extends Midia{
    private String edicao;

    public Revista(String titulo, int ano, String edicao){
        super(titulo, ano);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }
 
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Revista: \"" + getTitulo() + "\" - Edição: " + edicao);
    }
}
