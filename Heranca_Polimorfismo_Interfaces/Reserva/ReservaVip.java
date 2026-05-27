package Heranca_Polimorfismo_Interfaces.Reserva;

public class ReservaVip extends Reserva {
    @Override
    public void Reservar(){
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
