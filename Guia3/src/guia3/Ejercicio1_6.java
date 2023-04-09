
package guia3;

import java.util.Scanner;

public class Ejercicio1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean salir = false;

        System.out.println("Ingrese dos números enteros positivos:");
        System.out.print("Número 1: ");
        num1 = sc.nextInt();
        System.out.print("Número 2: ");
        num2 = sc.nextInt();

        while (!salir) {
            System.out.println("\nMENU:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("El resultado de la división es: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

        System.out.println("Fin del programa");
    }
}
