package POO_pratica.Livraria;

public class calculador {
    String titulo;
    int dias_de_atraso;
    double preco;


    void calcular(){
        double multa = dias_de_atraso * 2.50;
        double novo_valor = preco + multa;
        System.out.println("Livro: " + titulo + " | Multa por " + dias_de_atraso +  " dias de atraso: " + multa + " | novo valor: " + novo_valor);
    }
}
