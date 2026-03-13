package Encapsulamento.Oficina;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car_cad carro1 = new Car_cad();
        carro1.cadastrando("palio", "QAF",  LocalDate.parse("2025-12-31"));

        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Placa: " + carro1.getPlaca());
        System.out.println("Ano: " + carro1.getAno());

    }
}
