# Ejercicios de Programación Orientada a Objetos

## Ejercicio 1
Implementa la clase `Caballo` vista en un ejercicio anterior. Pruébala creando instancias y aplicándole algunos métodos.

## Ejercicio 2
Crea la clase `Vehiculo`, así como las clases `Bicicleta` y `Coche` como subclases de la primera. Para la clase `Vehiculo`, crea los atributos de clase `vehiculosCreados` y `kilometrosTotales`, así como el atributo de instancia `kilometrosRecorridos`. Crea también algún método específico para cada una de las subclases. Prueba las clases creadas mediante un programa con un menú como el que se muestra a continuación:

VEHÍCULOS
Anda con la bicicleta
Haz el caballito con la bicicleta
Anda con el coche
Quema rueda con el coche
Ver kilometraje de la bicicleta
Ver kilometraje del coche
Ver kilometraje total
Salir Elige una opción (1-8):


## Ejercicio 3
Crea las clases `Animal`, `Mamifero`, `Ave`, `Gato`, `Perro`, `Canario`, `Pinguino` y `Lagarto`. Crea, al menos, tres métodos específicos de cada clase y redefine el/los método/s cuando sea necesario. Prueba las clases creadas en un programa en el que se instancien objetos y se les apliquen métodos.

## Ejercicio 4
Crea la clase `Fracción`. Los atributos serán `numerador` y `denominador`. Y algunos de los métodos pueden ser `invierte`, `simplifica`, `multiplica`, `divide`, etc.

## Ejercicio 5
Crea la clase `Pizza` con los atributos y métodos necesarios. Sobre cada pizza se necesita saber el tamaño - `mediana` o `familiar` - el tipo - `margarita`, `cuatro quesos` o `funghi` - y su estado - `pedida` o `servida`. La clase debe almacenar información sobre el número total de pizzas que se han pedido y que se han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.

El siguiente código del programa principal debe dar la salida que se muestra:

```java
public class PedidosPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p2.sirve();

        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    }
}
````
Salida esperada:
pizza margarita mediana, pedida
pizza funghi familiar, servida
pizza cuatro quesos mediana, pedida
esa pizza ya se ha servido
pedidas: 3
servidas: 1

## Ejercicio 6: Herencia y Polimorfismo en Animales

**Objetivo:** Aplicar herencia y polimorfismo para modelar diferentes tipos de animales.

Diseña una clase abstracta `Animal` que contenga:

- Un atributo `nombre` (String).
- Un método abstracto `hacerSonido()`.

Crea tres clases que hereden de `Animal`:

- **Perro:** Implementa el método `hacerSonido()` para que imprima `"Guau"`.
- **Gato:** Implementa el método `hacerSonido()` para que imprima `"Miau"`.
- **Pájaro:** Implementa el método `hacerSonido()` para que imprima `"Pío"`.

En el programa principal:

1. Crea un array de tipo `Animal` y almacena objetos de las subclases.
2. Itera sobre el array y llama al método `hacerSonido()` para cada elemento.

---

## Ejercicio 7: Clases Abstractas y Sobreescritura

**Objetivo:** Entender la relación entre clases abstractas y su implementación en subclases.

Diseña una clase abstracta `Figura` que contenga:

- Un método abstracto `calcularArea()` que devuelve un `double`.
- Un método `imprimirArea()` que imprime el área calculada por `calcularArea()`.

Crea dos clases que hereden de `Figura`:

- **Rectangulo:** Recibe `base` y `altura` como atributos. Implementa `calcularArea()` para devolver el área del rectángulo.
- **Círculo:** Recibe `radio` como atributo. Implementa `calcularArea()` para devolver el área del círculo (usa `Math.PI` para calcular el área).

En el programa principal:

1. Crea una lista de figuras (`List<Figura>`) y agrega instancias de `Rectangulo` y `Círculo`.
2. Itera sobre la lista y llama al método `imprimirArea()` para cada figura.

---

## Ejercicio 8: Polimorfismo con Vehículos

**Objetivo:** Aplicar polimorfismo para modelar el comportamiento de diferentes vehículos.

Crea una clase abstracta `Vehiculo` con:

- Un atributo `velocidad` (int).
- Un método abstracto `mover()` que imprima cómo se mueve el vehículo.

Crea tres clases que hereden de `Vehiculo`:

- **Coche:** Implementa `mover()` para imprimir `"El coche se mueve por la carretera a [velocidad] km/h"`.
- **Bicicleta:** Implementa `mover()` para imprimir `"La bicicleta se mueve por el carril bici a [velocidad] km/h"`.
- **Avion:** Implementa `mover()` para imprimir `"El avión vuela por el cielo a [velocidad] km/h"`.

En el programa principal:

1. Crea un array o lista de vehículos y agrega instancias de `Coche`, `Bicicleta` y `Avion`.
2. Recorre el array y llama al método `mover()` para cada vehículo.




