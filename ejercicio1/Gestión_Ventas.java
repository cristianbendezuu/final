package EJERCICIO_01;
import java.util.Scanner;
public class Gestión_Ventas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombreProducto;
        String productoMasCaro = "";
        String productoMayorCantidad = "";

        double precio;
        double subtotal;
        double totalCompra = 0;
        double igv;
        double totalPagar;

        double mayorPrecio = 0;

        int cantidad;
        int mayorCantidad = 0;
        int totalProductos = 0;

        char opcion;

        do {

            System.out.println("\n===== REGISTRO DE PRODUCTO =====");

            System.out.print("Nombre del producto: ");
            nombreProducto = sc.next();

            System.out.print("Precio: ");
            precio = sc.nextDouble();

            System.out.print("Cantidad: ");
            cantidad = sc.nextInt();

            subtotal = precio * cantidad;

            totalCompra += subtotal;
            totalProductos++;

            System.out.printf("Subtotal del producto: S/ %.2f%n", subtotal);

            if (precio > mayorPrecio) {
                mayorPrecio = precio;
                productoMasCaro = nombreProducto;
            }

            if (cantidad > mayorCantidad) {
                mayorCantidad = cantidad;
                productoMayorCantidad = nombreProducto;
            }

            System.out.print("\n¿Desea registrar otro producto? (S/N): ");
            opcion = sc.next().toUpperCase().charAt(0);

        } while (opcion == 'S');

        igv = totalCompra * 0.18;
        totalPagar = totalCompra + igv;

        System.out.println("\n=========== REPORTE FINAL ===========");
        System.out.println("Total de productos registrados: " + totalProductos);
        System.out.printf("Total de la compra: S/ %.2f%n", totalCompra);
        System.out.printf("IGV (18%%): S/ %.2f%n", igv);
        System.out.printf("Total a pagar: S/ %.2f%n", totalPagar);
        System.out.println("Producto más caro: " + productoMasCaro);
        System.out.println("Producto con mayor cantidad vendida: " + productoMayorCantidad);

        sc.close();
    }
}


