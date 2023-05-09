
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Pedimos los dos números al usuario
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();
        
        // Mostramos las opciones de operación
        System.out.println("\nSeleccione una operación: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        
        // Realizamos la operación correspondiente
        switch(opcion) {
            case 1:
                System.out.println("\nLa suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("\nLa resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("\nLa multiplicación es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("\nLa división es: " + dividir(num1, num2));
                break;
            default:
                System.out.println("\nOpción inválida.");
                break;
        }
        
        sc.close();
    }
    
    // Funciones para realizar las operaciones matemáticas
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
