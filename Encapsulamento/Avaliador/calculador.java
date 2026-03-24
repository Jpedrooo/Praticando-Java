package Encapsulamento.Avaliador;

import java.util.ArrayList;

public class calculador {
    public ArrayList<Integer> listaAvaliacoes = new ArrayList<>();
    private double media;

    public void adionarNota(int nota){
        if(nota < 1 || nota > 5){
            System.out.println("Nota invalida.todas as notas devem ser 1 e 5");
            return;
        }else{
            listaAvaliacoes.add(nota);
        }
    }

    public double calculadorr(){
        if (listaAvaliacoes.isEmpty()) {
        return 0.0; 
    }
    int soma = 0;
    for (int nota:listaAvaliacoes){
        soma += nota;
    }
    this.media = (double) soma / listaAvaliacoes.size();
    return this.media;

    }
}
