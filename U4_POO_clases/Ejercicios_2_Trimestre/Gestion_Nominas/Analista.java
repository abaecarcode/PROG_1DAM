package Ejercicios_2_Trimestre.Gestion_Nominas;

public class Analista extends Informatico{


    public Analista(String dni, String nombre, double salarioBase, String titulacion) {
        super(dni, nombre, salarioBase, titulacion);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + (salarioBase*0.3);
    }

    @Override
    public String toString() {
        return "Analista{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + calcularSalarioFinal() +'}';
    }
}
