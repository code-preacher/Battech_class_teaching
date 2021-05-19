/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MEAN_VARIANCE_STANDARD_DEVIATION;

/**
 *
 * @author PETER SAMMY GOODNEWZ
 */
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class MEAN_VARIANCE_STANDARD_DEVIATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n=20.0;
        double[] a;
        a=new double[20];
        Scanner input=new Scanner(in);
        double sum=0,mean,var,std,k=0;
        out.println("enter data");
        for(int counter=0; counter<n; counter++){
            out.println("enter values:");
            a[counter]=input.nextDouble();
            sum+=a[counter];
            k+=Math.pow(a[counter],2);
            
        }
        out.println("sum="+sum);
        mean=sum/n;
        out.println("mean="+mean);
        var=(k-Math.pow(sum, 2)/n)/(n-1);
        out.println("variance="+var);
        std=Math.sqrt(var);
        out.println("standard deviatioin="+std);
    }
}
