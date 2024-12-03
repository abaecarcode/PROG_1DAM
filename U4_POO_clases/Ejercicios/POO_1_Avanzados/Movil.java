package Ejercicios.POO_1_Avanzados;

public class Movil extends Terminal{

    private String tarifa;
    private double totalTarificado;

    // Constructor:

    public Movil(String numero,String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.totalTarificado = 0;
    }

    @Override
    public void llama(Terminal t, int segundosLlamada) {

        super.llama(t, segundosLlamada);

        double minutos = (double) segundosLlamada / 60;

        switch (this.tarifa) {
            case "rata":
                this.totalTarificado += minutos*0.06;
                break;
            case "mono":
                this.totalTarificado += minutos*0.12;
                break;
            case "bisonte":
                this.totalTarificado += minutos*0.30;
                break;
                default:
        }
    }

    public String toString() {
        // Nº 678 11 22 33 - 0s de conversación - tarificados 0,00 euros
        return "Nº " + this.getNumero()
                + " - " + this.getTiempoDeConversacion()
                + "s de conversación - tarificados  "
                + this.totalTarificado
                + " euros";
    }
}
