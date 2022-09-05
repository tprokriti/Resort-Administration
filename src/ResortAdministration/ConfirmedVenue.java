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
public class ConfirmedVenue extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmResort
     */
    public ConfirmedVenue() {
        initComponents();
        fetchInfo();
    }

    void fetchInfo() {
        switch (Welcome.res) {
            case "poolCottage":
                jLabel10.setText("POOL COTTAGE");
                jLabel9.setText("26,000 BDT");
                jLabel34.setText("TWO SINGLE BEDS");
                jLabel24.setText("POOL VIEW");
                jLabel21.setText("");
                break;
            case "mountainCottage":
                jLabel10.setText("MOUNTAIN COTTAGE");
                jLabel9.setText("28,000 BDT");
                jLabel34.setText("TWO MOUNTAIN COTTAGES");
                jLabel24.setText("KITCHEN INCLUDED");
                jLabel21.setText("HILL VIEW");
                break;
            case "lakeCottage":
                jLabel10.setText("LAKE COTTAGE");
                jLabel9.setText("35,000 BDT");
                jLabel34.setText("SIX LAKE COTTAGES");
                jLabel24.setText("BREAKFAST INCLUDED");
                jLabel21.setText("LAKE VIEW");
                break;
            case "halfCottage":
                jLabel10.setText("HALF RESORT");
                jLabel9.setText("40,000 BDT");
                jLabel34.setText("FIFTEEN COTTAGES");
                jLabel24.setText("BREAKFAST INCLUDED");
                jLabel21.setText("POOL INCLUDED");
                break;
            case "fullCottage":
                jLabel10.setText("FULL RESORT");
                jLabel9.setText("80,000 BDT");
                jLabel34.setText("THIRTY FIVE COTTAGES");
                jLabel24.setText("BREAKFAST INCLUDED");
                jLabel21.setText("POOLS INCLUDED");
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 255));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(1280, 730));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton2.setText("BACK");
        kButton2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(42, 45, 53));
        kButton2.setkBorderRadius(20);
        kButton2.setkEndColor(new java.awt.Color(89, 255, 120));
        kButton2.setkForeGround(new java.awt.Color(51, 51, 0));
        kButton2.setkHoverColor(new java.awt.Color(255, 255, 102));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 241, 192));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 102, 51));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 102));
        kButton2.setkPressedColor(new java.awt.Color(0, 204, 204));
        kButton2.setkStartColor(new java.awt.Color(240, 241, 192));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 120, 50));

        jLabel9.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel9.setText("f");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 530, 70));

        jLabel21.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel21.setText("BREAKFAST EXCLUDED");
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 510, 50));

        jLabel34.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel34.setText("TWO SINGLE BEDS");
        kGradientPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 500, 60));

        jLabel20.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel20.setText("PACKAGE NAME    :");
        kGradientPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 360, 50));

        jLabel19.setFont(new java.awt.Font("Bodoni MT", 1, 69)); // NOI18N
        jLabel19.setText("CONFIRM YOUR VENUE");
        kGradientPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 750, 100));

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel10.setText("TWIN BEDS");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 510, 40));

        jLabel22.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel22.setText("SPECIFICATIONS    :");
        kGradientPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 380, 50));

        jLabel23.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel23.setText("PRICE                       :");
        kGradientPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 360, 50));

        jLabel24.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel24.setText("BREAKFAST EXCLUDED");
        kGradientPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 500, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        Home home=new Home();
        home.show();
        dispose();
    }// GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmedVenue.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmedVenue.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmedVenue.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmedVenue.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmedVenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
