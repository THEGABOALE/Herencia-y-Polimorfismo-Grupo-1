package models;

import interfaces.Combustible;

public class Camion extends Vehiculo implements Combustible {
    private double capacidadCarga;
    private double nivelCombustible;
    private static final String TIPO_COMBUSTIBLE = "Diésel";

    public Camion(String marca, String modelo, double capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
        this.nivelCombustible = 0;
    }

    @Override
    public void mover() { /*Permite mover el camion si hay combustible suficiente*/
        if (nivelCombustible > 0) {
            System.out.println("El camión " + marca + " " + modelo + " transporta carga pesada por la autopista.");
            nivelCombustible -= 10;
        } else {
            System.out.println("El camión " + marca + " " + modelo + " no puede moverse sin combustible.");
        }
    }

    @Override
    public void recargar(double cantidad) /*Podemos recagra con la cantidad indicada*/
    {
        nivelCombustible += cantidad;
        System.out.println("Recargando " + cantidad + " litros de " + TIPO_COMBUSTIBLE +
                " en el camión " + marca + " " + modelo);
    }

    @Override /*Devuelve el tipo de combustible usado por el camión*/
    public String getTipoCombustible() {
        return TIPO_COMBUSTIBLE;
    }

    /*Returna el nvel de combustible del camion*/
    public double getNivelCombustible() {
        return nivelCombustible;
    }
    /*Simula la carga del camion*/
    public void cargarMercancia() {
        System.out.println("Cargando " + capacidadCarga + " toneladas en el camión " + marca + " " + modelo);
    }
/*Con esto obtenemos la capacidad de carga del camion*/
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}
