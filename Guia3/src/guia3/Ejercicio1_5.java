
package guia3;

import java.util.Scanner;

public class Ejercicio1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el límite al usuario
        System.out.print("Ingrese el valor límite positivo: ");
        int limite = scanner.nextInt();

        // Solicitar números al usuario hasta que la suma supere el límite
        int suma = 0;
        int numero;
        int contador = 0;
        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            suma += numero;
            contador++;
        }

        // Imprimir el resultado
        System.out.println("La suma de los " + contador + " números ingresados es " + suma + ".");
    }
}
