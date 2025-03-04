
### Ejercicio de POO en Java: Gestión de Calificaciones de Alumnos

#### Enunciado:

**Objetivo:**  
Crear una aplicación que gestione las calificaciones de los estudiantes y realice cálculos estadísticos basados en esas calificaciones.

**Requisitos:**

1. **Clase Estudiante:**
    - Crear una clase llamada `Estudiante` con los siguientes atributos:
        - Un String para el nombre del estudiante.
        - Un array bidimensional de doubles para las calificaciones. El primer índice representará la materia (matemáticas, historia, etc.), y el segundo índice representará diferentes evaluaciones (por ejemplo, examenes, trabajos).

    - Métodos:
        - Un constructor que inicialice el nombre y un array bidimensional con dimensiones dadas.
        - Un método `calcularPromedio Materias()` que devuelva un array de doubles con los promedios por materia.
        - Un método `calcularPromedioGeneral()` que devuelva un double representando el promedio general del estudiante.
        - Un método `mostrarCalificaciones()` que imprima todas las calificaciones del estudiante en un formato legible.

2. **Clase GestorDeCalificaciones:**
    - Crear una clase llamada `GestorDeCalificaciones` con los siguientes métodos:
        - Un método para agregar estudiantes a una lista (utilizar una estructura de datos como ArrayList).
        - Un método que, dado un estudiante, determine si su promedio general es menor que 5.0 y muestre un mensaje de alerta.
        - Un método que busque al estudiante con el mejor promedio general y muestre sus datos.

3. **Entrada/Salida:**
    - El programa debe interactuar con el usuario a través del teclado, permitiendo ingresar los nombres de los estudiantes y sus calificaciones en diferentes materias.
    - Debe mostrar la información de manera clara y estructurada, incluyendo promedios y alertas.

**Especificaciones Detalladas:**

- **Clase Estudiante:**
    - El constructor debe recibir el nombre del estudiante y las dimensiones del array bidimensional (número de materias y número de evaluaciones).
    - El método `calcularPromedio Materias()` debe calcular el promedio para cada materia, considerando todas las evaluaciones realizadas en esa materia.
    - El método `calcularPromedioGeneral()` debe calcular el promedio de todos los promedios por materia.

- **Clase GestorDeCalificaciones:**
    - La clase debe tener una lista (ArrayList) que almacene objetos de tipo Estudiante.
    - El método para agregar estudiantes debe pedir al usuario ingresar el nombre y las calificaciones del estudiante.
    - El método para determinar si un estudiante necesita alerta debe comparar el promedio general con 5.0 y mostrar un mensaje adecuado.
    - El método para encontrar al mejor estudiante debe recorrer la lista de estudiantes y encontrar aquel con el mayor promedio general.

- **Entrada/Salida:**
    - Utilizar JOptionPane o System.out.println() y Scanner para interactuar con el usuario.
    - El programa debe mostrar un menú con opciones para agregar estudiantes, calcular promedios, mostrar alertas, buscar al mejor estudiante, etc.

**Ejemplo de Uso:**

1. **Crear Estudiantes:**
   ```
   GestorDeCalificaciones gestor = new GestorDeCalificaciones();
   gestor.agregarEstudiante("Juan Pérez");
   // Ingresa calificaciones para Juan Pérez...
   ```

2. **Calcular Promedios y Alertas:**
   ```
   double promedioGeneral = estudiante.calculaPromedioGeneral();
   if (promedioGeneral < 5.0) {
       System.out.println("Alerta: " + estudiante.nombre + " necesita refuerzo académico.");
   }
   ```

3. **Mostrar Mejor Estudiante:**
   ```
   Estudiante mejorEstudiante = gestor.mejorPromedio();
   System.out.println("Mejor estudiante: " + mejorEstudiante.nombre);
   ```

**Consideraciones:**

- Asegurarse de manejar correctamente los índices en el array bidimensional para evitar errores.
- Verificar que las dimensiones del array sean correctas antes de realizar cálculos.
- Implementar buenas prácticas de programación, como encapsulamiento de atributos y métodos útiles.