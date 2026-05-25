package Heranca_Polimorfismo_Interfaces.Plataforma_not;

public class Sis_pagamento {
    protected Double Pagamento;

    public Sis_pagamento(Double Pagamento){
        this.Pagamento = Pagamento;
        
    }

    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado\n",
                Pagamento, calcularTaxa());
    }

     public double calcularTaxa() {
        return Pagamento * 0.0;
    }
}
