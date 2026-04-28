package Heranca_Polimorfismo_Interfaces.SistemaNtf;

public class Notificacao {
    protected String destinatario;
    protected String mensagem;

    public Notificacao(String destinatario, String mensagem){
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    void enviar() {};
}
