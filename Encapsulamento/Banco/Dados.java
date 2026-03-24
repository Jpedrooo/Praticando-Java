package Encapsulamento.Banco;

public class Dados {
    public static void main(String[] args) {
        Alterar user1 = new Alterar();
        user1.setnome("Jorgin rei delas");
        user1.setsenha(12345);

        user1.alterarsenha(12345, 1237);


    }
}
