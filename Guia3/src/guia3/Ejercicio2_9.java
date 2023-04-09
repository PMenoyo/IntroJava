
package guia3;

import java.util.Scanner;

public class Ejercicio2_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el dividendo: ");
        int dividendo = input.nextInt();
        
        System.out.print("Ingrese el divisor: ");
        int divisor = input.nextInt();
        
        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + dividendo);
    }
}

