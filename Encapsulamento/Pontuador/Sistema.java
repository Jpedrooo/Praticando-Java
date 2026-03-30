package Encapsulamento.Pontuador;


public class Sistema {
   public static void main(String[] args) {
    Admin adm = new Admin();
    adm.setNome("João");
    adm.ganharPontos(450); // Ele já calcula o nível internamente

    // O print fica aqui, fora da classe!
    System.out.println("O " + adm.getNome() + " está no " + adm.getNivel() + " com " + adm.getPontos() + " pontos.");
   }
    
}
