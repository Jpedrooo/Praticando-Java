package Encapsulamento.Banco;

public class Alterar {
    private String nome;
    private int senha;

    public void setnome(String nome){
        this.nome = nome;
        
    }

    public void setsenha(int senhainicial){
        this.senha = senhainicial;
    }

    public void alterarsenha(int senhaAtual, int novasenha){
        if(senhaAtual == this.senha){
            this.senha = novasenha;
            System.out.print("Senha alterada com sussesso " + this.senha);
        }else{
            System.out.println("Senha invalida");
        
        }
    }
}
