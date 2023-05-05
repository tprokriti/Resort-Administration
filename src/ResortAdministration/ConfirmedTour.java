/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResortAdministration;

/**
 *
 * @author USER
 */
public class ConfirmedTour extends javax.swing.JFrame {

    /**
     * Creates new form SelectVehicle
     */
    public ConfirmedTour() {
        initComponents();
        showTaka();
    }

    public void showTaka() {
        c.setText("CARS: " + SelectVehicle.car);
        su.setText("SUVs: " + SelectVehicle.suv);
        b.setText("BUSES: " + SelectVehicle.bus);
        speed.setText("SPEED BOATS: " + SelectVehicle.sb);
        yat.setText("YACHTES: " + SelectVehicle.yt);
        tot.setText(SelectVehicle.price + " BDT");
        switch (Welcome.des) {
            case "forest":
                tot1.setText("FOREST PACKAGE: " + Welcome.loc);
                break;
            case "beach":
                tot1.setText("BEACH PACKAGE: " + Welcome.loc);
                break;
            case "town":
                tot1.setText("TOWN PACKAGE: " + Welcome.loc);
                break;
            case "island":
                tot1.setText("ISLAND PACKAGE: " + Welcome.loc);
                break;
            case "mountain":
                tot1.setText("MOUNTAIN PACKAGE: " + Welcome.loc);
                break;

            default:
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        componentMoverUtil1 = new com.k33ptoo.utils.ComponentMoverUtil();
        componentResizerUtil1 = new com.k33ptoo.utils.ComponentResizerUtil();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        yat = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        su = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();
        jLabel16 = new javax.swing.JLabel();
        tot1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(201, 233, 232));
        kGradientPanel1.setkStartColor(new java.awt.Color(253, 221, 121));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/yatch.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel9.setText("CONFIRMED TOUR");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/car.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 300, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/bus.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/suv.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        jLabel5.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/speedboat.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel11.setText("YATCH");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, 30));

        jLabel12.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel12.setText(" SPEED BOAT");
        kGradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, 30));

        jLabel13.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel13.setText("SUV");
        kGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, 30));

        jLabel14.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel14.setText("AMOUNT");
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 520, -1, 30));

        jLabel15.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel15.setText("CAR");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 30));

        yat.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        kGradientPanel1.add(yat, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, 135, 52));

        speed.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        kGradientPanel1.add(speed, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, 220, 52));

        c.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        kGradientPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 135, 52));

        b.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        kGradientPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, 135, 52));

        su.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        kGradientPanel1.add(su, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 135, 52));

        tot.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        tot.setText("BUS");
        kGradientPanel1.add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 560, 210, 60));

        jLabel28.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel28.setText("BUS");
        kGradientPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, -1, 30));

        kButton3.setText("BACK");
        kButton3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(42, 45, 53));
        kButton3.setkBorderRadius(20);
        kButton3.setkEndColor(new java.awt.Color(89, 255, 120));
        kButton3.setkForeGround(new java.awt.Color(51, 51, 0));
        kButton3.setkHoverColor(new java.awt.Color(255, 255, 102));
        kButton3.setkHoverEndColor(new java.awt.Color(255, 241, 192));
        kButton3.setkHoverForeGround(new java.awt.Color(0, 102, 51));
        kButton3.setkHoverStartColor(new java.awt.Color(255, 255, 102));
        kButton3.setkPressedColor(new java.awt.Color(0, 204, 204));
        kButton3.setkStartColor(new java.awt.Color(240, 241, 192));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 120, 50));

        jLabel16.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel16.setText("DESTINATION");
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 390, -1, 30));

        tot1.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        tot1.setText("BUS");
        kGradientPanel1.add(tot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 360, 60));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.show();
        dispose();
    }// GEN-LAST:event_kButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfirmedTour.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmedTour.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmedTour.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmedTour.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmedTour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b;
    private javax.swing.JLabel c;
    private com.k33ptoo.utils.ComponentMoverUtil componentMoverUtil1;
    private com.k33ptoo.utils.ComponentResizerUtil componentResizerUtil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel speed;
    private javax.swing.JLabel su;
    private javax.swing.JLabel tot;
    private javax.swing.JLabel tot1;
    private javax.swing.JLabel yat;
    // End of variables declaration//GEN-END:variables
}
