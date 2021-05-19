package GROUP_C;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Practical_2 {
    public static void main(String[] args) {
        
            Scanner input=new Scanner(in);
       out.println("Please enter number:");
       int num=input.nextInt();
         out.println("Please enter the exponent:");
        int exp=input.nextInt();
        //for method 1
   out.println(num+ "^" +exp+ " = " + Power(num,exp));   
   //for method 2
   out.println(num+ "^" +exp+ " = " + Power2(num,exp));  
   
    }
 //method 1 start
    public static int Power(int x, int y){
        switch (y) {
            case 0:
                return 1;
            case 1:
                return x;
            default:
                return x * Power(x,y-1);
        } }//method 1 end
    
    //method 2 start
    public static int Power2(int x, int y){
        if(y==1) {
            return x;
        }
        else if(y==0) {
            return 1;
        }
        else{
                return x * Power(x,y-1);
        } }//method 2 end
    
    
}
