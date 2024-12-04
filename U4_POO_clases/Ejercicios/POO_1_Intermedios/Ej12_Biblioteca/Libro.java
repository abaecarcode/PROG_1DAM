package Ejercicios.POO_1_Intermedios.Ej12_Biblioteca;

public class Libro extends Publicacion implements Prestable {

    @Override
    public void presta() {

    }

    @Override
    public void devuelve() {

    }

    @Override
    public boolean estaPrestado() {
        return false;
    }
}
