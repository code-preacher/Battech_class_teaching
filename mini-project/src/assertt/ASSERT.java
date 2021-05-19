/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assertt;

/**
 *
 * @author PETER SAMMY GOODNEWZ
 */
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class ASSERT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
      
        Scanner input=new Scanner(in);
        int number;
        out.println("ENTER AN INTEGER BETWEEN 0 AND 25:");
       
        number=input.nextInt();
        
 assert(number>=0) && (number<=25):" The number you entered is  within"
                + " the range of 0-25"+number;
  out.println("The number you entered is not within" + " the range of 0-25");
   
if(number>=0 && number<=25){
out.println("The number you entered is within" + " the range of 0-25");
}
else{
out.println("The number you entered is not within" + " the range of 0-25");
}

char firstInitial=(char)-1;
System.out.println("Enteryourfirstinitial:");
try{firstInitial=(char)System.in.read();}
catch(Exception e){System.out.println("Error:"+e.toString());}
if(firstInitial==-1)
{System.out.println("Nowwhatkindofnameisthat?");}
else if(firstInitial=='j'){System.out.println("YournamemustbeJules!");}
else if(firstInitial=='v'){System.out.println("YournamemustbeVincent!");}
else if(firstInitial=='z'){System.out.println("YournamemustbeZed!");}
else {System.out.println("Ican’tfigureoutyourname!");}



double dd1=14.2,dd2=18.5;
double dd3=Math.min(dd1,dd2);
double dd4=Math.max(dd1,dd2);
double d1=49.9;
double d2=Math.round(d1);
double d3=Math.log(d1);
double d4=Math.sqrt(d1);
double d5=Math.pow(d1,3);
out.println(d1);
out.println(d2);
out.println(d3);
out.println(d4);
out.println(d5);
out.println(dd3);
out.println(dd4);
    }
}
