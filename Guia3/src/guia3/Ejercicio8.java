
package guia3;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Introduzca una nota entre 0 y 10: ");
            nota = input.nextDouble();
        } while (nota < 0 || nota > 10);

        System.out.println("La nota introducida es: " + nota);
    }
}
