
package roloj;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

public class Reloj extends JFrame {
    private final JLabel etiquetaHora;

    public Reloj() {
        setTitle("Reloj");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        etiquetaHora = new JLabel();
        etiquetaHora.setFont(new Font("Arial", Font.BOLD, 48));
        etiquetaHora.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(etiquetaHora, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    public void mostrarHora() {
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        etiquetaHora.setText(formatoHora.format(calendario.getTime()));
    }

    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        while (true) {
            reloj.mostrarHora();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

