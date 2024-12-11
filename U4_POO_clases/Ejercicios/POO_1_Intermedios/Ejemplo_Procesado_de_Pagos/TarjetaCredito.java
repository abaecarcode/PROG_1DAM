package Ejercicios.POO_1_Intermedios.Ejemplo_Procesado_de_Pagos;

public class TarjetaCredito implements ProcesadorPago {

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago de " + cantidad + " mediante tarjeta de credito.");
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando el pago a través de tarjeta de credito.");
    }
}
