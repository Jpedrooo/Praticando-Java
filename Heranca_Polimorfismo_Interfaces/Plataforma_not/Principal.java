package Heranca_Polimorfismo_Interfaces.Plataforma_not;

public class Principal {
    public static void main(String[] args) {
        Sis_pagamento cartao = new CartaoCredito(250.00);
        Sis_pagamento boleto = new BoletoBancario(500.00);
        Sis_pagamento pix = new Pix(300.00);
        
        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();
 
    }
}   