package POO_pratica.Acampamento;

public class alunos {
    public String nome;
    public Double nota1;
    public double nota2;

    Double mediaNotas(){
        double media = (this.nota1 + this.nota2) / 2;
        return media;
    }

    void exibirDados(){
        System.out.printf("Nome: %s\nNota1:  %.1f\nNota2: %.1f\nMédia: %.1f\n", nome, nota1, nota2, mediaNotas());
    }

    void situacao(){
        if (mediaNotas() >= 7) {
            System.out.println("Aprovado\n");
        }
        else{
            System.out.println("Reprovado\n");
        }
    }
}
