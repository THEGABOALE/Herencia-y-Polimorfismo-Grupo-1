package models;


/*Clase abstracta que representa un vehículo genérico
    Sirve como base para carros, motos y camiones
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    /*Método abstracto que define el movimiento del vehículo. Cada subclase debe implementar su propia forma de moverse.
     */
    public abstract void mover();
}


