# Ejercicios de conceptos en Programación Orientada a Objetos (POO)

## Ejercicio 1
¿Cuáles serían los atributos de la clase `PilotoDeFormula1`? ¿Se te ocurren algunas instancias de esta clase?

## Ejercicio 2
A continuación tienes una lista en la que están mezcladas varias clases con instancias de esas clases. Para ponerlo un poco más difícil, todos los elementos están escritos en minúscula. Di cuáles son las clases, cuáles las instancias, a qué clase pertenece cada una de estas instancias y cuál es la jerarquía entre las clases:

**Lista:**
`paula, goofy, gardfiel, perro, mineral, caballo, tom, silvestre, pirita, rocinante, milu, snoopy, gato, pluto, animal, javier, bucefalo, pegaso, ayudante_de_santa_claus, cuarzo, laika, persona, pato_lucas.`

## Ejercicio 3
¿Cuáles serían los atributos de la clase `Vivienda`? ¿Qué subclases se te ocurren?

## Ejercicio 4
Piensa en la liga de baloncesto, ¿qué 5 clases se te ocurren para representar 5 elementos distintos que intervengan en la liga?

## Ejercicio 5
Haz una lista con los atributos que podría tener la clase `Caballo`. A continuación haz una lista con los posibles métodos (acciones asociadas a los caballos).

## Ejercicio 6
Lista los atributos de la clase `Alumno`. ¿Sería `nombre` uno de los atributos de la clase? Razona tu respuesta.

## Ejercicio 7
¿Cuáles serían los atributos de la clase `Ventana` (de ordenador)? ¿Cuáles serían los métodos? Piensa en las propiedades y en el comportamiento de una ventana de cualquier programa.

# Ejercicios Avanzados de Programación Orientada a Objetos

## Ejercicio 6
Crea la clase `Tiempo` con los métodos `suma` y `resta`. Los objetos de la clase `Tiempo` son intervalos de tiempo y se crean de la forma:

`Tiempo t = new Tiempo(1, 20, 30)`

Donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. Crea el método `toString` para ver los intervalos de tiempo de la forma `10h 35m 5s`.

Si se suman por ejemplo `30m 40s` y `35m 20s`, el resultado debería ser `1h 6m 0s`. Realiza un programa de prueba para comprobar que la clase funciona correctamente.

## Ejercicio 7
Queremos gestionar la venta de entradas (no numeradas) de Expocoches Campanillas, que tiene 3 zonas:

- La sala principal con 1000 entradas disponibles.
- La zona de compra-venta con 200 entradas disponibles.
- La zona VIP con 25 entradas disponibles.

Es necesario controlar que existen entradas antes de venderlas. Crea un programa que permita gestionar la venta de entradas con un menú:

1. Mostrar número de entradas libres.
2. Vender entradas.
3. Salir.

El programa debe preguntar para qué zona se quieren las entradas y cuántas se desean, asegurando que no se puedan vender más entradas de las disponibles.

## Ejercicio 8
Implementa la clase `Terminal`. Un terminal tiene asociado un número. Los terminales se pueden llamar unos a otros, y el tiempo de conversación corre para ambos.

El programa principal debe crear varios terminales, realizar llamadas entre ellos y mostrar el tiempo de conversación de cada uno. El formato de salida esperado es el siguiente:

Nº 678 11 22 33 - 0s de conversación
Nº 644 74 44 69 - 0s de conversación
Nº 678 11 22 33 - 520s de conversación
Nº 644 74 44 69 - 320s de conversación
Nº 622 32 89 09 - 200s de conversación
Nº 664 73 98 18 - 0s de conversación


