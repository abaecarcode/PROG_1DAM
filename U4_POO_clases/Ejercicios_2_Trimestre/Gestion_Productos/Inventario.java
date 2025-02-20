package Ejercicios_2_Trimestre.Gestion_Productos;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
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
            System.out.println("El inventario está vacío");
        } else {
            System.out.println("Productos del inventario:");
            for (Producto producto : productos) {
                producto.mostrarInformacion();
            }
        }
    }


}
