
package guia3;

import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una letra:");
        String letra = scanner.nextLine();
        if (letra.length() == 1) {
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println("La letra ingresada es una vocal.");
            } else {
                System.out.println("La letra ingresada no es una vocal.");
            }
        } else {
            System.out.println("Por favor, ingresa solo una letra.");
        }
    }
}
