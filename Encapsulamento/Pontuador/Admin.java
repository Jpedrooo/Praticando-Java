package Encapsulamento.Pontuador;

public class Admin {
    private String nome;
    private int pontos;
    private String nivel; 

    
    public int getPontos() {
        return pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    private void setStatus(String novoStatus) {
        this.nivel = novoStatus;
    }

    
    public void ganharPontos(int valor) {
        if (valor > 0) {
            this.pontos += valor; 
            atualizarNivel();     
        } else {
            System.out.println("O valor deve ser maior que 0");
        }
    }

    
    private void atualizarNivel() {
        if (this.pontos >= 1000) {
            setStatus("Nível Máximo");
        } else if (this.pontos > 0) {
            int nivelCalculado = (this.pontos / 100) + 1;
            setStatus("Nível " + nivelCalculado);
        } else {
            setStatus("Sem Nível");
        }
    }
}