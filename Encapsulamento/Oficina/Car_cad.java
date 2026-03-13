package Encapsulamento.Oficina;
import java.time.LocalDate;


public class Car_cad {
    private String nome;
    private String placa;
    private LocalDate ano;

    public void cadastrando(String nome ,String placa, LocalDate ano){
        this.nome = nome;
        this.placa = placa;
        this.ano = ano;
    }

    public String getModelo() {
        return nome;
    }
 
    public String getPlaca() {
        return placa;
    }
 
    public LocalDate getAno() {
        return ano;
    }
}
