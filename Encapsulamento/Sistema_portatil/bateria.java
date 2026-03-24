package Encapsulamento.Sistema_portatil;

public class bateria {
    private int valor_porcento;
    private String estado;


    public void verificador_val_vali(int valor){
        if (valor < 0 || valor > 100){
            System.out.println("Valor invalido, digite um numero entra 0 e 100");
        }else{
            this.valor_porcento = valor;
        }
    }

    public void verificador_estado(){
        if (valor_porcento <= 20){
            System.out.println("Sua batera esta fraca");
            this.estado = "fraca";
        }
        else if(valor_porcento > 20 && valor_porcento < 80){
            System.out.println("Sua batera esta ok");
            this.estado = "ok";
        }
        else{
            System.out.println("Bateria cheia");
            this.estado = "cheia";
        }
    }

    public void ultimo_est(){
    if (this.estado != null && !this.estado.isEmpty()){
       System.out.println("O ultimo estado da sua batera foi " + this.estado);
    } else {
        System.out.println("Ainda não há um estado registrado para a bateria.");
    }
}
}
