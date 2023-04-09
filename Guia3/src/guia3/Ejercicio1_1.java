
package guia3;

import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Introduce un número entero: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " es un número par");
        } else {
            System.out.println(num + " es un número impar");
        }
    }
}
