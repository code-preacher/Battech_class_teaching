/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comparism;

/**
 *
 * @author PETER SAMMY GOODNEWZ
 */
import java.util.Scanner;
public class COMPARISM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("enter first value:");
        a=input.nextInt();
        System.out.println("enter second value:");
        b=input.nextInt();
        System.out.println("enter third value:");
        c=input.nextInt();
        System.out.println("enter fourth value:");
        d=input.nextInt();
        
 
        if(a>b&&a>c&&a>d){
        System.out.println(a+" is the greatest");
        }
        else if(b>a&&b>c&&b>d){
            System.out.println(b+" is the greatest");}
        else if(c>a&&c>b&&c>d){
            System.out.println(c+" is the greatest");}
        else if(d>a&&d>b&&d>c){
            System.out.println(d+" is the greatest");
            
        if(a<b&&a<c&&a<d){
        System.out.println(a+" is the smallest");
        }
        else if(b<a&&b<c&&b<d){
            System.out.println(b+" is the smallest");}
        else if(c<a&&c<b&&c<d){
            System.out.println(c+" is the smallest");}
        else if(d<a&&d<b&&d<c){
            System.out.println(d+" is the smallest");
    }
        }
        }
    
    }

