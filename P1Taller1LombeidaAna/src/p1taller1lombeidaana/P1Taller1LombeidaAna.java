
package p1taller1lombeidaana;

/**
 *
 * @author LOMBEIDA ANA
 */
public class P1Taller1LombeidaAna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear un arreglo de FiguraGeometrica
        FiguraGeometrica[] figuras = new FiguraGeometrica[2];
        
        // Crear objetos de Cuadrado y Círculo
        figuras[0] = new Cuadrado(5);
        figuras[1] = new Circulo(3);
        
        // Calcular y mostrar el área de cada figura
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Area de la figura: " + figura.calcularArea());
        }
    }
    }
    

