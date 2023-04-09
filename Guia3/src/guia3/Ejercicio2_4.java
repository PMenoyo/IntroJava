
package guia3;

import java.util.Scanner;

public class Ejercicio2_4 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese un número entre 1 y 10: ");
      int numero = sc.nextInt();

      String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

      if (numero >= 1 && numero <= 10) {
         System.out.println("El número " + numero + " en romano es: " + romanos[numero]);
      } else {
         System.out.println("El número ingresado no está en el rango válido.");
      }
   }
}
