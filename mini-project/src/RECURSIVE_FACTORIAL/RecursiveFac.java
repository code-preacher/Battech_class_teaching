/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RECURSIVE_FACTORIAL;

/**
 *
 * @author JOSEPH
 */
public class RecursiveFac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 6;
        long factorial = multiplyNumbers(num);
        System.out.println("Factoriaal of " + num + " = " + multiplyNumbers(num));
        System.out.println("Factoriaal of " + num + " = " + fac2(num));
        fac(num);
        
            }
    public static long multiplyNumbers(int num){
        if (num>=1)
            return num * multiplyNumbers(num-1);
        else
            return 1;
    }
      
        public static int fac2(int num){
int f=1;
if(num==1){
return 1;
}
else if(num>1){
for(int i=1;i<=num;i++){
f=f*i;
}
return f; }
else{
        return -1;
        }

        }

         public static void fac(int num){
int f=1;
if(num==1){
   System.out.println("Factoriaal of " + num + " = " + num);
}
else if(num>1){
for(int i=1;i<=num;i++){
f=f*i;
 System.out.println("Factoriaal of " + num + " = " + f);
}
}
else{
 System.out.println("Factoriaal of " + num + " = " + (-1));;
        }
        }
}

    

