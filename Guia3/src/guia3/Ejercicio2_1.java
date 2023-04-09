
package guia3;

import java.util.Scanner;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de minutos a convertir: ");
        int minutos = sc.nextInt();
        sc.close();
        
        int horas = minutos / 60;
        int dias = horas / 24;
        horas = horas % 24;
        
        System.out.println(minutos + " minutos son equivalentes a " + dias + " días y " + horas + " horas.");
    }
}

