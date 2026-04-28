package Heranca_Polimorfismo_Interfaces.SistemaNtf;

public class Sms extends Notificacao{

    public Sms(String destinatario, String mensagem){
        super(destinatario, mensagem);
    }

    @Override
    public void enviar(){
        System.out.printf("Enviando SMS para: "+ getDestinatario() + "\n Mensagem: " + getMensagem());
    }
}
