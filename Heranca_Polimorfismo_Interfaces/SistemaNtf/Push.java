package Heranca_Polimorfismo_Interfaces.SistemaNtf;

public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String titulo, String mensagem){
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    public void enviar(){
        System.out.printf("Enviando Push para: " + getDestinatario() + //
                        "Título: "+ titulo + //
                        "Conteúdo: " + getMensagem());
    }
    
}
