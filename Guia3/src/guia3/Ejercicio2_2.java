
package guia3;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;

        System.out.println("Valores iniciales:");
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);

        int aux = B;

        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valores finales:");
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);
    }
}
