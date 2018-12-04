package evuy.data;

import java.util.logging.Level;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Contadores extends Thread implements Runnable {

    private JLabel x01;
    private JLabel x02;
    private JLabel x03;

    public Contadores(JLabel x01, JLabel x02, JLabel x03) {
        this.x01 = x01;
        this.x02 = x02;
        this.x03 = x03;
    }

    volatile boolean exe = false;
    int ensalada = 0;

    public void run() {

        while (!exe) {

            String y01 = x01.getText();
            String y02 = x02.getText();

            int z01 = Integer.parseInt(y01);
            int z02 = Integer.parseInt(y02);

            ensalada = z01 + z02;
            x03.setText("" + ensalada);

            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void parar() {

        exe = true;

    }

}
