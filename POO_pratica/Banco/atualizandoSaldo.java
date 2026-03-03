package POO_pratica.Banco;

class ContaDigital {
    double saldo;
 
    void zerarSaldo() {
        saldo = 0.0;
    }
 
    void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }
}