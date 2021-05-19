//@author PETER SAMUEL OCHE
package FILE_OPERATION;
import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class File_op_1 {
     public static void main(String args[]) throws FileNotFoundException, IOException {
      
      try{
     Formatter x=new Formatter("oche.txt");
      x.format("%s%s%s", "peter samuel oche \t","bsu/sc/cmp/15/32204 \t","math/cmp");
      out.println("file was created and data were passed successfully");
      x.close();
      
      }catch(Exception e){
          out.println(e);
            }
      
  
        
     }
}
