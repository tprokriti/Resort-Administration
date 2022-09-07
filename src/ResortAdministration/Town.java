/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResortAdministration;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author USER
 */
public class Town extends javax.swing.JFrame {

    /**
     * Creates new form Town
     */
    
    Image[] imgs = new Image[3];
    int position = 0;
    public Town() {
        initComponents();
        try {
            imgs[0] = ImageIO.read(new File("src\\ResortAdministration\\Images\\Tour\\town1.jpg"));
            imgs[1] = ImageIO.read(new File("src\\ResortAdministration\\Images\\Tour\\town2.jpg"));
            imgs[2] = ImageIO.read(new File("src\\ResortAdministration\\Images\\Tour\\town3.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        show(position);
    }
    
    public void show(int index) {
        ImageIcon icon = new ImageIcon();
        icon.setImage(imgs[index]);
        Image image = icon.getImage().getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
        label1.setIcon(new ImageIcon(image));
        switch (index) {
            case 0:
                jLabel9.setText("SEAPORT CITY");
                break;
            case 1:
                jLabel9.setText("MEXICO CITY");
                break;
            case 2:
                jLabel9.setText("ORANGE TOWN");
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kButton3 = new com.k33ptoo.components.KButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 255));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(1280, 730));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton3.setText("SELECT");
        kButton3.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
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
        kGradientPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, 220, 70));

        jLabel9.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        jLabel9.setText("ORANGE TOWN");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/right.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 330, 69, 69));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/left.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 69, 69));

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/Home/cottage.jpg"))); // NOI18N
        kGradientPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 889, 500));

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

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        Welcome.loc="";
        SelectVehicle selectVehicle=new SelectVehicle();
       selectVehicle.show();
       dispose();
    }//GEN-LAST:event_kButton3ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        new Thread();
        try {
            Thread.sleep(300);

        } catch (InterruptedException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p = this.label1.getX();
        if (p > -1) {
            Animacion.Animacion.mover_izquierda(900, 200, 1, 2, label1);
        }
        position = position + 1;
        if (position >= imgs.length) {
            position = 0;
        }
        show(position);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        new Thread();
        try {
            Thread.sleep(300);

        } catch (InterruptedException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p = this.label1.getX();
        if (p > -1) {
            Animacion.Animacion.mover_izquierda(900, 200, 1, 2, label1);
        }
        position = position - +1;
        if (position < 0) {
            position = imgs.length - 1;
        }
        show(position);
    }//GEN-LAST:event_jLabel2MousePressed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        Welcome.des="";
        BookTour bookTour=new BookTour();
        bookTour.show();
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Town.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Town.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Town.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Town.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Town().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
