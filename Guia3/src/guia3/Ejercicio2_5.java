
package guia3;

import java.util.Scanner;

public class Ejercicio2_5 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese la letra que representa la clase del socio (A/B/C): ");
      char clase = sc.next().charAt(0);
      System.out.println("Ingrese el costo del tratamiento: ");
      double costo = sc.nextDouble();
      double descuento = 0.0;
      double totalAPagar = 0.0;

      switch (clase) {
         case 'A':
            descuento = costo * 0.5;
            totalAPagar = costo - descuento;
            break;
         case 'B':
            descuento = costo * 0.35;
            totalAPagar = costo - descuento;
            break;
         case 'C':
            totalAPagar = costo;
            break;
         default:
            System.out.println("La clase de socio ingresada es incorrecta.");
            break;
      }
      System.out.println("El importe a pagar es: $" + totalAPagar);
   }
}
