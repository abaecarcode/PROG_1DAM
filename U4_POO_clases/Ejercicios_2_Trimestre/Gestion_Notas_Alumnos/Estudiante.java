package Ejercicios_2_Trimestre.Gestion_Notas_Alumnos;

public class Estudiante {
    protected String nombre;
    protected double[][] calificaciones; // [materia][evaluacion]

    public Estudiante(String nombre, int numMaterias, int numEvaluaciones) {
        this.nombre = nombre;
        this.calificaciones = new double[numMaterias][numEvaluaciones];
    }

    public double[] calcularPromedioPorMateria() {
        double[] promedios = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / calificaciones[i].length;
        }
        return promedios;
    }

    public double calcularPromedioGeneral() {
        double[] promediosPorMateria = this.calcularPromedioPorMateria();
        double sumaTotal = 0;
        for (double promedio : promediosPorMateria) {
            sumaTotal += promedio;
        }
        return sumaTotal / promediosPorMateria.length;
    }

    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de " + this.nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Materia " + (i + 1) + ":");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.println("Evalución " + (j + 1) + ": " + calificaciones[i][j]);
            }
        }
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = new double[][]{calificaciones};
    }
}
