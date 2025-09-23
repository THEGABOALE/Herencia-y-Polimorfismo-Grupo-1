package models;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("La moto " + marca + " " + modelo + " avanza ágilmente entre el tráfico.");
    }
}
