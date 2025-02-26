package Extension_Gestion_Productos;

import java.io.*;
import java.util.ArrayList;

public class Inventario{

    private final ArrayList<Producto> productos;
    private static final String ARCHIVO_INVENTARIO_CSV = "inventario.csv";

    public Inventario() {
        this.productos = new ArrayList<>();
        cargarCSV(); // Cargamos el inventario desde un archivo CSV
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        guardarCSV();  // Guardamos el producto en el inventario en un archivo CSV
    }

    public Producto buscarProducto(int codigo) {
        for (Producto producto : productos) {
            if ( producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("\nEl inventario está vacío");
        } else {
            System.out.println("\nProductos del inventario:");
            for (Producto producto : productos) {
                producto.mostrarInformacion();
            }
        }
    }

    /*- `venderProducto(int codigo, int cantidad)`: Disminuye el stock de un producto al realizar una venta. Muestra un mensaje si no hay suficiente stock disponible.*/
    public void venderProducto(int codigo, int cantidad) {
        Producto producto = buscarProducto(codigo);
        if (producto == null) {
            System.out.println("\nEl producto con el código " + codigo + " no existe.");
        } else {
            boolean ventaOk = producto.reducirCantidadStock(cantidad);
            if (ventaOk) {
                System.out.println("\nVenta realizada correctamente. Stock restante: " + producto.getCantidadStock());
                guardarCSV();   // Guardamos el inventario en el archivo CSV
            }
        }
    }

    // Metodo para guardar el inventario en un archivo CSV
    private void guardarCSV() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_INVENTARIO_CSV))) {
            // Escribir encabezado (opcional)
            bw.write("codigo,nombre,precio,stock,nombreProveedor,telefonoProveedor, nombreCategoria, descripcionCategoria");
            bw.newLine();

            // Escribir cada producto en el CSV
            for (Producto producto : productos) {
                bw.write(producto.getCodigo() + "," + producto.getNombre() + "," + producto.getPrecio() + "," + producto.getCantidadStock() + "," +
                        producto.getProveedor().getNombre() + "," + producto.getProveedor().getTelefono() + "," +
                        producto.getCategoria().getNombre() + "," + producto.getCategoria().getDescripcion());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("\nError al guardar en CSV: " + e.getMessage());
        }
    }

    // Método para cargar los productos desde un archivo CSV
    private void cargarCSV() {
        File archivo = new File(ARCHIVO_INVENTARIO_CSV);
        if (!archivo.exists()) {
            System.out.println("\nNo hay datos previos. Se iniciará un nuevo inventario.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_INVENTARIO_CSV))) {
            String linea;
            boolean primeraLinea = true; // Para ignorar el encabezado

            while ((linea = br.readLine()) != null) {
                if (primeraLinea) { // Saltar la primera línea (encabezado)
                    primeraLinea = false;
                    continue;
                }

                String[] datos = linea.split(",");

                if (datos.length == 8) { // Aseguramos que los datos sean correctos
                    Producto producto = getProducto(datos);
                    productos.add(producto);
                }
            }
            System.out.println("\nInventario cargado desde CSV.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("\nError al cargar desde CSV: " + e.getMessage());
        }
    }

    private static Producto getProducto(String[] datos) {
        int codigo = Integer.parseInt(datos[0]);
        String nombre = datos[1];
        double precio = Double.parseDouble(datos[2]);
        int stock = Integer.parseInt(datos[3]);
        String nombreProveedor = datos[4];
        String telefonoProveedor = datos[5];

        String nombreCategoria = datos[6];
        String descripcionCategoria = datos[7];

        Proveedor proveedor = new Proveedor(nombreProveedor, telefonoProveedor);
        Categoria categoria = new Categoria(nombreCategoria, descripcionCategoria);
        return new Producto(codigo, nombre, precio, stock, proveedor, categoria);
    }


}
