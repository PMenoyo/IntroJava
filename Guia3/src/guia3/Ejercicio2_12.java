
package guia3;

public class Ejercicio2_12 {
  public static void main(String[] args) {
    for (int i = 0; i <= 999; i++) {
      String numero = String.format("%03d", i);
      String[] digitos = numero.split("");
      boolean contieneTres = false;

      for (int j = 0; j < digitos.length; j++) {
        if (digitos[j].equals("3")) {
          digitos[j] = "E";
          contieneTres = true;
        }
      }

      if (contieneTres) {
        System.out.println(String.join("-", digitos));
      } else {
        System.out.println(numero.replaceAll(".(?=.)", "$0-"));
      }
    }
  }
}
