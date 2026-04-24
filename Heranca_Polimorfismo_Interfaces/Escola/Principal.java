package Heranca_Polimorfismo_Interfaces.Escola;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rafael", 17, 7.1, "Regular");
        Aluno aluno2 = new Aluno("jorge", 20, 9.1, "Regular");

        Docente docente1 = new Docente("Cleber", 35, "Portugues");
        Docente docente2 = new Docente("Thiago", 40, "matematica");

        aluno1.identificador();
        aluno2.identificador();

        docente1.identificador();
        docente2.identificador();
    }
}
