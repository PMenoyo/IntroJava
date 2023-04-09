
package guia2;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce una frase: ");
    String frase = scanner.nextLine();

    String fraseMayusculas = frase.toUpperCase();
    String fraseMinusculas = frase.toLowerCase();

    System.out.println("Frase en mayúsculas: " + fraseMayusculas);
    System.out.println("Frase en minúsculas: " + fraseMinusculas);
  }
}
