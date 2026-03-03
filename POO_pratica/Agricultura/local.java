package POO_pratica.Agricultura;

public class local {
    public String setor;
    public double temperatura;

    void exibirInformacoes(){
        System.out.printf("Local: %s", setor);
    }

    void temperaturaformatada(){
         System.out.printf("tempoeratura: %.1f", temperatura);   
    }

    void temperaturaAlta(){
        if(this.temperatura > 37.5){
           System.out.println(" Alerta: Temperatura acima do limite!");
        }
    }
}
