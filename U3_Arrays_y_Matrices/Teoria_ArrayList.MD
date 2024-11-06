# 📚 Introducción a ArrayList en Java

## Objetivos de la sesión
1. Comprender qué es un `ArrayList` y cómo se diferencia de un array normal.
2. Aprender a crear, agregar, y acceder a elementos de un `ArrayList`.
3. Realizar operaciones avanzadas como iteraciones y búsquedas, explorando las ventajas de `ArrayList` en Java.

---

## 🧩 Nivel 1: Conceptos Básicos de `ArrayList`
**Descripción**: Introducción a la declaración, inicialización y operaciones básicas con `ArrayList`.

### 📝 Teoría Básica
- **¿Qué es un `ArrayList`?**  
  Un `ArrayList` es una estructura de datos en Java que permite almacenar elementos de forma dinámica. A diferencia de un array normal, puede crecer y reducir su tamaño automáticamente.

- **Ventaja sobre arrays**: No necesitas definir el tamaño de antemano. Es útil cuando la cantidad de elementos puede variar.

### 💻 Ejemplo de Código

````java
import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        // Crear un ArrayList de Strings para almacenar nombres
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos al ArrayList
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Luis");

        // Imprimir los elementos del ArrayList
        System.out.println("Lista de nombres: " + nombres);

        // Acceder a un elemento específico
        System.out.println("Primer nombre: " + nombres.get(0));

        // Cambiar un elemento
        nombres.set(1, "Carmen");
        System.out.println("Lista actualizada: " + nombres);
    }
}
````

## Explicación:

 - add(): Método para agregar elementos.
 - get(): Permite acceder a un elemento por su índice.
 - set(): Cambia un elemento en una posición específica.

## 🧩 Nivel 2: Operaciones Intermedias en ArrayList
**Descripción**: Realización de operaciones más avanzadas, como iteración y manipulación de elementos.

### 📝 Teoría Intermedia
**Iteración en un ArrayList:** Se puede usar un bucle for, for-each, o forEach con expresiones lambda (Java 8+).
**Tamaño de un ArrayList:** La función size() retorna el número de elementos en el ArrayList.

### 💻 Ejemplo de Código

````java
import java.util.ArrayList;

public class ArrayListIntermediate {
public static void main(String[] args) {
ArrayList<String> frutas = new ArrayList<>();

        // Agregar elementos
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");
        frutas.add("Mango");

        // Imprimir todos los elementos usando un bucle for
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Fruta " + (i + 1) + ": " + frutas.get(i));
        }

        System.out.println("::::::::::::::::::::::");

        // Imprimir usando un for-each
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        System.out.println("::::::::::::::::::::::");

        // Eliminar un elemento
        frutas.remove("Banana");
        System.out.println("Lista después de eliminar 'Banana': " + frutas);
    }
}
````
## Explicación:

 - **size()**: Muestra el número de elementos en el ArrayList.
 - **remove()**: Elimina un elemento por valor o por índice.
 - Los diferentes bucles (for y for-each) ofrecen distintas formas de iteración.

## 🧩 Nivel 3: Operaciones Avanzadas y Métodos Útiles en ArrayList
**Descripción**: Uso de métodos avanzados para realizar búsquedas, clonación y limpieza de un ArrayList.

### 📝 Teoría Avanzada
 - **Búsquedas y Contenidos**: ArrayList permite verificar si contiene un elemento específico usando contains().
 - **Clonar y Limpiar el ArrayList**: clone() y clear() permiten duplicar o vaciar el ArrayList.

## 💻 Ejemplo de Código

````java
import java.util.ArrayList;

public class ArrayListAdvanced {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar números al ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Buscar si un número existe
        int numeroBuscado = 30;
        if (numeros.contains(numeroBuscado)) {
            System.out.println("El número " + numeroBuscado + " está en la lista.");
        } else {
            System.out.println("El número " + numeroBuscado + " no está en la lista.");
        }

        // Clonar el ArrayList
        ArrayList<Integer> copiaNumeros = (ArrayList<Integer>) numeros.clone();
        System.out.println("Copia de la lista de números: " + copiaNumeros);

        // Limpiar el ArrayList original
        numeros.clear();
        System.out.println("Lista original después de limpiar: " + numeros);
    }
}
````
## Explicación:

**contains()**: Busca un elemento específico en el ArrayList.
**clone()**: Crea una copia completa del ArrayList.
**clear()**: Vacía todos los elementos del ArrayList.

## Ejercicio Final
 1. **Crear un ArrayList**: Almacena nombres de estudiantes en un ArrayList.
 2. **Modificar, buscar y eliminar**: Proporciona opciones para editar, buscar, y eliminar estudiantes de la lista.
 3. **Menú principal**: Crea un menú para cada operación.

## Solución:

````java
import java.util.ArrayList;
import java.util.Scanner;

public class GestionEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de Estudiantes ---");
            System.out.println("1. Agregar un estudiante");
            System.out.println("2. Modificar un estudiante");
            System.out.println("3. Buscar un estudiante");
            System.out.println("4. Eliminar un estudiante");
            System.out.println("5. Mostrar todos los estudiantes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarEstudiante(estudiantes, sc);
                    break;
                case 2:
                    modificarEstudiante(estudiantes, sc);
                    break;
                case 3:
                    buscarEstudiante(estudiantes, sc);
                    break;
                case 4:
                    eliminarEstudiante(estudiantes, sc);
                    break;
                case 5:
                    mostrarEstudiantes(estudiantes);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        } while (opcion != 6);

        sc.close();
    }

    // Método para agregar un estudiante
    private static void agregarEstudiante(ArrayList<String> estudiantes, Scanner sc) {
        System.out.print("Ingrese el nombre del estudiante a agregar: ");
        String nombre = sc.nextLine();
        estudiantes.add(nombre);
        System.out.println("Estudiante agregado: " + nombre);
    }

    // Método para modificar un estudiante
    private static void modificarEstudiante(ArrayList<String> estudiantes, Scanner sc) {
        System.out.print("Ingrese el índice del estudiante a modificar: ");
        int indice = sc.nextInt();
        sc.nextLine();  // Limpiar el buffer
        if (indice >= 0 && indice < estudiantes.size()) {
            System.out.print("Ingrese el nuevo nombre del estudiante: ");
            String nuevoNombre = sc.nextLine();
            estudiantes.set(indice, nuevoNombre);
            System.out.println("Estudiante actualizado a: " + nuevoNombre);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Método para buscar un estudiante
    private static void buscarEstudiante(ArrayList<String> estudiantes, Scanner sc) {
        System.out.print("Ingrese el nombre del estudiante a buscar: ");
        String nombre = sc.nextLine();
        if (estudiantes.contains(nombre)) {
            System.out.println("Estudiante encontrado en el índice: " + estudiantes.indexOf(nombre));
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // Método para eliminar un estudiante
    private static void eliminarEstudiante(ArrayList<String> estudiantes, Scanner sc) {
        System.out.print("Ingrese el índice del estudiante a eliminar: ");
        int indice = sc.nextInt();
        sc.nextLine();  // Limpiar el buffer
        if (indice >= 0 && indice < estudiantes.size()) {
            System.out.println("Estudiante eliminado: " + estudiantes.remove(indice));
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Método para mostrar todos los estudiantes
    private static void mostrarEstudiantes(ArrayList<String> estudiantes) {
        System.out.println("\n--- Lista de Estudiantes ---");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes en la lista.");
        } else {
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println("Estudiante " + (i + 1) + ": " + estudiantes.get(i));
            }
        }
    }
}
````
