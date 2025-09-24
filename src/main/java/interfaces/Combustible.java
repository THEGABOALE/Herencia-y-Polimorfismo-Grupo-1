package interfaces;



/*Interfaz que define el comportamiento de un vehículo que utiliza combustible.*/

public interface Combustible {

    void recargar(double cantidad); /*Permite recargar una cantidad especifica de combustible*/

    String getTipoCombustible(); /*Necesitamos el tipo de combsutible del vehiculo*/
}