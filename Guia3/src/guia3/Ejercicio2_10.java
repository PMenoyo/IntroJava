
package guia3;

import java.util.Scanner;

public class Ejercicio2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        int respuesta = -1;
        
        while (respuesta != num1 * num2) {
            System.out.print("¿Cuánto es " + num1 + " x " + num2 + "? ");
            respuesta = sc.nextInt();
            if (respuesta != num1 * num2) {
                System.out.println("Respuesta incorrecta. Inténtalo de nuevo.");
            }
        }
        
        System.out.println("¡Correcto!");
    }
}
