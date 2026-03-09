package POO_pratica.Tarefas;

import java.util.ArrayList;
import java.util.List;

class listaDetarefas {

    public static void main(String[] args) {
        validacao t1 = new validacao();
        t1.descricao = "Estudar Java";
        t1.concluida = false;
 
        validacao t2 = new validacao();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;
 
        List<validacao> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
 
        for (validacao t : lista) {
            t.exibir();
    }
}
}