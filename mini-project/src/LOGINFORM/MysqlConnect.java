/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGINFORM;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author PETER SAMUEL OCHE
 */
public class MysqlConnect {
Connection conn=null;
public static Connection ConnectDB(){
try{
 Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
JOptionPane.showMessageDialog(null, "connected");
return conn;
}
catch(ClassNotFoundException | SQLException | HeadlessException e){
JOptionPane.showMessageDialog(null, "Error Connecting to Server");
return null;
}
}
}