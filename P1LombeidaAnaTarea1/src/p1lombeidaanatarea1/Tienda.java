
package p1lombeidaanatarea1;

import java.util.ArrayList;///LIBRERIAS
import java.util.List;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Tienda {
   private List<Producto> inventario;// Almacena una lista de objetos de tipo productoo
                                    ///lo que permite a la clase acceder y gestionar la informacion 
                                    ///de los productos que forman parte del inventario.
    public Tienda() {
        inventario = new ArrayList<>();//Crea una instacia del arreglo y asigna un atributo inventario
    }

    public void agregarProducto(String nombre, String categoria, double precio) {//METODO PARA AGREGAR LOS PRODUCTOS
        Producto nuevoProducto = new Producto(nombre, categoria, precio);
        inventario.add(nuevoProducto);
    }

    public void mostrarInventario() {//METODO MOSTRAR INVENTARIO
        if (inventario.isEmpty()) {
            System.out.println("El inventario esta vacio.");
        } else {
            System.out.println("Inventario:");
            for (Producto producto : inventario) {
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Categoria: " + producto.getCategoria());
                System.out.println("Precio: $" + producto.getPrecio());
                System.out.println("----------------------");
            }
        }
    }  
}
