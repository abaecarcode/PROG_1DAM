package Ejercicios.POO_1_Intermedios.Ejemplo_Procesado_de_Pagos;

public interface ProcesadorPago {

    // Metodo que me obliga a implementar la realización de un cobro
    void procesarPago(double cantidad);

    // Metodo que me obliga a implementar la cancelacion de un cobro
    void cancelarPago();
}
