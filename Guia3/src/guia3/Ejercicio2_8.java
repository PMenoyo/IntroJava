
package guia3;

import java.util.Scanner;

public class Ejercicio2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0, countPares = 0, countImpares = 0;
        while (true) {
            System.out.print("Ingrese un número entero: ");
            num = sc.nextInt();
            if (num % 5 == 0) {
                System.out.println("El número ingresado es múltiplo de cinco, deteniendo la lectura...");
                break;
            } else if (num >= 0) {
                count++;
                if (num % 2 == 0) {
                    countPares++;
                } else {
                    countImpares++;
                }
            }
        }
        System.out.println("Cantidad de números leídos: " + count);
        System.out.println("Cantidad de números pares: " + countPares);
        System.out.println("Cantidad de números impares: " + countImpares);
    }
}
