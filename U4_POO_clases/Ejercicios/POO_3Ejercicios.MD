# Relación de Ejercicios: Programación Orientada a Objetos en Java

## **Ejercicio 1: Sistema de Gestión de Estudiantes**
**Enunciado**:  
Implementa la clase `Estudiante` con los siguientes atributos y métodos:
- **Atributos**: `nombre` (String), `edad` (int), `matricula` (String).
- **Métodos**:
    - Un constructor que inicialice todos los atributos.
    - Método `registrarEstudiante` para agregar un nuevo estudiante a una lista de estudiantes.
    - Método `mostrarInformacion` para imprimir los detalles del estudiante.

**Tarea Adicional**:  
Crea un método estático en la clase `Estudiante` que permita buscar un estudiante por matrícula dentro de una lista.

---

## **Ejercicio 2: Sistema de Biblioteca**
**Enunciado**:  
Implementa las clases `Libro` y `Usuario` para gestionar un sistema de biblioteca:

- **Clase `Libro`**:
    - **Atributos**: `titulo` (String), `autor` (String), `isbn` (String), `disponible` (boolean).
    - **Métodos**:
        - Constructor para inicializar los atributos.
        - Método `prestar` para marcar el libro como no disponible.
        - Método `devolver` para marcar el libro como disponible.

- **Clase `Usuario`**:
    - **Atributos**: `nombre` (String), `id` (String), `prestamos` (lista de libros).
    - **Métodos**:
        - Constructor que inicialice los atributos.
        - Método `pedirLibro` para agregar un libro a la lista de préstamos.
        - Método `devolverLibro` para eliminar un libro de la lista.

**Tarea Adicional**:  
Implementa una clase `Biblioteca` con una lista de usuarios y libros, y métodos para gestionar préstamos y devoluciones.

---

## **Ejercicio 3: Tienda Online**
**Enunciado**:  
Implementa las clases `Producto`, `Carrito` y `Usuario`:

- **Clase `Producto`**:
    - **Atributos**: `nombre` (String), `precio` (double), `stock` (int).
    - **Métodos**:
        - Constructor para inicializar los atributos.
        - Método `reducirStock` para disminuir el stock cuando se añade al carrito.

- **Clase `Carrito`**:
    - **Atributos**: `productos` (lista de productos).
    - **Métodos**:
        - Método `agregarProducto` para añadir un producto al carrito.
        - Método `mostrarResumen` para mostrar el total del carrito.

- **Clase `Usuario`**:
    - **Atributos**: `nombre` (String), `direccion` (String), `carrito` (Carrito).
    - **Métodos**:
        - Constructor para inicializar el usuario con un carrito vacío.
        - Método `realizarPedido` que muestre el resumen y vacíe el carrito.

**Tarea Adicional**:  
Valida que no se pueda añadir al carrito más productos de los que hay en stock.

---

## **Ejercicio 4: Sistema de Transporte**
**Enunciado**:  
Implementa las clases `Vehiculo`, `Coche`, y `Autobus` usando herencia:

- **Clase base `Vehiculo`**:
    - **Atributos**: `matricula` (String), `capacidad` (int).
    - **Métodos**:
        - Constructor para inicializar atributos.
        - Método `mostrarInformacion`.

- **Clase `Coche`**:
    - **Atributos**: `marca` (String), `modelo` (String).
    - **Métodos**:
        - Constructor que llame al constructor de la clase base.
        - Método `mostrarInformacion` sobrescrito para incluir marca y modelo.

- **Clase `Autobus`**:
    - **Atributos**: `empresa` (String), `paradas` (lista de strings).
    - **Métodos**:
        - Constructor que llame al constructor de la clase base.
        - Método `mostrarInformacion` sobrescrito para incluir la empresa y las paradas.

**Tarea Adicional**:  
Crea una lista de vehículos que contenga coches y autobuses, y muestra la información de cada uno utilizando polimorfismo.

---

## **Ejercicio 5: Red Social**
**Enunciado**:  
Implementa las clases `Usuario` y `Publicacion`:

- **Clase `Usuario`**:
    - **Atributos**: `nombre` (String), `listaAmigos` (lista de usuarios), `publicaciones` (lista de publicaciones).
    - **Métodos**:
        - Constructor para inicializar los atributos.
        - Método `agregarAmigo` para añadir un usuario a la lista de amigos.
        - Método `publicarEstado` para agregar una nueva publicación.

- **Clase `Publicacion`**:
    - **Atributos**: `contenido` (String), `fecha` (Date).
    - **Métodos**:
        - Constructor para inicializar atributos.
        - Método `mostrarPublicacion` para imprimir el contenido y la fecha.

**Tarea Adicional**:  
Implementa un método en `Usuario` que permita ver las publicaciones de los amigos.

---

**Nota**:  
Cada ejercicio debe ejecutarse desde un programa principal que permita probar todas las funcionalidades.
