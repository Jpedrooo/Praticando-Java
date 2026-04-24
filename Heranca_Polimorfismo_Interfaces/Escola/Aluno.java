
package Heranca_Polimorfismo_Interfaces.Escola;

 public class Aluno {
    private String nome;
    private String tipo;
    
    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void identificador(){
        System.out.printf("Aluno: %s - Tipo: %s", nome, tipo);
    }

}

 