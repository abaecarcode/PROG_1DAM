package POO.Dispositivo_Bateria;

public class Dispositivo {
    protected String nombre;
    protected int consumoPorUso;

    public Dispositivo(String nombre, int consumoPorUso) {
        this.nombre = nombre;
        this.consumoPorUso = consumoPorUso;
    }

    public void usarDispositivo() {
        System.out.println("El dispositivo " + this.nombre +  " ha sido utilizado.");
    }

    public String getNombre() {
        return nombre;
    }


}
