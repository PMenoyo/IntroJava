
package guia3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        for (int i = 1; i <= 4; i++) { // pedir 4 números
            do {
                System.out.print("Ingrese un número entre 1 y 20: ");
                num = sc.nextInt();
            } while (num < 1 || num > 20); // verificar que el número esté en el rango permitido
            
            // imprimir el número y la cantidad de asteriscos correspondiente
            System.out.print(num + " ");
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
