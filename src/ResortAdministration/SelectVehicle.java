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
public class SelectVehicle extends javax.swing.JFrame {
    public static int price = 0;
    public static int car = 0;
    public static int suv = 0;
    public static int bus = 0;
    public static int sb = 0;
    public static int yt = 0;

    /**
     * Creates new form SelectVehicle
     */
    public SelectVehicle() {
        initComponents();
        showTaka();
    }

    public void showTaka() {
        c.setText("" + car);
        su.setText("" + suv);
        b.setText("" + bus);
        speed.setText("" + sb);
        yat.setText("" + yt);
        if(price<0){
            price=0;
        }
        tot.setText(price + " BDT");
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

        componentMoverUtil1 = new com.k33ptoo.utils.ComponentMoverUtil();
        componentResizerUtil1 = new com.k33ptoo.utils.ComponentResizerUtil();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        yu = new javax.swing.JLabel();
        yd = new javax.swing.JLabel();
        yat = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        spd = new javax.swing.JLabel();
        spu = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        bd = new javax.swing.JLabel();
        bu = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        cd = new javax.swing.JLabel();
        cu = new javax.swing.JLabel();
        su = new javax.swing.JLabel();
        sud = new javax.swing.JLabel();
        suu = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/yatch.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        jLabel9.setText("SELECT VEHICLE");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, 70));

        kButton2.setText("CONFIRM");
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
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 590, 190, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/car.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 300, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/bus.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/suv.jpg"))); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/speedboat.jpg"))); // NOI18N
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
        kGradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 430, -1, 30));

        jLabel15.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        jLabel15.setText("CAR");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 30));

        yu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/up.png"))); // NOI18N
        yu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yuMouseClicked(evt);
            }
        });
        kGradientPanel1.add(yu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, -1, -1));

        yd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/down.png"))); // NOI18N
        yd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ydMouseClicked(evt);
            }
        });
        kGradientPanel1.add(yd, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, -1, -1));

        yat.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        kGradientPanel1.add(yat, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 135, 52));

        speed.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        kGradientPanel1.add(speed, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 135, 52));

        spd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/down.png"))); // NOI18N
        spd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spdMouseClicked(evt);
            }
        });
        kGradientPanel1.add(spd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, -1, -1));

        spu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/up.png"))); // NOI18N
        spu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spuMouseClicked(evt);
            }
        });
        kGradientPanel1.add(spu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, -1, -1));

        c.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        kGradientPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 135, 52));

        bd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/down.png"))); // NOI18N
        bd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdMouseClicked(evt);
            }
        });
        kGradientPanel1.add(bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, -1, -1));

        bu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/up.png"))); // NOI18N
        bu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buMouseClicked(evt);
            }
        });
        kGradientPanel1.add(bu, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, -1, -1));

        b.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        kGradientPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 340, 135, 52));

        cd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/down.png"))); // NOI18N
        cd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cdMouseClicked(evt);
            }
        });
        kGradientPanel1.add(cd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        cu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/up.png"))); // NOI18N
        cu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuMouseClicked(evt);
            }
        });
        kGradientPanel1.add(cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        su.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        kGradientPanel1.add(su, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 135, 52));

        sud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/down.png"))); // NOI18N
        sud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sudMouseClicked(evt);
            }
        });
        kGradientPanel1.add(sud, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        suu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ResortAdministration/Images/up.png"))); // NOI18N
        suu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suuMouseClicked(evt);
            }
        });
        kGradientPanel1.add(suu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        tot.setFont(new java.awt.Font("Bodoni MT", 1, 30)); // NOI18N
        tot.setText("BUS");
        kGradientPanel1.add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, 210, 90));

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

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuMouseClicked
        // TODO add your handling code here:
        car++;
        price+=15000;
        showTaka();
    }//GEN-LAST:event_cuMouseClicked

    private void suuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suuMouseClicked
        // TODO add your handling code here:
        suv++;
        price+=20000;
        showTaka();
    }//GEN-LAST:event_suuMouseClicked

    private void buMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buMouseClicked
        // TODO add your handling code here:
        bus++;
        price+=40000;
        showTaka();
    }//GEN-LAST:event_buMouseClicked

    private void spuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spuMouseClicked
        // TODO add your handling code here:
        sb++;
        price+=20000;
        showTaka();
    }//GEN-LAST:event_spuMouseClicked

    private void yuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yuMouseClicked
        // TODO add your handling code here:
        yt++;
        price+=96000;
        showTaka();
    }//GEN-LAST:event_yuMouseClicked

    private void cdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cdMouseClicked
        // TODO add your handling code here:
        price-=15000;
        if (car > 0) {
            car--;
        }
        showTaka();
    }//GEN-LAST:event_cdMouseClicked

    private void sudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sudMouseClicked
        // TODO add your handling code here:
        price-=20000;
        if (suv > 0) {
            suv--;
        }
        showTaka();
    }//GEN-LAST:event_sudMouseClicked

    private void bdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdMouseClicked
        // TODO add your handling code here:
        price-=40000;
        if (bus > 0) {
            bus--;
        }
        showTaka();
    }//GEN-LAST:event_bdMouseClicked

    private void spdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spdMouseClicked
        // TODO add your handling code here:
        price-=20000;
        if (sb > 0) {
            sb--;
        }
        showTaka();
    }//GEN-LAST:event_spdMouseClicked

    private void ydMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ydMouseClicked
        // TODO add your handling code here:
        price-=96000;
        if (yt > 0) {
            yt--;
        }
        showTaka();
    }//GEN-LAST:event_ydMouseClicked

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        Welcome.jdbc.tour();
        Home home=new Home();
        home.show();
        dispose();
    }// GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        Welcome.loc="";
        Welcome.des="";
        BookTour bookTour=new BookTour();
        bookTour.show();
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
            java.util.logging.Logger.getLogger(SelectVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b;
    private javax.swing.JLabel bd;
    private javax.swing.JLabel bu;
    private javax.swing.JLabel c;
    private javax.swing.JLabel cd;
    private com.k33ptoo.utils.ComponentMoverUtil componentMoverUtil1;
    private com.k33ptoo.utils.ComponentResizerUtil componentResizerUtil1;
    private javax.swing.JLabel cu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel spd;
    private javax.swing.JLabel speed;
    private javax.swing.JLabel spu;
    private javax.swing.JLabel su;
    private javax.swing.JLabel sud;
    private javax.swing.JLabel suu;
    private javax.swing.JLabel tot;
    private javax.swing.JLabel yat;
    private javax.swing.JLabel yd;
    private javax.swing.JLabel yu;
    // End of variables declaration//GEN-END:variables
}
