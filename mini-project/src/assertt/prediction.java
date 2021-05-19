
package assertt;
import static java.lang.System.*;
import java.util.*;
public class prediction {
  public static String answer;
    public static void mes(){
    int a=(int)(Math.random() * 10);
    int b=(int)(Math.random() * 10);
    answer = (a * b)+"";
     out.println(a+" x "+b+" = ?"); 
    }
     public static void main(String[] args) {
        Scanner input=new Scanner(in); 
         mes();
         String guess=input.nextLine();
         int a=Integer.parseInt(guess);
          int gu=Integer.parseInt(answer);
          System.out.println(answer); 
           if(gu==a){
             System.out.println("correct answer"); 
            }
           else{
            System.out.println("wrong answer try again"); 
           }
     }
    
    
}
