/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LPZFILES;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PETER SAMUEL OCHE
 */
public class DECOMPRESSION extends javax.swing.JFrame {
    static public String[] arrayOfChar;
    static public String filename="",extension="";
    static public int dictSize = 256, currentword, previousword;
    static public byte[] buffer = new byte[3];
    static public boolean isLeft = true;
    /**
     * Creates new form DECOMPRESSION
     */
    public DECOMPRESSION() {
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

        url = new javax.swing.JTextField();
        ext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenuItem();
        Back = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DECOMPRESSION");
        setBounds(new java.awt.Rectangle(200, 100, 200, 100));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        url.setBorder(null);
        getContentPane().add(url, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 260, 20));

        ext.setBorder(null);
        getContentPane().add(ext, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 216, 260, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DECOM.PNG"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setText("Please enter the LZW file with it's URL and extension to decompress:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 290, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Enter extension of output image required (Ex: for .bmp enter bmp)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 310, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Note- Extension must be same as the original image:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 270, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/decompression.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 530));

        jMenu1.setText("File");

        About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenu1.add(About);

        Help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });
        jMenu1.add(Help);

        Back.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jMenu1.add(Back);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "ABOUT THIS SOFTWARE");
    }//GEN-LAST:event_AboutActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "HELP OF THIS SOFTWARE");
    }//GEN-LAST:event_HelpActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
       dispose();
       new Splash().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
        filename = url.getText();
        extension = ext.getText();
        try {
            File file = new File(filename);
            decompress();
            JOptionPane.showMessageDialog(null,"Decompression complete! Check file output_image."+extension);      
        }
        catch(IOException ie) {
            JOptionPane.showMessageDialog(null,"File "+filename+" not found!");
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
            java.util.logging.Logger.getLogger(DECOMPRESSION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DECOMPRESSION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DECOMPRESSION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DECOMPRESSION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DECOMPRESSION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenuItem Back;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Help;
    private javax.swing.JTextField ext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables

public static void decompress() throws IOException {
        arrayOfChar = new String[4096];
        int i;
        
        for (i=0;i<256;i++) arrayOfChar[i] = Character.toString((char)i);
        
        // Read input file and output file
        RandomAccessFile inputFile = new RandomAccessFile(filename,"r");
        RandomAccessFile outputFile = new RandomAccessFile("output_image.".concat(extension),"rw");
        
        try {
            buffer[0] = inputFile.readByte();
            buffer[1] = inputFile.readByte();
            previousword = getIntValue(buffer[0], buffer[1], isLeft);
            isLeft = !isLeft;
            outputFile.writeBytes(arrayOfChar[previousword]);

            // Reads three bytes and generates corresponding characters
            while (true) {
            
                if (isLeft) {
                    buffer[0] = inputFile.readByte();
                    buffer[1] = inputFile.readByte();
                    currentword = getIntValue(buffer[0], buffer[1], isLeft);
                } 
                else {
                    buffer[2] = inputFile.readByte();
                    currentword = getIntValue(buffer[1], buffer[2], isLeft);
                }
                isLeft = !isLeft;

                /*
                 currentword not in dictionary, we just add the previousword in the entry.
                */
                
                if (currentword >= dictSize) {
                    if (dictSize < 4096) {
                        arrayOfChar[dictSize] = arrayOfChar[previousword] + arrayOfChar[previousword].charAt(0);
                    }
                    dictSize++;
                    outputFile.writeBytes(arrayOfChar[previousword] + arrayOfChar[previousword].charAt(0));
                } 
                /*
                 If word is present, we form a word with the previousword and the first character of the 
                 currentword and add it in a new entry
                */
                
                else {
                    if (dictSize < 4096) {
                        arrayOfChar[dictSize] = arrayOfChar[previousword] + arrayOfChar[currentword].charAt(0);
                    }
                    dictSize++;
                    outputFile.writeBytes(arrayOfChar[currentword]);
                }
                previousword = currentword;
            }
        } 
        catch (EOFException e) {
            inputFile.close();
            outputFile.close();
        }
    }
    
    /*
        Converting 2 bytes to 12-bit code.
        Converting 12-bit code to integer value.
    */ 
    public static int getIntValue(byte b1, byte b2, boolean isLeft) {
        String t1 = Integer.toBinaryString(b1);
        String t2 = Integer.toBinaryString(b2);

        while (t1.length() < 8) t1 = "0" + t1;
        if (t1.length() == 32) t1 = t1.substring(24, 32);
        
        while (t2.length() < 8) t2 = "0" + t2;
        if (t2.length() == 32) t2 = t2.substring(24, 32);

        if (isLeft) return Integer.parseInt(t1 + t2.substring(0, 4), 2);
        else return Integer.parseInt(t1.substring(4, 8) + t2, 2);
        
    }

}
