
import java.util.Scanner;

public class Ejercicio4 {

    public static boolean esPrimo(int numero) {
        if(numero <= 1) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(numero); i++) {
            if(numero%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();

        if(esPrimo(num)) {
            System.out.println(num + " es un número primo");
        } else {
            System.out.println(num + " no es un número primo");
        }
    }
}
