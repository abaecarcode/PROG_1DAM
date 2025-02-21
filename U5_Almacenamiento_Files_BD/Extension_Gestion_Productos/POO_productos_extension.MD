# **MEJORAS y REPASO: Sistema de Gestión de Inventario de Productos**
### A continuación, se repsasarán las mejoras realizadas en el ejercicio de gestión de inventario de productos, así como la teoría de Programación Orientada a Objetos (POO) aplicada en el ejercicio.

## **Enunciado:**

Se te ha encargado crear un sistema para gestionar el inventario de productos de una tienda utilizando los principios de Programación Orientada a Objetos (POO). Este sistema debe incluir funcionalidades de entrada y salida de datos (E/S), así como el uso de variables, estructuras de control de flujo y arrays. A continuación, se detallan los requisitos del ejercicio:

---

## **Características de la POO presentes en el ejercicio**

1️⃣ Encapsulación (✔️ Correcto)  

  * Los atributos de Producto son privados y se acceden mediante métodos getter y setter.    
  * Se usan modificadores de acceso adecuados (private, public) para proteger los datos.
  * Se evita el acceso directo a los atributos desde otras clases.

2️⃣ Herencia (❌ No aplica)    

🚨 Falta herencia en el diseño del ejercicio.  

  * No hay una superclase genérica (Articulo o Item) de la cual Producto herede.  
  * Si se quiere expandir el sistema con productos físicos y digitales, habría que modificar Producto en lugar de crear clases especializadas.
  * No se aprovechan las ventajas de la herencia, como la reutilización de código y la organización de clases en una jerarquía.

📌 ¿Cómo agregarla?  

  *   Crear una clase base Articulo con nombre, precio, cantidadStock y hacer que Producto herede de ella.  

3️⃣ Polimorfismo (❌ No aplica)  

  🚨 No hay uso de polimorfismo en el código.

  * No hay métodos sobrecargados ni sobreescritos (@Override solo en toString podría ser útil).  
  * No se usa una interfaz (InterfazProducto) para permitir diferentes implementaciones de productos.  

📌 ¿Cómo mejorarlo?

  * Se podría agregar sobrecarga de métodos en Inventario, permitiendo buscar un producto por nombre o por código.  
  * Implementar una interfaz InterfazProducto para permitir productos de diferentes tipos en el futuro.  
Ejemplo de sobrecarga en buscarProducto:

```java

public Producto buscarProducto(String nombre) {
for (Producto producto : productos) {
if (producto.getNombre().equalsIgnoreCase(nombre)) {
return producto;
}
}
return null;
}
```

4️⃣ Abstracción (✔️ Correcto)

  * **Producto** representa un producto individual.  
  * **Inventario** gestiona una colección de productos.  
  * **GestionInventario** maneja la interacción con el usuario.  

📌 ¿Cómo mejorarlo?

La abstracción podría mejorar ocultando más detalles internos, por ejemplo, usando métodos private dentro de Inventario para evitar que GestionInventario manipule la estructura interna directamente.



## **Persistencia en un archivo CSV.**

📌 ¿Qué vamos a hacer?
✅ Guardar los productos en un archivo inventario.csv cada vez que se agregue un producto.
✅ Cargar los productos desde el archivo inventario.csv al iniciar el programa.
✅ Usar BufferedWriter y BufferedReader para manejar el archivo de manera eficiente.

## **Persistencia con JSON**

📢 Resumen de la mejora  
  ✅ Ahora los productos se guardan en inventario.json, lo que permite una mejor organización de los datos.  
  ✅ El inventario se carga automáticamente al iniciar, sin perder la información.  
  ✅ Cada vez que se vende un producto o se añade uno nuevo, el archivo se actualiza.  
  ✅ Usamos Gson para convertir automáticamente objetos Java en JSON y viceversa.  


---

## **Objetivo del Sistema de Reportes**

✅ Generar un reporte en formato .txt o .csv con la información del inventario.   
✅ Incluir productos con stock bajo (por ejemplo, menos de 5 unidades).    
✅ Permitir que el usuario genere el reporte desde el menú.    
