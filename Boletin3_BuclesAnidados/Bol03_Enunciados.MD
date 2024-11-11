## BOLETÍN 3: Bucles Anidados

### Ejercicio 1
Realiza detenidamente una traza al siguiente programa y muestra cuál sería la salida por pantalla:

**Programa ej_1:**
```
VARIABLES
  suma, i, j: ENTERO

COMIENZO
  PARA i <- 1 HASTA 4
    PARA j <- 3 HASTA 0 INC -1
      suma <- i*10+j
      escribir (suma)
    FIN PARA
  FIN PARA
FIN
```

### Ejercicio 2
Realiza una traza del siguiente algoritmo y muestra la salida generada por pantalla.

**Programa ej_2:**
```
VARIABLES
  i, j: ENTERO

COMIENZO
  PARA i <- 1 HASTA 3
    j <- i+1
    MIENTRAS j < 4
      escribir (j-i)
      j <- j+1
    FIN MIENTRAS
  FIN PARA
FIN
```
### Ejercicio 3
Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.

### Ejercicio 4
Dibuja un cuadrado de n elementos de lado utilizando *.

### Ejercicio 5
Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad de que cada vez que aparezca un 3, se sustituya por una E.

### Ejercicio 6
Realizar un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que son primos.