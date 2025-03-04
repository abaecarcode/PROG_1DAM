package Ejercicios_2_Trimestre.Gestion_Nominas;

public abstract class Trabajador {

    // Atributos de la clase (propiedades o caracteristicas)
    protected String dni;
    protected String nombre;
    protected double salarioBase;

    // Metodo constructor de la clase

    public Trabajador(String dni, String nombre, double salarioBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();
}
