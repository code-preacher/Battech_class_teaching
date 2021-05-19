
package JAVA_CONNECTION;
import java.sql.*;
import javax.swing.JOptionPane;

public class JdbCon2 {

    public static void main(String[] args){
PreparedStatement stmt = null;
Connection con=null;
PreparedStatement pst=null;
ResultSet rs=null;     
        try{
         Class.forName("com.mysql.jdbc.Driver");//this is where our driver is loaded and registered
         con = DriverManager.getConnection("jdbc:mysql://localhost/tropy","root","");
//is a constructor that establish connection and our argument, localhost,password are being passed into the mysql
        
        for(int i=1;i<=100;i++){
        String Sql="insert into login(name,passkey) values('"+"oche"+"','"+"2020"+"')";
            pst=con.prepareStatement(Sql); // or pst=conn.createStatement(Sql);
        pst.executeUpdate(Sql);
              System.out.println( "data  " + i + "  Has been added");
        } }catch(ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null,e);
        }// TODO code application logic here
    }
    
}