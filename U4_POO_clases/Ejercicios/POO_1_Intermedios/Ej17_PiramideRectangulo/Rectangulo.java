package Ejercicios.POO_1_Intermedios.Ej17_PiramideRectangulo;

public class Rectangulo {

    private int base;
    private int altura;
    private static int rectangulosCreados = 0; //Contador de pirámides creadas

    // Constructor que inicializa la base y la altura del rectángulo

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    // Metodo para obtener el número de rectangulos creados
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    public String toString() {
        String cadena = "";

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                cadena += "*";
            }
            cadena += "\n";
        }
        return cadena;
    }
}
