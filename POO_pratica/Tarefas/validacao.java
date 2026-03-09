package POO_pratica.Tarefas;

public class validacao {
    String descricao;
    boolean concluida;
 
    void exibir() {
        if (concluida) {
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }
}



