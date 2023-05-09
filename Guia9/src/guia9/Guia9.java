
package Guai9;

public class Cadena {
    private String frase;
    private int longitud;

    // Constructor vacío
    public Cadena() {
    }

    // Constructor con atributo frase
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    // Getter para atributo frase
    public String getFrase() {
        return frase;
    }

    // Setter para atributo frase
    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    // Getter para atributo longitud
    public int getLongitud() {
        return longitud;
    }

    // Setter para atributo longitud (no se incluye setter ya que se actualiza automáticamente)
}
