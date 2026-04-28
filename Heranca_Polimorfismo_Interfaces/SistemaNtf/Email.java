package Heranca_Polimorfismo_Interfaces.SistemaNtf;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto){
        super(destinatario, mensagem);
        this.assunto = assunto;
        
    }

    @Override
    public void enviar(){
        System.out.printf("Enviando Email para:"+ getDestinatario() +
                  "\n Assunto: "+ assunto + 
                  "\n Corpo: " + getMensagem());
    }
}
