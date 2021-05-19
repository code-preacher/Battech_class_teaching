/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MANY_OPERATION;

/**
 *
 * @author PETER SAMMY GOODNEWZ
 */
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
// API'S SUCH AS; import java.util.*; import static java.lang.System.*; makes programming procesess easier.

public class MANY_OPERATIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int k=1,y=0;
        while(k<=12){
            y=10*k;
            System.out.println(y);
           k++; 
            
        }
        int p=2;
        switch(p){
            case 0:
              System.out.println("its 0"); 
                break;
                
                case 1:
              System.out.println("its 1"); 
                break;
                    case 2:
              System.out.println("its 2"); 
                break;
                        default:
              System.out.println("no value"); 
                break;
        }
        
   String input = JOptionPane.showInputDialog ("first integer" );
int choice = Integer.parseInt( input ); // convert input to int
  String inputy = JOptionPane.showInputDialog ("second integer" );
int cat = Integer.parseInt( inputy );
int m=choice+cat;
JOptionPane.showMessageDialog(null, m);

int u[]={0,1,2,3,4,5,6,7,8,9,10};




int b[]={91,72,38,46};
for(int oche:b){
 System.out.println(oche);   
}
for(int x=1;x<=b.length;x++){
System.out.println(x);
}

String items[]={"sam","cat","rat","fat"};
for (String ochikul:items){
     System.out.println(ochikul);
}



double h[]=new double[5];
h[0]=5* .10; //pencentage does not exist, rather dot(.)
h[1]=Math.sqrt(100);
double hvv=Math.pow(h[1],2);
System.out.println(h[0]);
System.out.println(h[1]);
System.out.println(hvv);
double hv=h[0]+h[1];
System.out.println(hv);
    }
}
