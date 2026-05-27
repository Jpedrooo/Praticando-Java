package Heranca_Polimorfismo_Interfaces.Reserva;

public class Principal {
    public static void main(String[] args) {
        Reserva r = new Reserva();
        r.Reservar();
        r.Reservar("10/04");
        r.Reservar("12/04", 4);
 
        Reserva vip = new ReservaVip();
        vip.Reservar();
    }
}
