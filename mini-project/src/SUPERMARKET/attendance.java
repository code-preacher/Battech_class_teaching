/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUPERMARKET;

import java.awt.HeadlessException;
import java.io.*;
import jxl.write.*;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author PETER SAMUEL OCHE
 */
public class attendance extends javax.swing.JFrame {
Connection con =null;
PreparedStatement  ps= null,ps2=null;
ResultSet rs =null,rs2=null;

    /**
     * Creates new form table_op
     */
    DefaultTableModel model1;
    public attendance() {
        initComponents();
        model1 = (DefaultTableModel) jTable1.getModel();
        con=Mysqlconnect.ConnectDb();
        try{
          ps=con.prepareStatement("select * from student");
         rs=ps.executeQuery();
         int sn=0;
            while(rs.next()){
          sn++;
             int id=rs.getInt("id");
             String name=rs.getString("name");
             String matno=rs.getString("matno");
             
             ps2=con.prepareStatement("select COUNT(*) AS ct from attendance where matno='"+matno+"' ");
             rs2=ps2.executeQuery();
             rs2.next();
               String count=rs2.getString("ct");
                model1.insertRow(model1.getRowCount(),new Object[]{sn,id,name,matno,count});
             
            } 
            Date d=new Date();
            String pattern="yyyy-mm-dd";
            SimpleDateFormat f=new SimpleDateFormat(pattern);
            String show=f.format(d);
            JOptionPane.showMessageDialog(null,show);
          //  String pattern="yyyy-mm-dd hh:mm:ss";
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString()+"Error in Fetching Query");
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

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S/N", "ID", "FULLNAME", "MAT-NO", "NO OF ATTENDANCE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "1-5", "1-10" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("SHOW RECORD :");

        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("BackUp");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         con=Mysqlconnect.ConnectDb();
         
          try{
         int selectedCol = jTable1.getSelectedColumn();
        int selectedRow = jTable1.getSelectedRow();
        String value = String.valueOf(model1.getValueAt(selectedRow,selectedCol));
  
          ps=con.prepareStatement("delete from attendance where id = '"+value+"' or name = '"+value+"' or matno = '"+value+"' ");
          ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Record have been deleted");
           
            model1.removeRow(selectedRow);
            
         }
         catch(SQLException | HeadlessException e){
             JOptionPane.showMessageDialog(null,e.toString()+" \n Record have not been deleted");
         }
        catch(ArrayIndexOutOfBoundsException e){
          JOptionPane.showMessageDialog(null,"Please select or click on any record to delete record");  
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        Object selected = jComboBox1.getSelectedItem().toString();
        jComboBox1.setSelectedItem(selected);
       
         model1.setRowCount(0);
         
         if(selected.equals("ALL")){
             try{
          ps=con.prepareStatement("select * from attendance");
         rs=ps.executeQuery();
         int sn=0;
            while(rs.next()){
          sn++;
             int id=rs.getInt("id");
             String name=rs.getString("name");
             String matno=rs.getString("matno");
                
             ps2=con.prepareStatement("select COUNT(*) AS ct from attendance where matno='"+matno+"' ");
             rs2=ps2.executeQuery();
             rs2.next();
               String count=rs2.getString("ct");
                model1.insertRow(model1.getRowCount(),new Object[]{sn,id,name,matno,count});       
            }   
        }
             catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
             }
         }
       else if(selected.equals("1-5")){
             try{
          ps=con.prepareStatement("select * from attendance limit 0,5 ");
         rs=ps.executeQuery();
         int sn=0;
            while(rs.next()){
          sn++;
             int id=rs.getInt("id");
             String name=rs.getString("name");
             String matno=rs.getString("matno");
             
             ps2=con.prepareStatement("select COUNT(*) AS ct from attendance where matno='"+matno+"' ");
             rs2=ps2.executeQuery();
             rs2.next();
               String count=rs2.getString("ct");
                model1.insertRow(model1.getRowCount(),new Object[]{sn,id,name,matno,count});
            }
            
            
        }
             catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
             } 
       }
      
       else if(selected.equals("1-10")){
             try{
          ps=con.prepareStatement("select * from attendance limit 0,10 ");
         rs=ps.executeQuery();
         int sn=0;
            while(rs.next()){
          sn++;
             int id=rs.getInt("id");
             String name=rs.getString("name");
             String matno=rs.getString("matno");
             
             ps2=con.prepareStatement("select COUNT(*) AS ct from attendance where matno='"+matno+"' ");
             rs2=ps2.executeQuery();
             rs2.next();
               String count=rs2.getString("ct");
                model1.insertRow(model1.getRowCount(),new Object[]{sn,id,name,matno,count});
            }   
        }
             catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
             }
       }
       else{
        String sn="";   
        String id="";
        String name="";
        String matno="";
        String count="";
                model1.insertRow(model1.getRowCount(),new Object[]{sn,id,name,matno,count});   
                JOptionPane.showMessageDialog(null,"No Data Found");
       }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      con=Mysqlconnect.ConnectDb();
      try{
         int selectedCol = jTable1.getSelectedColumn();
        int selectedRow = jTable1.getSelectedRow();
        String value = String.valueOf(model1.getValueAt(selectedRow,selectedCol));
     
        
          ps=con.prepareStatement("select * from attendance where id = '"+value+"' or name = '"+value+"' or matno = '"+value+"' ");
          rs=ps.executeQuery();
          rs.next();
          int id=rs.getInt("id");
          String name=rs.getString("name");
          String matno=rs.getString("matno");
           JOptionPane.showMessageDialog(null,"******************************"+"\n USER ID : "+id+"\n FULLNAME : "+name+"\n MATNO : "+matno+"\n ******************************");
         }
        catch(SQLException e){
             JOptionPane.showMessageDialog(null,"Error in Query \n"+e.toString());
         }  
       catch(ArrayIndexOutOfBoundsException e){
             JOptionPane.showMessageDialog(null,"Please select or click on any record to get its detail");
         }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
           try{
        String nameOfFile = JOptionPane.showInputDialog("Enter the name of the file");
        File file = new File("c://users//PETER SAMUEL OCHE//desktop//"+nameOfFile+".xls");
        WritableWorkbook excel = Workbook.createWorkbook(file);
        WritableSheet mySheet = excel.createSheet("Test",0);
        
        int number = model1.getColumnCount();
        int number2 = model1.getRowCount();
       
       String[][] labell = new String[number2][number];
       for(int counter = 0;counter < number2;counter++){
           for(int count = 0;count < number;count++){
               labell[counter][count] = model1.getValueAt(counter, count).toString();
           }
       }
           
            for(int i = 0;i < number2;i++){
            for(int z = 0; z < number;z++){
            Label lab = new Label(z,i,labell[i][z]);
            mySheet.addCell(lab);
         }
            
      }
        excel.write();
        JOptionPane.showMessageDialog(null,"Exported to "+file.getPath());
        excel.close();
          
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
                    
    }//GEN-LAST:event_jButton3ActionPerformed
   
 
    
    
    

    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new attendance().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
