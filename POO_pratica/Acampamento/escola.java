package POO_pratica.Acampamento;

public class escola {
    public static void main(String[] args) {
        alunos aluno1 = new alunos();
        aluno1.nome = "Joao";
        aluno1.nota1 = 1.7;
        aluno1.nota2 = 10.0;

        alunos aluno2 = new alunos();
        aluno2.nome = "guilherme";
        aluno2.nota1 = 6.7;
        aluno2.nota2 = 8.4;

        aluno2.exibirDados();
        aluno2.mediaNotas();
        aluno2.situacao();

        aluno1.exibirDados();
        aluno1.mediaNotas();
        aluno1.situacao();

    }
}
