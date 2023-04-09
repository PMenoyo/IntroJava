
package guia3;

import java.util.Scanner;

public class Ejercicio2_14{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la cantidad de familias
        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = sc.nextInt();

        double mediaTotal = 0; // Variable acumuladora global para la media de edades

        // Bucle para cada familia
        for (int i = 1; i <= numFamilias; i++) {
            System.out.println("Familia " + i + ": ");

            // Pedir la cantidad de hijos de la familia
            System.out.print("Ingrese la cantidad de hijos: ");
            int numHijos = sc.nextInt();

            int sumaEdades = 0; // Variable acumuladora para la suma de edades

            // Bucle para cada hijo de la familia
            for (int j = 1; j <= numHijos; j++) {
                // Pedir la edad del hijo
                System.out.print("Ingrese la edad del hijo " + j + ": ");
                int edadHijo = sc.nextInt();
                sumaEdades += edadHijo; // Acumular la edad del hijo en la suma de edades
            }

            double mediaFamilia = (double) sumaEdades / numHijos; // Calcular la media de edad de la familia
            mediaTotal += mediaFamilia; // Acumular la media de edad de la familia en la media total

            System.out.println("La media de edad de los hijos de la familia " + i + " es: " + mediaFamilia);
            System.out.println();
        }

        double mediaFinal = mediaTotal / numFamilias; // Calcular la media final de todas las familias
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaFinal);

        sc.close();
    }

}
