
package JAVA_CONNECTION;
import java.sql.*;

public class JdbCon {

    public static void main(String[] args) throws ClassNotFoundException {
        PreparedStatement stmt = null;
       
        try{
         Class.forName("com.mysql.jdbc.Driver");//this is where our driver is loaded and registered
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/e","root","");
//is a constructor that establish connection and our argument, localhost,password are being passed into the mysql
        
         for (int y=1; y<=100; y++){
         stmt =con.prepareStatement ("insert into employee(name, salary) values (?,?)");
         stmt.setString(1, "God Jesus");
         stmt.setString(2, "2000");
         int x = stmt.executeUpdate();
         if (x>0){
             System.out.println("Created");
                      }
         else{
             System.out.println("Unable to create Records");
         }
            }
        }
               catch (SQLException e){
           System.out.println("error");
       }// TODO code application logic here
    }
    
}
