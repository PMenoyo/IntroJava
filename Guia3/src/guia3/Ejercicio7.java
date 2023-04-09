
package guia3;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        int tipoMotor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor para el tipo de motor (entre 1 y 4): ");
        tipoMotor = scanner.nextInt();

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }

    }

}
