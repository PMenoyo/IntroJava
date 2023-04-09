
package guia2;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número entero: ");
    int numero = sc.nextInt();

    // Mostrar el doble del número
    System.out.println("El doble de " + numero + " es: " + (2 * numero));

    // Mostrar el triple del número
    System.out.println("El triple de " + numero + " es: " + (3 * numero));

    // Mostrar la raíz cuadrada del número
    double raizCuadrada = Math.sqrt(numero);
    System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
  }
}
