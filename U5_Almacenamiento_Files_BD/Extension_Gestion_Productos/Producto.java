package Extension_Gestion_Productos;

public class Producto extends Articulo {

    private Proveedor proveedor; // Se añade composición en la clase Producto que tiene uno de sus atributo un tipo o clase Proveedor
    private Categoria categoria; // Se añade composición en la clase Producto que tiene uno de sus atributo un tipo o clase Categoria

    public Producto(int codigo, String nombre, double precio, int cantidadStock, Proveedor proveedor, Categoria categoria) {
        super(codigo, nombre, precio, cantidadStock);
        this.proveedor = proveedor;
        this.categoria = categoria;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(("Codigo: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio+ ", Cantidad: " + cantidadStock ));
        proveedor.mostrarInformacion();
        categoria.mostrarInformacion();
    }

    public boolean reducirCantidadStock(int cantidad) {
        if (cantidad > cantidadStock) {
            System.out.println("Stock insuficiente. No se puede realizar la venta");
            return false;
        } else {
            cantidadStock -= cantidad;
            return true;
        }
    }

    public void incrementarCantidadStock(int cantidad) {
        cantidadStock += cantidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
