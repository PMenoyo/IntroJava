
package guia2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, suma;

        System.out.print("Introduce el primer número: ");
        num1 = entrada.nextInt();

        System.out.print("Introduce el segundo número: ");
        num2 = entrada.nextInt();

        suma = num1 + num2;

        System.out.println("La suma de los dos números es: " + suma);
    }
}

