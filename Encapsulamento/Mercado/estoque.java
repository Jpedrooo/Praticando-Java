package Encapsulamento.Mercado;

public class estoque {
    private String nome;
    private double preco;

    public void setnome(String nome){
        this.nome = nome;
        
    }

    public void setpreco(double valor){
        if(valor >= 0){
            preco = valor;
        }else{
            System.out.println("Preço inválido.");
        }
    }

    public double getPreco() {
        return this.preco;
    }
 
    public String getNome() {
        return this.nome;
    }
}
