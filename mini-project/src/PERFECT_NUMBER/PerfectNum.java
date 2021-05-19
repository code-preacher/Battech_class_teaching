package PERFECT_NUMBER;
public class PerfectNum { 
    public static void main(String[] args) {
        //loop and print perfect numbers between 1 and 1000 using our perfectNum() method.
       for (int num = 1; num<=1000; num++){
       if (check(num)){
           System.out.println ( num );
       }
       
       }
       
    }//end main()
      //=methods =
      public static Boolean check(int num){
        //declare a variable to hold the sum of nums factors
        int sum=0;
        //loop over all the numbers up to 'num' to determine if they are factors
        //if they are then add them to 'sum'
        for (int factor =1; factor < num; factor++){
            if (num % factor == 0){
                sum += factor;
            } }// if 'sum' is equal to the number passed in then it's a perfect number
        if (sum == num){
            return true;
             }
        else{
            return false;
        } } // end public method isPerfect()
} // end PerfectNumbers class
