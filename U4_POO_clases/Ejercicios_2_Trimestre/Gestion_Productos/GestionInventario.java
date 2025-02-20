package Ejercicios_2_Trimestre.Gestion_Productos;

import java.util.Scanner;

public class GestionInventario {
    public static void main(String[] args) {

        // Primeras pruebas:
        /*Producto p1 = new Producto(121234, "Vegeta", 45, 1);
        p1.mostrarInformacion();*/

        Inventario inventario = new Inventario();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--Menu de gestión del inventario--");
            System.out.println("1. Agregar producto nuevo");
            System.out.println("2. Mostrar ionventario");
            System.out.println("3. Vender producto");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: //Agregar

                    System.out.println("Introduce el código del producto:");
                    int codigo = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Introduce el nombre del producto:");
                    String nombre = entrada.nextLine();
                    System.out.println("Introduce el precio del producto:");
                    double precio = entrada.nextDouble();
                    System.out.println("Introduce el cantidad del producto:");
                    int cantidadStock = entrada.nextInt();

                    Producto nuevoProducto = new Producto(codigo, nombre, precio, cantidadStock);

                    inventario.agregarProducto(nuevoProducto);
                    System.out.println("Producto agregado correctamente...");
                    break;
                case 2:
                    // Mostrar inventario
                    inventario.mostrarInventario();
                    break;
                case 3:
                    // Vender producto
                    System.out.println("Falta por implementar..");
                    break;
                case 4:
                    // Salir
                    System.out.println("Saliendo del programa....");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo");
                    break;
            }
        } while (opcion != 4);



    }
}
