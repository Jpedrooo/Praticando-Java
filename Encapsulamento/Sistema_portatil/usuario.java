package Encapsulamento.Sistema_portatil;

public class usuario {
    public static void main(String[] args) {
        bateria user1 = new bateria();
        user1.verificador_val_vali(1);
        user1.verificador_estado();
        user1.ultimo_est();
    }
}
