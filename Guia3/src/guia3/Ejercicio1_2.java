
package guia3;

import java.util.Scanner;

public class Ejercicio1_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa una frase: ");
    String frase = sc.nextLine();
    
    if (frase.equals("eureka")) {
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
  }
}
