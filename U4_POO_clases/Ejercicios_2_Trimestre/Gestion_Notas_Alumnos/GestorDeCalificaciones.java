package Ejercicios_2_Trimestre.Gestion_Notas_Alumnos;

import java.util.ArrayList;

public class GestorDeCalificaciones {
    ArrayList<Estudiante> estudiantes;

    public GestorDeCalificaciones() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre, int numMaterias, int numEvaluaciones) {
        Estudiante estudiante = new Estudiante(nombre, numMaterias, numEvaluaciones);
        estudiantes.add(estudiante);
    }

    public void mostrarAlerta(Estudiante estudiante) {
        double promedioGeneral = estudiante.calcularPromedioGeneral();
        if (promedioGeneral < 5.0) {
            System.out.println("Alerta: " + estudiante.nombre + " necesita refuerzo académico.");
        }
    }

    public Estudiante buscarMejorEstudiante() {
        Estudiante mejor = null;
        double maxPromedio = Double.MIN_VALUE;

        for (Estudiante estudiante : estudiantes) {
            double promedioGeneral = estudiante.calcularPromedioGeneral();
            if (promedioGeneral > maxPromedio) {
                maxPromedio = promedioGeneral;
                mejor = estudiante;
            }
        }

        return mejor;
    }

    public void agregarEstudiante(Estudiante estudiante) {
    }
}

