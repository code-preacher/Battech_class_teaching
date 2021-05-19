package GROUP_C;
import java.util.*;
import static java.lang.System.*;
public class Practical_1 {
    public static void main(String[] args) {
      Scanner input=new Scanner(in); 
      double a;
      int pst=0,ngt=0,zro=0;
       out.println("Please enter any five number to check for positivity,negativity and zeros");
       for(int k=1;k<=5;k++){
        out.println("Please enter number: " + k);
        a=input.nextDouble();
        if(a>0.0){
         pst=pst+1;
        }
        else if(a<0.0){
        ngt=ngt+1;    
        }
        else{
        zro=zro+1;
        }
      
       }
    out.println("Total positive numbers are:"+pst);
         out.println("Total negative numbers are:"+ngt);
           out.println("Total zero numbers are:"+zro);
         
    }
    
}
