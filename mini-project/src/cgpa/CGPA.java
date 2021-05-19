/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa;

/**
 *
 * @author PETER SAMMY GOODNEWZ
 */
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Date;
import javax.swing.JOptionPane;

public class CGPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int no,cor;
        int score=0,cu=0;
        String name;
        double gp=0,gpa=0,sumcu=0,sumgp=0;
        Date d1;
        
        out.println("CALCULATION OF STUDENTS GPA SCORES");
        Scanner input=new Scanner(in);
        out.print("ENTER THE TOTAL NUMBER OF STUDENTS:");
        
        no=input.nextInt();
        for(int a=1;a<=no;a++){
        out.println("Enter students name:");
        name=input.next();
        
        out.print("Enter the total no of students course:");
        cor=input.nextInt();
        
        for(int n=1;n<=cor;n++){
        out.print("Enter students Score in course"+" "+n+":");
        score=input.nextInt();
        
        out.print("Enter students credit unit in course"+" "+n+":");
        cu=input.nextInt();
        
        if(score>=70){
        gp=cu*5;
        sumgp=sumgp+gp;
        sumcu=sumcu+cu;
        }
        else
            if(score>=60&&score<=69){
        gp=cu*4;
        sumgp=sumgp+gp;
        sumcu=sumcu+cu;
            }
        
        else
            if(score>=50&&score<=59){
        gp=cu*3;
        sumgp=sumgp+gp;
        sumcu=sumcu+cu;
        
        
        }
        
        else
            if(score>=40&&score<=49){
        gp=cu*2;
        sumgp=sumgp+gp;
        sumcu=sumcu+cu;
        
        
        }
        
        else
            if(score>=39){
        gp=cu*1;
        sumgp=sumgp+gp;
        sumcu=sumcu+cu;
        
        
        }
        
        
        }
        gpa=sumgp/sumcu;
        d1 = new Date();
        System.out.println("Date 1: " + d1);
        

      out.println("Student name is :"+name.toUpperCase()+","+"gpa score is :"+gpa);  
     out.print(d1); 
        
        
        
        
        
        
        
        
        }
    }
}
