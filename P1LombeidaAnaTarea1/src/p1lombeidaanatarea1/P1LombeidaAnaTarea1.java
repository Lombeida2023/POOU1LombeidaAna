package p1lombeidaanatarea1;

import java.util.Scanner;//Libreria

public class P1LombeidaAnaTarea1 {

    public static void main(String[] args) {//FUNCION PRINCIPAL
        Tienda tienda = new Tienda();//Crea una nueva instancia del objeto de la clase Tienda
        Scanner scanner = new Scanner(System.in);
        //Crea una instancia del objeto de la clase Scanner y la almacena en la variable scanner
        int opcion;
/////////////////////////////MENUU DE OPCIONES////////////////////////////////
        do {
            System.out.println("----- GESTION DE PRODUCTOS DE BELLEZA -----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la categoria del producto: ");
                    String categoria = scanner.next();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    tienda.agregarProducto(nombre, categoria, precio);///// Llama al metodo agregarProducto en el objeto tienda para agregar un producto 
                                                                        //////al inventario de la tienda
                    System.out.println("Producto agregado correctamente.");
                    break;
                case 2:
                    tienda.mostrarInventario();
                    break;
                case 3:
                    System.out.println("Muchas gracias por ingresar al programa: ");
                    break;
                default:
                    System.out.println("Opcion ingresada es incorrecta, ingrese una opcion correcta:");
            }
        } while (opcion != 3);
    }
}
