
package guia3;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0, contador = 0;
        
        do {
            
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();
            
            if(numero == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
            
            if(numero > 0) {
                suma += numero;
                contador++;
            }
            
        } while(contador < 20);
        
        System.out.println("La suma de los números leídos es: " + suma);
        
    }

}
