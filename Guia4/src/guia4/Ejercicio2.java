import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de personas: ");
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = input.next();
            System.out.print("Ingrese la edad de la persona: ");
            int edad = input.nextInt();
            
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }
            
            System.out.print("¿Quiere seguir mostrando personas? (Sí/No) ");
            String respuesta = input.next();
            if (respuesta.equalsIgnoreCase("No")) {
                break;
            }
        }
    }
}
