package POO.Dispositivo_Bateria;

public class Main {
    public static void main(String[] args) {

        DispositivoConBateria movil = new DispositivoConBateria("MovilDAM1", 20);

        movil.usarDispositivo();
        movil.usarDispositivo();
        movil.usarDispositivo();
        movil.usarDispositivo();
        movil.usarDispositivo(); // Aquí se le acabará la batería

        movil.usarDispositivo(); // Prueba de que no funciona sin batería

        movil.recargar(); // Recarga del dispositivo
        movil.usarDispositivo(); // Compruebo que he recargado correctamente
    }
}
