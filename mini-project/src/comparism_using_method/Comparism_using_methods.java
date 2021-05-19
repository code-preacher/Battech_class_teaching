/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparism_using_method;

/**
 *
 * @author PETER SAMUEL OCHE
 */
import java.util.*;
import static java.lang.System.*;
import javax.swing.*;

public class Comparism_using_methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(in);
// this is used with scanner method:int f=input.nextInt();int g=input.nextInt();int h=input.nextInt();int i=input.nextInt();      
int f=Integer.parseInt(JOptionPane.showInputDialog("Please enter first number"));
int g=Integer.parseInt(JOptionPane.showInputDialog("Please enter second number"));        
int h=Integer.parseInt(JOptionPane.showInputDialog("Please enter Third number"));
int i=Integer.parseInt(JOptionPane.showInputDialog("Please enter fourth number"));
int y=sum(f,g,h,i);
if(y>0){
JOptionPane.showMessageDialog(null,"the greatest is "+y);
}
else{
JOptionPane.showMessageDialog(null,"All are equal");
}

    }
    public static int sum(int a,int b,int c,int d){
        int temp=0;
        if (a>b && a>c && a>d){
        temp=a;
        }
        else if(b>a && b>c && b>d){
        temp=b;
        }
         else if(c>a && c>b && c>d){
        temp=c;
        }
         else if(d>a && d>b && d>c){
        temp=d;
        }
         else{
         temp=0;
         }
        return temp;
    }
}
