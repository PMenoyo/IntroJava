
package guia3;

import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa una frase o palabra: ");
        String texto = input.nextLine();

        if (texto.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
