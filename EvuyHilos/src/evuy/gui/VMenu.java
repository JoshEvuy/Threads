/* PACKAGE */
package evuy.gui;

/* IMPORTS */
import com.sun.awt.AWTUtilities;
import evuy.data.Contador;
import evuy.data.Contadores;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class VMenu extends javax.swing.JFrame {

    /* VARIABLES */
    private static final long serialVersionUID = 2L;
    private int x, y;


    /* VMAIN */
    public VMenu() {

        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);

        zBarra.setBackground(Color.white);
        zBarra.setOpaque(true);
        zBarra.setFocusable(false);

        zExit.setFocusable(false);
        zBaja.setFocusable(false);

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
        AWTUtilities.setWindowShape(this, forma);

    }

    /* JFrame CODE */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zFondo = new javax.swing.JPanel();
        zBarra = new javax.swing.JPanel();
        zExit = new javax.swing.JButton();
        zBaja = new javax.swing.JButton();
        zIcon = new javax.swing.JLabel();
        zVuelve = new javax.swing.JButton();
        zTittle2 = new javax.swing.JLabel();
        zHilo1 = new javax.swing.JButton();
        zHilo2 = new javax.swing.JButton();
        zShow1 = new javax.swing.JLabel();
        zShow2 = new javax.swing.JLabel();
        zHilo3 = new javax.swing.JButton();
        zShow3 = new javax.swing.JLabel();
        zLimpia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zFondo.setBackground(new java.awt.Color(255, 255, 255));

        zBarra.setBackground(new java.awt.Color(240, 235, 235));
        zBarra.setPreferredSize(new java.awt.Dimension(448, 50));
        zBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                zBarraMouseDragged(evt);
            }
        });
        zBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                zBarraMousePressed(evt);
            }
        });

        zExit.setText("X");
        zExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zExitActionPerformed(evt);
            }
        });

        zBaja.setText("_");
        zBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zBajaActionPerformed(evt);
            }
        });

        zIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evuy/imgs/IcoLogo.jpg"))); // NOI18N

        zVuelve.setText("◄");
        zVuelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zVuelveActionPerformed(evt);
            }
        });

        zTittle2.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        zTittle2.setText("EVUY COUNT THREADS");

        javax.swing.GroupLayout zBarraLayout = new javax.swing.GroupLayout(zBarra);
        zBarra.setLayout(zBarraLayout);
        zBarraLayout.setHorizontalGroup(
            zBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, zBarraLayout.createSequentialGroup()
                .addComponent(zIcon)
                .addGap(18, 18, 18)
                .addComponent(zTittle2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(zVuelve, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        zBarraLayout.setVerticalGroup(
            zBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zBarraLayout.createSequentialGroup()
                .addGroup(zBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(zTittle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, zBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zVuelve, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        zHilo1.setBackground(new java.awt.Color(117, 117, 241));
        zHilo1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        zHilo1.setText("Hilo 1");
        zHilo1.setActionCommand("Hilo 1");
        zHilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zHilo1ActionPerformed(evt);
            }
        });

        zHilo2.setBackground(new java.awt.Color(117, 117, 241));
        zHilo2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        zHilo2.setText("Hilo 2");
        zHilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zHilo2ActionPerformed(evt);
            }
        });

        zShow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zShow1.setText("0");

        zShow2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zShow2.setText("0");

        zHilo3.setBackground(new java.awt.Color(117, 117, 241));
        zHilo3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        zHilo3.setText("Hilo 3");
        zHilo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zHilo3ActionPerformed(evt);
            }
        });

        zShow3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zShow3.setText("0");

        zLimpia.setBackground(new java.awt.Color(117, 117, 241));
        zLimpia.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        zLimpia.setText("RESET");
        zLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zLimpiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout zFondoLayout = new javax.swing.GroupLayout(zFondo);
        zFondo.setLayout(zFondoLayout);
        zFondoLayout.setHorizontalGroup(
            zFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(zBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(zFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(zFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(zLimpia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zHilo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zHilo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(zHilo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(zFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zShow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zShow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zShow3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        zFondoLayout.setVerticalGroup(
            zFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zFondoLayout.createSequentialGroup()
                .addComponent(zBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(zFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zShow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zHilo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(zFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zShow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zHilo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(zFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zHilo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zShow3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(zLimpia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(zFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(zFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zExitActionPerformed

        /* CERRAR PROGRAMA */
        System.exit(0);

    }//GEN-LAST:event_zExitActionPerformed

    private void zBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zBarraMousePressed

        /* PULSAR BARRA */
        x = evt.getX();
        y = evt.getY();

    }//GEN-LAST:event_zBarraMousePressed

    private void zBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zBajaActionPerformed

        /* OCULTAR PROGRAMA */
        setExtendedState(ICONIFIED);

    }//GEN-LAST:event_zBajaActionPerformed

    private void zBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zBarraMouseDragged

        /* MOVER BARRA */
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);

    }//GEN-LAST:event_zBarraMouseDragged

    private void zVuelveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zVuelveActionPerformed

        /* VOLVER ATRAS */
        new VMain().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_zVuelveActionPerformed

    private void zHilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zHilo1ActionPerformed

        /* HILO 1 */
        Contador Hilo1 = new Contador(zShow1, zHilo1);
        Thread t1 = new Thread(Hilo1);

        if (zHilo1.getText().equals("Hilo 1")) {

            zHilo1.setText("Parar");
            t1.start();

        } else if (zHilo1.getText().equals("Parar")) {

            zHilo1.setText("Hilo 1");
            Hilo1.parar();

        }

    }//GEN-LAST:event_zHilo1ActionPerformed

    private void zHilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zHilo2ActionPerformed

        /* HILO 2 */
        Contador Hilo2 = new Contador(zShow2, zHilo2);
        Thread t2 = new Thread(Hilo2);

        if (zHilo2.getText().equals("Hilo 2")) {

            zHilo2.setText("Parar");
            t2.start();

        } else if (zHilo2.getText().equals("Parar")) {

            zHilo2.setText("Hilo 2");
            Hilo2.parar();

        }

    }//GEN-LAST:event_zHilo2ActionPerformed

    private void zHilo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zHilo3ActionPerformed

        /* HILO 3 */
        Contadores Cont1 = new Contadores(zShow1, zShow2, zShow3);
        Thread t3 = new Thread(Cont1);

        t3.start();
        /*if (zHilo3.getText().equals("Hilo 3")) {

            zHilo3.setText("Parar");
            t3.start();

        } else if (zHilo3.getText().equals("Parar")) {

            zHilo3.setText("Hilo 3");
            Cont1.parar();

        }*/

    }//GEN-LAST:event_zHilo3ActionPerformed

    private void zLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zLimpiaActionPerformed

        /* HILO 4*/
        zHilo1.setText("Hilo 1");
        zHilo2.setText("Hilo 2");
        zHilo3.setText("Hilo 3");

        zShow1.setText("0");
        zShow2.setText("0");
        zShow3.setText("0");

    }//GEN-LAST:event_zLimpiaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton zBaja;
    private javax.swing.JPanel zBarra;
    private javax.swing.JButton zExit;
    private javax.swing.JPanel zFondo;
    private javax.swing.JButton zHilo1;
    private javax.swing.JButton zHilo2;
    private javax.swing.JButton zHilo3;
    private javax.swing.JLabel zIcon;
    private javax.swing.JButton zLimpia;
    private javax.swing.JLabel zShow1;
    private javax.swing.JLabel zShow2;
    private javax.swing.JLabel zShow3;
    private javax.swing.JLabel zTittle2;
    private javax.swing.JButton zVuelve;
    // End of variables declaration//GEN-END:variables
}
