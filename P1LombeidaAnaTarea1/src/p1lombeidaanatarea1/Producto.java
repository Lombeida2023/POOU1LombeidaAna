
package p1lombeidaanatarea1;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Producto {
    private String Nombre;//Atributos
    private  String Categoria;
    private double Precio;

    //CONSTRUCTOR//////////////////////////////////
    public Producto(String Nombre, String Categoria, double Precio) {
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Precio = Precio;
    }

    //METODOS GET
    public String getNombre() {
        return Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public double getPrecio() {
        return Precio;
    }
    
}
