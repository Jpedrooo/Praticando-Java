package Heranca_Polimorfismo_Interfaces.Plataforma_not;

public class CartaoCredito extends Sis_pagamento{

    public CartaoCredito(Double Pagamento){
        super(Pagamento);
    }
    @Override
    public void confirmarPagamento(){
       Double TaxVal = (Pagamento / 100) * 3;
       Double Taxado = Pagamento + TaxVal;
       System.out.println("Pagamento de " +  Taxado + " confirmado no Cartão de Crédito (Taxa: "+ TaxVal +")");
    }
}
