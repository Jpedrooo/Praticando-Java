
package Heranca_Polimorfismo_Interfaces.Escola;

 public class Aluno extends Pessoa{
    protected Double nota;
    protected String tipo;
    
    public Aluno(String nome, int idade, Double nota, String tipo) {
        super(nome, idade);
        this.nota = nota;
        this.tipo = tipo;
    }

    public void identificador(){
        System.out.printf("Nome: %s - Idade: %s - Nota: %.2f", nome, idade, nota);
    }

}

 