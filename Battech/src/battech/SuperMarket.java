/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battech;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MY PC
 */
public class SuperMarket extends javax.swing.JFrame {

    /**
     * Creates new form SuperMarket
     */
    public SuperMarket() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" My super market");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(146, 221, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("     ITEMS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 70, 20));

        jLabel2.setText("PRICE LIST");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 60, 30));

        jLabel3.setText("   QUANTITY OF GOODS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 130, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("  VEST");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setText("  MILK");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 80, 80, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setText(" SUGAR");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setText("  SALT");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, 30));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setText("  JUICE");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 200, 80, 30));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6.setText(" WINE");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 240, 80, 30));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setText(" SOAP");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 80, 30));

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setText(" MILO");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, 30));

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField9.setText(" SPRAY");
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 360, 80, 30));

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField10.setText(" PENCIL");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 80, 30));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField11.setText("  500");
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 90, 30));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField12.setText("  1,500");
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 90, 30));

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField13.setText("  10,000");
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 90, 30));

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField14.setText("  2,600");
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 90, 30));

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField15.setText("  5,000");
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 90, 30));

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField16.setText("  12,000");
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 90, 30));

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField17.setText("  1,000");
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 90, 30));

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField18.setText("  1,200");
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 90, 30));

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField19.setText("  1,000");
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 90, 30));

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField20.setText("  200");
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 90, 30));

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 130, 30));
        jPanel1.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 130, 30));
        jPanel1.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 130, 30));
        jPanel1.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 130, 30));
        jPanel1.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 130, 30));
        jPanel1.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 130, 30));

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 130, 30));
        jPanel1.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 130, 30));
        jPanel1.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 130, 30));
        jPanel1.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 130, 30));

        jTextField31.setEditable(false);
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 160, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("   RECEIPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 160, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("  CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 130, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("  TOTAL COST :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 140, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("SUM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 430, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 570, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        //TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double n1 = Double.parseDouble(jTextField21.getText());
        double n2 = Double.parseDouble(jTextField22.getText());
        double n3 = Double.parseDouble(jTextField23.getText());
        double n4 = Double.parseDouble(jTextField24.getText());
        double n5 = Double.parseDouble(jTextField25.getText());
        double n6 = Double.parseDouble(jTextField26.getText());
        double n7 = Double.parseDouble(jTextField27.getText());
        double n8 = Double.parseDouble(jTextField28.getText());
        double n9 = Double.parseDouble(jTextField29.getText());
        double n10 = Double.parseDouble(jTextField30.getText());
        double Sum = (n1 * 500) + (n2 * 1500) + (n3 * 10000) + (n4 * 2600) + (n5 * 5000) + (n6 * 12000) + (n7 * 1000) + (n8 * 1200) + (n9 * 1000) + (n10 * 200);
        jTextField31.setText("₦" + String.valueOf(Sum));         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            jTextField1.print(); 
             jTextField2.print();
              jTextField3.print();
               jTextField4.print();
                jTextField5.print();
                 jTextField6.print();
                  jTextField7.print();
                   jTextField8.print();
                    jTextField9.print();
                     jTextField10.print();
        } catch (PrinterException ex) {
            Logger.getLogger(BattechMarket.class.getName()).log(Level.SEVERE, null, ex);

        }
        JOptionPane.showMessageDialog(null, "This is your receipt ");    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

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
            java.util.logging.Logger.getLogger(SuperMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperMarket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
