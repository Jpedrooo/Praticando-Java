package Heranca_Polimorfismo_Interfaces.Plataforma_not;

class Pix extends Sis_pagamento {
    public Pix(double valor) {
        super(valor);
    }
 
    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento via Pix de R$%.2f confirmado\n",
                Pagamento);
    }
}