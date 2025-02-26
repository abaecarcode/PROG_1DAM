package Extension_Gestion_Productos;

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
            System.out.println("\n--Menu de gestión del inventario--");
            System.out.println("1. Agregar producto nuevo");
            System.out.println("2. Mostrar ionventario");
            System.out.println("3. Vender producto");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: //Agregar

                    System.out.print("Introduce el código del producto: ");
                    int codigo = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Introduce el nombre del producto: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Introduce el precio del producto: ");
                    double precio = entrada.nextDouble();
                    System.out.print("Introduce el cantidad del producto: ");
                    int cantidadStock = entrada.nextInt();

                    // Solicitar información del proveedor
                    System.out.print("Introduce el nombre del proveedor: ");
                    String nombreProveedor = entrada.nextLine();
                    entrada.nextLine();
                    System.out.print("Introduce el teléfono del proveedor: ");
                    String telefonoProveedor = entrada.nextLine();

                    // Solicitar información de la categoria del producto
                    System.out.print("Introduce el nombre de la categoria: ");
                    String nombreCategoria = entrada.nextLine();

                    System.out.print("Introduce la descripcion de la categoria: ");
                    String descripcionCategoria = entrada.nextLine();

                    Producto nuevoProducto = new Producto(codigo, nombre, precio, cantidadStock, new Proveedor(nombreProveedor, telefonoProveedor), new Categoria(nombreCategoria, descripcionCategoria));

                    inventario.agregarProducto(nuevoProducto);
                    System.out.println("\nProducto agregado correctamente...");
                    break;
                case 2:
                    // Mostrar inventario
                    inventario.mostrarInventario();
                    break;
                case 3:
                    // Vender producto
                    System.out.print("Introduce el codigo de producto: ");
                    int codigoVenta = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Introduce la cantidad a vender: ");
                    int cantidadVenta = entrada.nextInt();

                    inventario.venderProducto(codigoVenta, cantidadVenta);

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
