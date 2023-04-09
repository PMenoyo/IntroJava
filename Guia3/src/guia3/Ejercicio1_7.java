
package guia3;

import java.util.Scanner;

public class Ejercicio1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctCount = 0;
        int incorrectCount = 0;

        while (true) {
            String input = sc.nextLine();
            if (input.equals("&&&&&")) {
                break; // Finalizar el programa
            } else if (input.length() == 5 && input.charAt(0) == 'X' && input.charAt(4) == 'O') {
                correctCount++;
            } else {
                incorrectCount++;
            }
        }

        System.out.println("Cantidad de lecturas correctas: " + correctCount);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrectCount);
    }
}
