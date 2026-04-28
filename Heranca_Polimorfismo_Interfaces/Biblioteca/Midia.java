package Heranca_Polimorfismo_Interfaces.Biblioteca;

public class Midia {
    protected String titulo;
    protected int ano;

    public Midia(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }


    public void InnerMidia() {
        System.out.printf("LIB-%s, ANO DE PUBLICACÃO-%i", titulo, ano); 
    }

    public String gerarCodigo() {
        return "LIB-" + titulo.substring(0, 3) + ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return ano;
    }
}
