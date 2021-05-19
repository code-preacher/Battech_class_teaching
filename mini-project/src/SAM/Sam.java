package SAM;
import java.util.*;
import static java.lang.System.*;

public class Sam {
    public static void main(String[] args) {
     //first operation 
        int p=6;
       oche ocheobject=new oche();
       if(p<7){
       ocheobject.joe();
       }
       else{
        ocheobject.jude();
    }
       //second operation
       String name;
       Scanner input=new Scanner(in);
       //oche ocheobject=new oche();  object name to be used
              out.println("Please enter your name:");
       name=input.nextLine();
       ocheobject.dave(name);
       
       //third operation
       String name2;
        out.println("Please enter your girlfriend name:");
       name2=input.nextLine();
       ocheobject.setname(name2);
       ocheobject.saying();
       
       //fourth operation using condition on print
       int age;
       out.println("Please enter your age:");
       age=input.nextInt();
       out.println(age>=10 && age<=17 ? "You are too young":"you are of age");
       //math.power(x,y);math.abs(x);math.sqrt(x);math.max(x,y);math.min(x,y)
        }
    
}
