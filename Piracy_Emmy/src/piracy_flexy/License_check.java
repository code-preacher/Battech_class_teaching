/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piracy_flexy;

import java.awt.Desktop;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author codepreacher
 */
public class License_check extends javax.swing.JFrame {

    /**
     * Creates new form License_check
     */
    public License_check() {
        initComponents();
         this.setIconImage(new ImageIcon(getClass().getResource("bsu.jpg")).getImage());
         setTitle("SubNet Calculator Licence Verification");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 20));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 58));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Validate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 120, 170));

        jLabel1.setText("<html><b>NOTE : This software is going to run on five days trial mode, if not purchased  <br>Use \"bsu\" as licence key for trial mode<b></html>");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 470, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(62, 57, 220));
        jLabel2.setText("Please enter licence key :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 10, 250, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 380, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(73, 93, 241));
        jLabel3.setText("Please enter Otp : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String lk=jTextField1.getText();
        String lk2=jTextField2.getText();
        String key="123456";
        String otp="11111";
        String trial="bsu";
        if(lk.equals("")){
        JOptionPane.showMessageDialog(null,"Please supply licence key, box cannot be empty..Use BSU as licence key for trial mode");
        }
        else if(lk.equals(trial)){ 
        dispose();
        new TrialCalculator().setVisible(true);
        
        String pc = null;
        try {
            pc = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            Logger.getLogger(License_check.class.getName()).log(Level.SEVERE, null, ex);
        }
            URI uri = null;
        try {
            uri = new URI("http://localhost/piracy/piracy_check.php?cn="+pc+"&lk="+lk);
        } catch (URISyntaxException ex) {
            Logger.getLogger(License_check.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Desktop.getDesktop().browse(uri);
        } catch (IOException ex) {
            Logger.getLogger(License_check.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        }
        else if(lk.equals(key) && lk2.equals(otp)){ 
        dispose();
        new MainCalculator().setVisible(true);
        
        String pc = null;
        try {
            pc = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            Logger.getLogger(License_check.class.getName()).log(Level.SEVERE, null, ex);
        }
            URI uri = null;
        try {
            uri = new URI("http://localhost/piracy/piracy_check.php?cn="+pc+"&lk="+lk);
        } catch (URISyntaxException ex) {
            Logger.getLogger(License_check.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Desktop.getDesktop().browse(uri);
        } catch (IOException ex) {
            Logger.getLogger(License_check.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
      
        else if(lk.equals(key) && lk2!=otp){ 
         JOptionPane.showMessageDialog(null,"Invalid Otp, Use BSU as licence key for trial mode");   
        }
        
          else if(lk != key){
         JOptionPane.showMessageDialog(null,"Invalid licence key, Use BSU as licence key for trial mode");   
        }
        else if(lk != otp){
         JOptionPane.showMessageDialog(null,"Invalid Otp, Use BSU as licence key for trial mode");   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(License_check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(License_check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(License_check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(License_check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new License_check().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
