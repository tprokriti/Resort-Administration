/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResortAdministration;

import javax.swing.JOptionPane;

/** *
 * @author USER
 */
public class CustomerLogin extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLogin
     */
    public CustomerLogin() {
        initComponents();
        this.unlocked.setVisible(false);
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
        jLabel7 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        unlocked = new javax.swing.JLabel();
        lock = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel7.setText("USERNAME  :");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, 113));

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

        kButton3.setText("LOGIN");
        kButton3.setFont(new java.awt.Font("Consolas", 1, 40)); // NOI18N
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
        kGradientPanel1.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 290, 90));

        kButton4.setText("REGISTER NOW");
        kButton4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(42, 45, 53));
        kButton4.setkBorderRadius(20);
        kButton4.setkEndColor(new java.awt.Color(89, 255, 120));
        kButton4.setkForeGround(new java.awt.Color(51, 51, 0));
        kButton4.setkHoverColor(new java.awt.Color(255, 255, 102));
        kButton4.setkHoverEndColor(new java.awt.Color(255, 241, 192));
        kButton4.setkHoverForeGround(new java.awt.Color(0, 102, 51));
        kButton4.setkHoverStartColor(new java.awt.Color(255, 255, 102));
        kButton4.setkPressedColor(new java.awt.Color(0, 204, 204));
        kButton4.setkStartColor(new java.awt.Color(240, 241, 192));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 190, 40));

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel8.setText("PASSWORD  :");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, 113));

        jLabel9.setFont(new java.awt.Font("Bodoni MT", 1, 75)); // NOI18N
        jLabel9.setText("CUSTOMER LOGIN");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 113));

        username.setFont(new java.awt.Font("Bodoni MT", 0, 30)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        kGradientPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 619, 65));

        password.setFont(new java.awt.Font("sansserif", 0, 30)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        kGradientPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 620, 60));

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel10.setText("NEW HERE?");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, -1, 45));

        unlocked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/unlocked.png"))); // NOI18N
        unlocked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unlockedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unlockedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unlockedMouseExited(evt);
            }
        });
        kGradientPanel1.add(unlocked, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 360, 60, 60));

        lock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/locked.png"))); // NOI18N
        lock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lockMouseExited(evt);
            }
        });
        kGradientPanel1.add(lock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 360, 60, 60));

        jCheckBox1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jCheckBox1.setText("SHOW PASSWORD");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel3.setText("TICK TO SEE PASSWORD");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.show();
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        String user = username.getText();
        String pass = password.getText();
        if (Welcome.jdbc.loginCustomer(user, pass)) {
            Welcome.user = username.getText();
            Welcome.pass = password.getText();
            CustomerID customerID = new CustomerID();
            customerID.show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Username and Password did not match");
            username.setText("");
            password.setText("");
            return;
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        CustomerRegistration customerRegistration = new CustomerRegistration();
        customerRegistration.show();
        dispose();
    }//GEN-LAST:event_kButton4ActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            password.setEchoChar((char)0);
            jLabel3.setText("UNTICK TO HIDE PASSWORD");
            lock.setVisible(false);
            unlocked.setVisible(true);
        }
        else{
            password.setEchoChar('*');
            jLabel3.setText("TICK TO SEE PASSWORD");
            lock.setVisible(true);
            unlocked.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void lockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lockMouseEntered
        // TODO add your handling code here:
            jLabel3.setText("CLICK TO SEE PASSWORD");
    }//GEN-LAST:event_lockMouseEntered

    private void lockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lockMouseExited
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            jLabel3.setText("UNTICK TO HIDE PASSWORD");
        }
        else{
            jLabel3.setText("TICK TO SEE PASSWORD");
        }
    }//GEN-LAST:event_lockMouseExited

    private void unlockedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unlockedMouseEntered
        // TODO add your handling code here:
        jLabel3.setText("CLICK TO HIDE PASSWORD");
    }//GEN-LAST:event_unlockedMouseEntered

    private void unlockedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unlockedMouseExited
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            jLabel3.setText("UNTICK TO HIDE PASSWORD");
        }
        else{
            jLabel3.setText("TICK TO SEE PASSWORD");
        }
    }//GEN-LAST:event_unlockedMouseExited

    private void unlockedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unlockedMouseClicked
        // TODO add your handling code here:
        lock.setVisible(true);
        unlocked.setVisible(false);
            password.setEchoChar('*');
    }//GEN-LAST:event_unlockedMouseClicked

    private void lockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lockMouseClicked
        // TODO add your handling code here:
        lock.setVisible(false);
        unlocked.setVisible(true);
        
            password.setEchoChar((char)0);
    }//GEN-LAST:event_lockMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lock;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel unlocked;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
