package POO_pratica.Roupa;

public class estoque {
    String nome;
    int quantidade;
    

    void venda(int NumVend){
        if(NumVend < quantidade){
           int estoqueatual = quantidade - NumVend;
           System.out.println("Venda realizada. estoque atual: " + estoqueatual);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
