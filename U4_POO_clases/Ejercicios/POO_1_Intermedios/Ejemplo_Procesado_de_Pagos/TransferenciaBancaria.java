package Ejercicios.POO_1_Intermedios.Ejemplo_Procesado_de_Pagos;

public class TransferenciaBancaria implements ProcesadorPago {

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago de " + cantidad + " mediante transferencia bancaria.");
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando el pago a través de transferencia bancaria.");
    }
}
