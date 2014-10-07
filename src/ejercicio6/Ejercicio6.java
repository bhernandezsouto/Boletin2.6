/*
 Realizar un programa que saque por pantalla el porcentaje de descuento en una compra
 introduciendo por teclado el precio de la tarifa y el precio pagado
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author bhernandezsouto
 */
public class Ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float precioPagado, precioTotal,porcentajeD;
        Scanner ab = new Scanner(System.in);
        System.out.println("Intruduzca el Precio Total de la compra: ");
        precioTotal = ab.nextFloat();
        System.out.println("Intruduzca el Precio Pagado de la compra: ");
        precioPagado = ab.nextFloat();
        porcentajeD = ((precioTotal-precioPagado)*100)/precioTotal;
        System.out.println("El porcentaje de descuento de la compra es: " + porcentajeD + "%");   
    } 
}
