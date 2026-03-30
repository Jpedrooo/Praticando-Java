package Encapsulamento.Pontuador;

public class Admin {
    private String nome;
    private int pontos;
    private String nivel; // Alterado para private (Encapsulamento!)

    // Getters Limpos
    public int getPontos() {
        return pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    // Setters Padrão
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Encapsulado: só a própria classe decide como o status muda
    private void setStatus(String novoStatus) {
        this.nivel = novoStatus;
    }

    // Regra de Negócio: onde a ação acontece
    public void ganharPontos(int valor) {
        if (valor > 0) {
            this.pontos += valor; // Soma aqui diretamente
            atualizarNivel();     // Atualiza o nível automaticamente
        } else {
            System.out.println("O valor deve ser maior que 0");
        }
    }

    // Mudei o nome para atualizarNivel, pois ele gerencia a lógica interna
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