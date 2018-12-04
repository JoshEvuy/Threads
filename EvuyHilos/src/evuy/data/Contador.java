package evuy.data;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Contador extends Thread implements Runnable {

    private int num;
    private JLabel y01;
    private JButton y02;

    volatile boolean exe;

    public Contador(JLabel y01, JButton y02) {
        this.num = Integer.parseInt(y01.getText());
        this.y01 = y01;
        this.y02 = y02;
    }

    public void run() {

        exe = true;
        while (exe) {

            try {

                num++;
                y01.setText("" + num);
                Thread.sleep(500);

            } catch (InterruptedException ex) {

                java.util.logging.Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);

            }

            if (y02.getText().equalsIgnoreCase("Hilo 1") || y02.getText().equalsIgnoreCase("Hilo 2")) {

                parar();

            }

        }

    }

    public void parar() {

        exe = false;

    }

}
