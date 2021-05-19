/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUPERMARKET;

/**
 *
 * @author PETER SAMUEL OCHE
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
public class Mysqlconnect {
    Connection con = null;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","");
            JOptionPane.showMessageDialog(null, "connected");
            
            return con;
            
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Error connecting to server" );
            return null;
        }
    }
    
}
