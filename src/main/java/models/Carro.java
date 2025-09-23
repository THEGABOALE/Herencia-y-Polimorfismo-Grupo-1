package models;

public class Carro extends Vehiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El carro " + marca + " " + modelo + " está circulando por la carretera.");
    }
}

