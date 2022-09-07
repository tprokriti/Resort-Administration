/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResortAdministration;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class HealthSupports extends javax.swing.JFrame {

    /**
     * Creates new form HealthSupports
     */
    DefaultTableModel model = new DefaultTableModel();

    public HealthSupports() {
        initComponents();
        setRecordsToTable();
    }

    public void setRecordsToTable() {
        try {
            Welcome.jdbc.preparedStatement = Welcome.jdbc.connection
                    .prepareStatement("SELECT * FROM support;");
            Welcome.jdbc.resultSet = Welcome.jdbc.preparedStatement.executeQuery();
            model = (DefaultTableModel) jTable1.getModel();
            while (Welcome.jdbc.resultSet.next()) {
                String username = Welcome.jdbc.resultSet.getString("username");
                Timestamp time = Welcome.jdbc.resultSet.getTimestamp("time");
                model.addRow(
                        new Object[] { username, time });
            }
            jTable1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRegistrations.class.getName()).log(Level.SEVERE, null, ex);
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
        kButton8 = new com.k33ptoo.components.KButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        kButton9 = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 120, 50));

        kButton8.setText("DELETE");
        kButton8.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        kButton8.setkBackGroundColor(new java.awt.Color(42, 45, 53));
        kButton8.setkBorderRadius(20);
        kButton8.setkEndColor(new java.awt.Color(89, 255, 120));
        kButton8.setkForeGround(new java.awt.Color(51, 51, 0));
        kButton8.setkHoverColor(new java.awt.Color(255, 255, 102));
        kButton8.setkHoverEndColor(new java.awt.Color(255, 241, 192));
        kButton8.setkHoverForeGround(new java.awt.Color(0, 102, 51));
        kButton8.setkHoverStartColor(new java.awt.Color(255, 255, 102));
        kButton8.setkPressedColor(new java.awt.Color(0, 204, 204));
        kButton8.setkStartColor(new java.awt.Color(240, 241, 192));
        kButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton8ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 640, 310, 50));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("HEALTH SUPPORT REQUESTS");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 70));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 310, 50));

        kButton9.setText("SEARCH");
        kButton9.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        kButton9.setkBackGroundColor(new java.awt.Color(42, 45, 53));
        kButton9.setkBorderRadius(20);
        kButton9.setkEndColor(new java.awt.Color(89, 255, 120));
        kButton9.setkForeGround(new java.awt.Color(51, 51, 0));
        kButton9.setkHoverColor(new java.awt.Color(255, 255, 102));
        kButton9.setkHoverEndColor(new java.awt.Color(255, 241, 192));
        kButton9.setkHoverForeGround(new java.awt.Color(0, 102, 51));
        kButton9.setkHoverStartColor(new java.awt.Color(255, 255, 102));
        kButton9.setkPressedColor(new java.awt.Color(0, 204, 204));
        kButton9.setkStartColor(new java.awt.Color(240, 241, 192));
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 310, 50));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 153, 255), new java.awt.Color(255, 204, 204)));
        jTable1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USERNAME", "TIME REQUESTED"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1200, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        AdminHome adminHome = new AdminHome();
        adminHome.show();
        dispose();
    }// GEN-LAST:event_kButton2ActionPerformed

    private void kButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton8ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_kButton8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField1ActionPerformed

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton9ActionPerformed
        // TODO add your handling code here:
        model=(DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs= new TableRowSorter<>(model);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
    }// GEN-LAST:event_kButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(HealthSupports.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthSupports.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthSupports.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthSupports.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthSupports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton8;
    private com.k33ptoo.components.KButton kButton9;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
