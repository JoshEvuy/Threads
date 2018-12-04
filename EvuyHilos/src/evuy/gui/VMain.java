/* PACKAGE */
package evuy.gui;

/* IMPORTS */
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class VMain extends javax.swing.JFrame {

    /* VARIABLES */
    private static final long serialVersionUID = 2L;
    private int x, y;

    /* VMAIN */
    public VMain() {

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

    /* MAIN */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMain().setVisible(true);
               
            }
        });
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
        zTittle = new javax.swing.JLabel();
        zGo = new javax.swing.JButton();
        zImage1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zFondo.setBackground(new java.awt.Color(255, 255, 255));
        zFondo.setPreferredSize(new java.awt.Dimension(350, 350));

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

        zTittle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        zTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zTittle.setText("EVUY THREADS");

        javax.swing.GroupLayout zBarraLayout = new javax.swing.GroupLayout(zBarra);
        zBarra.setLayout(zBarraLayout);
        zBarraLayout.setHorizontalGroup(
            zBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, zBarraLayout.createSequentialGroup()
                .addComponent(zIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zTittle, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        zBarraLayout.setVerticalGroup(
            zBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zBarraLayout.createSequentialGroup()
                .addGroup(zBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zIcon)
                    .addGroup(zBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(zTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        zGo.setBackground(new java.awt.Color(217, 204, 245));
        zGo.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        zGo.setText("GO");
        zGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zGoActionPerformed(evt);
            }
        });

        zImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evuy/imgs/Kali.jpg"))); // NOI18N

        javax.swing.GroupLayout zFondoLayout = new javax.swing.GroupLayout(zFondo);
        zFondo.setLayout(zFondoLayout);
        zFondoLayout.setHorizontalGroup(
            zFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(zBarra, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(zFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(zFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zGo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        zFondoLayout.setVerticalGroup(
            zFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zFondoLayout.createSequentialGroup()
                .addComponent(zBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zGo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(zFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(zFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
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

    private void zGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zGoActionPerformed

        /* IR A MENU */
        JOptionPane.showMessageDialog(null, "Al acceder a la APP, aceptas las Condiciones de Servicio y la Política de Privacidad de Evuy.", "Evuy", JOptionPane.DEFAULT_OPTION);
        new VMenu().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_zGoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton zBaja;
    private javax.swing.JPanel zBarra;
    private javax.swing.JButton zExit;
    private javax.swing.JPanel zFondo;
    private javax.swing.JButton zGo;
    private javax.swing.JLabel zIcon;
    private javax.swing.JLabel zImage1;
    private javax.swing.JLabel zTittle;
    // End of variables declaration//GEN-END:variables
}
