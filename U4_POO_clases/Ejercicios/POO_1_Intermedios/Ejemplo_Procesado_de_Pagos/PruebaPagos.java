package Ejercicios.POO_1_Intermedios.Ejemplo_Procesado_de_Pagos;

public class PruebaPagos {
    public static void main(String[] args) {

        ProcesadorPago paypal = new PayPal();
        ProcesadorPago tarjeta = new TarjetaCredito();
        ProcesadorPago transferencia = new TransferenciaBancaria();

        paypal.procesarPago(100.0);
        tarjeta.procesarPago(200.0);
        transferencia.procesarPago(99999);

        transferencia.cancelarPago();

    }
}
