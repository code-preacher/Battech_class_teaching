package GROUP_A;
import javax.swing.*;
import java.util.*;
import static java.lang.System.*;
public class Practical_1 {
    public static void main(String[] args) {
        //using scanner
  JOptionPane.showMessageDialog(null,"A program to concantenate my first and last name");
     Scanner inputobj=new Scanner(in);
   out.println("Please enter your first name:");
   String fname=inputobj.nextLine();
     out.println("Please enter your last name:");
   String lname=inputobj.nextLine();
   
    //use method 1.0
  String com="you are "+fname + " " + lname;    
  JOptionPane.showMessageDialog(null, com);
  
  //or use method 1.1
  JOptionPane.showMessageDialog(null,"you are "+fname + " " + lname );
  
  
   //using swing 
 String fn=JOptionPane.showInputDialog("Please enter your first name:");
   String ln=JOptionPane.showInputDialog("Please enter your last name:"); 
   //use method 1.0
  String co="you are "+fn + " " + ln;    
  JOptionPane.showMessageDialog(null, co);
  
  //or use method 1.1
  JOptionPane.showMessageDialog(null,"you are "+fn + " " + ln );
  
                
}
}