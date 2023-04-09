
package guia3;

import java.util.Scanner;

public class Ejercicio2_7e {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de valores que desea introducir: ");
        int n = entrada.nextInt();
        
        double suma = 0;
        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;
        int contador = 1;
        
        do {
            System.out.print("Ingrese el valor #" + contador + ": ");
            double valor = entrada.nextDouble();
            
            suma += valor;
            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo) {
                minimo = valor;
            }
            
            contador++;
        } while (contador <= n);
        
        double promedio = suma / n;
        
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
        System.out.println("El promedio es: " + promedio);
    }

}
