package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante_2Ej1 {
    private String nombre;
    private int edad;
    private String matricula;

    public Estudiante_2Ej1(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matricula: " + matricula);
    }
    public void mostrarInfo2() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Matricula: " + getMatricula());
    }

    public static void registrarEstudiante(ArrayList<Estudiante_2Ej1> estudiantes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el edad del estudiante: ");
        int edad = sc.nextInt();
        //sc.nextLine();
        System.out.println("Ingrese el matricula del estudiante: ");
        String matricula = sc.next();

        Estudiante_2Ej1 nuevo_estudiante = new Estudiante_2Ej1(nombre, edad, matricula);
        estudiantes.add(nuevo_estudiante);
        System.out.println("Estudiante registrado con éxito");
    }

    public static void main(String[] args) {
        Estudiante_2Ej1 e1 = new Estudiante_2Ej1("Pepe", 17,"IAG1");
        String n, m;
        int e;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        n = sc.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        e = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la matricula del estudiante: ");
        m = sc.nextLine();
        Estudiante_2Ej1 e2 = new Estudiante_2Ej1(n,e,m);
        e1.mostrarInfo();
        e1.mostrarInfo2();
        System.out.println("Info del estudiante numero2 recogido por teclado:");
        e2.mostrarInfo();

        ArrayList<Estudiante_2Ej1> estudiantes = new ArrayList<Estudiante_2Ej1>();
        registrarEstudiante(estudiantes);
    }
}
