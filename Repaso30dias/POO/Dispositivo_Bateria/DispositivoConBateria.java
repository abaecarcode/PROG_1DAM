package POO.Dispositivo_Bateria;

public class DispositivoConBateria extends Dispositivo {

    private int bateria;

    public DispositivoConBateria(String nombre, int consumoPorUso) {
    super(nombre, consumoPorUso);
    this.bateria = 100;
    }


    @Override
    public void usarDispositivo() {
        if (bateria > 0) {
            bateria -= consumoPorUso;
            System.out.println("El dispositivo " + nombre + " ha sido utilizado. Batería restante: " + bateria + "%");
        }  else {
            System.out.println("El dispositivo " + nombre + " se ha quedado sin batería. Ve a recargarlo");
        }
    }

    public void recargar() {
        this.bateria = 100;
        System.out.println("El dispositivo " + nombre + " ha sido recargado al 100%.");
    }
}
