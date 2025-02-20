package Ejercicios_2_Trimestre.Gestion_Productos;

public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(int codigo, String nombre, double precio, int cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public void mostrarInformacion() {
        System.out.println(("Codigo: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio+ ", Cantidad: " + cantidadStock ));
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

    public int getCodigo() {
        return this.codigo;
    }
}
