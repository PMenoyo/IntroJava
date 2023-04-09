
package guia3;

import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una frase o palabra de 8 caracteres: ");
        String cadena = input.nextLine();
        if (cadena.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
