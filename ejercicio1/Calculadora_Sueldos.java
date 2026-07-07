package EJERCICIO_01;
import java.util.Scanner;
public class Calculadora_Sueldos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        double horasTrabajadas;
        double pagoHora;
        int minutosTardanza;

        double sueldoBruto;
        double descuentoAFP;
        double descuentoTardanza;
        double sueldoNeto;

        System.out.println("===== CALCULADORA DE SUELDOS =====");

        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese horas trabajadas: ");
        horasTrabajadas = sc.nextDouble();

        System.out.print("Ingrese pago por hora: ");
        pagoHora = sc.nextDouble();

        System.out.print("Ingrese minutos de tardanza: ");
        minutosTardanza = sc.nextInt();

        sueldoBruto = horasTrabajadas * pagoHora;

        descuentoAFP = sueldoBruto * 0.10;

        descuentoTardanza = sueldoBruto * 0.0005 * minutosTardanza;

        sueldoNeto = sueldoBruto - descuentoAFP - descuentoTardanza;

        System.out.println("\n========== RESULTADOS ==========");
        System.out.println("Trabajador: " + nombre);
        System.out.printf("Sueldo Bruto: S/ %.2f%n", sueldoBruto);
        System.out.printf("Descuento AFP: S/ %.2f%n", descuentoAFP);
        System.out.printf("Descuento por tardanza: S/ %.2f%n", descuentoTardanza);
        System.out.printf("Sueldo Neto: S/ %.2f%n", sueldoNeto);

        sc.close();
    }
}