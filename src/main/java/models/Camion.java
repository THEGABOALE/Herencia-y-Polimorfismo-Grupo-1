package models;

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El camión " + marca + " " + modelo + " transporta carga pesada en la autopista.");
    }
}
