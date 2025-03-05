package Ejercicios_2_Trimestre.Ordenador;

public class Ordenador {
    private String marca;
    private String modelo;
    private int gbRam;
    private int capacidadDiscoDuro;
    private int espacioUtilizado;
    private boolean encendido;

    public Ordenador() {
        this("", "", 4, 50);
    }
    public Ordenador(int gbRam) {
        this("", "", gbRam, 50);
    }
    public Ordenador(int gbRam, int capacidadDiscoDuro) {
        this("", "", gbRam, capacidadDiscoDuro);
    }
    public Ordenador(String marca, String modelo, int gbRam, int capacidadDiscoDuro) {
        if (!esPotenciaDe2(gbRam)) {
            throw new IllegalArgumentException("La RAM no es potencia de 2 Gb");
        }
        if (capacidadDiscoDuro < espacioUtilizado) {
            throw new IllegalArgumentException("La capacidad del disco duro no puede ser menor que el espacio utilizado");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.gbRam = gbRam;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGbRam() {
        return gbRam;
    }

    public void setGbRam(int gbRam) {
        // Sólo será válido si los GB son potencia de dos
        if (!esPotenciaDe2(gbRam)) {
            throw new IllegalArgumentException("La RAM no es potencia de 2 GB");
        }
        this.gbRam = gbRam;
    }

    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public int getEspacioUtilizado() {
        return espacioUtilizado;
    }

    public void setEspacioUtilizado(int espacioUtilizado) {
        this.espacioUtilizado = espacioUtilizado;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void encender() {
        if(this.encendido) {
            System.out.println("El ordenador está encendido.");
        } else {
            this.encendido = true;
            System.out.println("El ordenador de marca " + this.marca + " se ha encendido.");
        }
    }

    public void apagar() {
        if(!this.encendido) {
            System.out.println("El ordenador ya está apagado.");
        } else {
            this.encendido = false;
            System.out.println("El ordenador de marca " + this.marca + " se ha apagado.");
        }
    }

    public void transferirArchivos(int gb) {
        if(this.encendido) {
            if (this.espacioUtilizado + gb <= this.capacidadDiscoDuro) {
                this.espacioUtilizado += gb;
                System.out.println("Transferidos " + gb + " GB. \nEspacio actual:  " + this.espacioUtilizado);
            } else {
                System.out.println("No hay espacio suficiente");
            }
        } else {
            System.out.println("El ordenador está apagado.");
        }
    }



    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", gbRam=" + gbRam +
                ", capacidadDiscoDuro=" + capacidadDiscoDuro +
                ", espacioUtilizado=" + espacioUtilizado +
                ", encendido=" + encendido +
                '}';
    }

    private boolean esPotenciaDe2(int numero) {
        if(numero <= 0) {
            return false;
        }
        double logBase2 = Math.log(numero) / Math.log(2);
        return logBase2 == (int) logBase2;
    }

}
