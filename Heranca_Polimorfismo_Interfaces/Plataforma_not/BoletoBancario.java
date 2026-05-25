package Heranca_Polimorfismo_Interfaces.Plataforma_not;

class BoletoBancario extends Sis_pagamento {
    public BoletoBancario(double Pagamento) {
        super(Pagamento);
    }
 
    @Override
    public void confirmarPagamento() {
        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)\n",
                Pagamento, calcularTaxa());
    }
 
    @Override
    public double calcularTaxa() {
        return Pagamento * 0.01;
    }
}