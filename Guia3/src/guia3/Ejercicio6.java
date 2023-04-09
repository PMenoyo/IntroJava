
package guia3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int numero1 = input.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int numero2 = input.nextInt();

        if (numero1 > 25 && numero2 > 25) {
            System.out.println("Ambos números son mayores a 25.");
        } else if (numero1 > 25 || numero2 > 25) {
            System.out.println("Al menos uno de los números es mayor a 25.");
        } else {
            System.out.println("Ninguno de los números es mayor a 25.");
        }

        input.close();
    }
}
