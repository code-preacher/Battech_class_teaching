package GROUP_A;

import java.io.*;
import java.util.Scanner;

public class Practical_3 {
   public static void main(String [] agrs) throws IOException{
       Scanner nums = new Scanner(System.in);
       System.out.print("enter the principal amount: ");
	   
       double p = nums.nextDouble();
       System.out.print("Rate per Annun: ");
       double i = nums.nextDouble();
	   
       int k = 0;
       double x = 1 + (i / 1200);
	   double f;
	   
       FileWriter fw = new FileWriter("oche.txt");
       PrintWriter pw = new PrintWriter(fw);
	   
       pw.println("YEAR\t" + "MONTH\t" + "PRINCIPAL\t\t" + "INTEREST\t\t" + "FUTURE AMOUNT");
       pw.println("year 1");
	   
       int yr = 1;
       while (yr <= 5){
           for (int month = 1; month <= 12; month++){
               k++;
               f = (x * p);
               
               String val = String.format("\t%.4f, \t\t%.4f, \t\t%.4f", p, (f-p), f);
               pw.print("\t" + month);
               pw.println(val);
			   
               if ((month == 12) && (yr < 5)){
               pw.println("\t_________________________________________________________________________");
               pw.print("year " + (yr + 1) + "\n\tMONTH\t" + "PRINCIPAL\t\t" + "INTEREST\t\t" + "CURRENT ACCOUNT"); 
              
               }
               p = f;
           }
		   
           pw.println();
           System.out.println(); 
           yr++;
       }
	   
       pw.close();
	   
       }
   }

