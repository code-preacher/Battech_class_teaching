package codetest;
import java.util.*;
import static java.lang.System.*;
import javax.swing.*;
public class Codetest { 
    public static void main(String[] args) {
      // out.printf("%s %d ","hello",67);
       Scanner joe=new Scanner(in);     
for(int i=1;i<=5;i++){
  for(int j=1;j<=5;j++){  
      out.print(j*i+"\t");
  }
  out.print("\n");
    }
String m="joe";
dis(m);
out.print("\n");
 for(int k=0;k<=5;k++){
  out.print(k+"\t");
out.print(Math.pow(k, 2)+"\t");
out.println(Math.pow(k, 3)+"\t");
  }
 
       }  
    public static void dis(String n){
out.print("hello "+n);
}

}
