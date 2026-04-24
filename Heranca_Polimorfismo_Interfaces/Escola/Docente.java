package Heranca_Polimorfismo_Interfaces.Escola;
public class Docente extends Pessoa{
    private String diciplina;

    public Docente(String nome, int idade, String diciplina) {
        super(nome, idade);
        this.diciplina = diciplina;
    }

    public void identificador(){
        System.out.printf("Nome: %s - Idade: %s - Diciplina: %s", nome, idade, diciplina);
    }

}

