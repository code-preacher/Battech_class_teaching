/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_CONNECTION;

/**
 *
 * @author PETER SAMUEL OCHE
 */
import java.sql.*;

public class JJ {
    public static String q1;
    public static long startTime, endTime, diff;
  public static void main (String args[]) throws ClassNotFoundException{
       Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
      startTime = System.nanoTime();
      q1 = "SELECT * from name";
      try {
      Class.forName("com.mysql.jdbc.Driver");//this is where our driver is loaded and registered
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tropy","root","");
         String Sql="select num from numbers";
         pst=con.prepareStatement(Sql);
        rs=pst.executeQuery();
         rs.next();
        int n = rs.getInt(1);
         endTime = System.nanoTime();
         diff =(endTime-startTime);
         System.out.println("The total Time is: "+ diff);         
      }
      catch (SQLException e){
          System.out.println("Error connecting to Database");
          
      }
  }  
}