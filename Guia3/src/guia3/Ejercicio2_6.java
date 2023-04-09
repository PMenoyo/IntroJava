
package guia3;

import java.util.Scanner;

public class Ejercicio2_6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de personas: ");
        int n = sc.nextInt();
        
        double sumAlturas = 0;
        int countAlturasBajo160 = 0;
        double sumAlturasBajo160 = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la altura de la persona " + (i+1) + " en metros: ");
            double altura = sc.nextDouble();
            sumAlturas += altura;
            
            if (altura < 1.6) {
                sumAlturasBajo160 += altura;
                countAlturasBajo160++;
            }
        }
        
        double promedioAlturas = sumAlturas / n;
        double promedioAlturasBajo160 = sumAlturasBajo160 / countAlturasBajo160;
        
        System.out.println("El promedio de estaturas en general es: " + promedioAlturas + " metros");
        System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + promedioAlturasBajo160 + " metros");
        
        sc.close();
    }

}
