
package GROUP_B;
import static java.lang.System.out;
public class Practical_1 {
    
    public static void main(String[] args) {
     out.print("NO:"+"\t"); 
     out.print("SQR:"+"\t"); 
     out.println("CUBE"+"\t"); 
    for(int k=0;k<=5;k++){
        //method 1
      out.print(k+"\t"+(k*k)+"\t"+(k*k*k)+"\n");   
        
        //method 2
  out.print(k+"\t");
out.print(Math.pow(k, 2)+"\t");
out.print(Math.pow(k, 3)+"\t"+"\n"); 
  }
 
    }
}
