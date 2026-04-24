package Heranca_Polimorfismo_Interfaces.Escola;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("joao", "Regular");
        Bolsista aluno2 = new Bolsista("Lucas");

        aluno1.identificador();
        aluno2.identificador();
    }
}
