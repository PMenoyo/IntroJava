
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad de euros: ");
        double euros = sc.nextDouble();

        System.out.print("Introduce la moneda a la que deseas convertir (libras, dolares o yenes): ");
        String moneda = sc.next();

        convertirMoneda(euros, moneda);
    }

    public static void convertirMoneda(double euros, String moneda) {
        double cambio;
        String monedaSimbolo;

        switch (moneda) {
            case "libras":
                cambio = 0.86;
                monedaSimbolo = "£";
                break;
            case "dolares":
                cambio = 1.28611;
                monedaSimbolo = "$";
                break;
            case "yenes":
                cambio = 129.852;
                monedaSimbolo = "¥";
                break;
            default:
                System.out.println("Moneda no soportada");
                return;
        }

        double resultado = euros * cambio;
        System.out.printf("%.2f € son %.2f %s%n", euros, resultado, monedaSimbolo);
    }
}
