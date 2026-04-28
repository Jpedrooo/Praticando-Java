package Heranca_Polimorfismo_Interfaces.Biblioteca;

public class EBook extends Midia {
    private String atributo;

    public EBook(String titulo, int ano, String atributo){
        super(titulo, ano);
        this.atributo = atributo;
    }

    public String getFormato() {
        return atributo;
    }
 
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Ebook: \"" + getTitulo() + "\" - Formato: " + atributo);
    }
}
