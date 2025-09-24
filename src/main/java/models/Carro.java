package models;

import interfaces.Combustible;

/*Constructor del vehiculo*/
public class Carro extends Vehiculo implements Combustible {
    private double nivelCombustible;
    private static final String TIPO_COMBUSTIBLE = "Gasolina";

    public Carro(String marca, String modelo) {
        super(marca, modelo);
        this.nivelCombustible = 0;
    }

    @Override
    public void mover()  /* Método que mueve el carro y Si hay combustible, consume 5 litros por movimiento.*/
    {
        if (nivelCombustible > 0) {
            System.out.println("El carro " + marca + " " + modelo + " se desplaza por la carretera.");
            nivelCombustible -= 5;
        } else {
            System.out.println("El carro " + marca + " " + modelo + " no puede moverse sin combustible.");
        }
    }

    @Override
    public void recargar(double cantidad) {
        nivelCombustible += cantidad;
        System.out.println("Recargando " + cantidad + " litros de " + TIPO_COMBUSTIBLE +
                " en el carro " + marca + " " + modelo);
    }

    @Override
    public String getTipoCombustible() {
        return TIPO_COMBUSTIBLE;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    /*Simula abrir un Maletero igual que la carga del Camion en la clase Camion*/
    public void abrirMaletero() {
        System.out.println("Abriendo el maletero del carro " + marca + " " + modelo);
    }
}