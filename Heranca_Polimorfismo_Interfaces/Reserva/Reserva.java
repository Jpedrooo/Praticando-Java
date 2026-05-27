package Heranca_Polimorfismo_Interfaces.Reserva;

public class Reserva {
    public void Reservar(){
        System.out.println("Reserva realizada" );
    }
    public void Reservar(String data){
        System.out.println("Reserva feita para o dia " + data );
    }
    public void Reservar(String data, int pessoas){
        System.out.println("Reserva feita para o dia " + data + " para " + pessoas + " pessoas" );
    }
}
