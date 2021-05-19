package PERFECT_NUMBER;
 // @author PETER SAMUEL OCHE
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
public class PerfectNumber  {
 
 // returns a string of factors if parameter is a
 // perfect number, or a string containing 0 if it isn't.
 public static String perfect( int value ) {
 int factorSum = 1;
String factors = "1 ";
 for ( int test = 2; test <= value / 2; test++ ) {
 if ( value % test == 0 ) {
factorSum += test;
 factors += test + " ";
}}
if ( factorSum == value )
return factors;
 return "0";
 } // end method perfect
 
 public static void main(String[]args) throws ClassNotFoundException, SQLException{  
   Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
   String k = null;
 System.out.println("PERFECT NUMBERS FROM 0-1000 WITH THEIR FACTORS");    
String outputString = "";
 try{
         Class.forName("com.mysql.jdbc.Driver");//this is where our driver is loaded and registered
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tropy","root","");
         String Sql="select num from numbers";
         pst=con.prepareStatement(Sql);
        rs=pst.executeQuery();
         rs.next();
        int n = rs.getInt(1);
       
for ( int numb = n; numb <= 10000; numb++ ) {
 String result = perfect(numb);
 if ( result != "0" ){    
 System.out.println(numb+": "+result);
 k=numb+":"+result;

 String Sql2="insert into tab(perfect) values('"+k+"')";
            pst=con.prepareStatement(Sql2); 
        pst.executeUpdate(Sql2);           
    }} 
         
 }
        catch (SQLException e){
           System.out.println(e);
       }
 

}
  
 }
