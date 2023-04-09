
package guia3;

import java.util.Scanner;

public class Ejercicio1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del cuadrado: ");
        int n = sc.nextInt();
        
        // Imprimir la primera fila con N asteriscos
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        
        // Imprimir las filas intermedias con un asterisco al principio y al final
        for (int i = 1; i <= n - 2; i++) {
            System.out.print("* ");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        
        // Imprimir la última fila con N asteriscos
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
