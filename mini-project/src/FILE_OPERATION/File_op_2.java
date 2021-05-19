//@author PETER SAMUEL OCHE
package FILE_OPERATION;

import java.io.FileNotFoundException;
import java.util.*;
public class File_op_2 {
     public static void main(String args[]) {
         
      java.io.File file = new java.io.File("scores.txt");
if (file.exists()) {
System.out.println("File already exists");
// System.exit(1);
 }
// Create a file
try{
    java.io.File file1 = new java.io.File("oche.txt");
 System.out.println("Does it exist? " + file1.exists());
 System.out.println("The file has " + file1.length() + " bytes");
System.out.println("Can it be read? " + file1.canRead());
System.out.println("Can it be written? " + file1.canWrite());
 System.out.println("Is it a directory? " + file1.isDirectory());
 System.out.println("Is it a file? " + file1.isFile());
System.out.println("Is it absolute? " + file1.isAbsolute());
System.out.println("Is it hidden? " + file1.isHidden());
System.out.println("Absolute path is " +file1.getAbsolutePath());
 System.out.println("Last modified on " +new java.util.Date(file.lastModified()));
    
    
          try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
              output.print("John T Smith ");
              output.println(90);
              output.print("Eric K Jones ");
              output.println(85);
              output.close();
          } 

java.io.File file2 = new java.io.File("scores.txt");
 Scanner input = new Scanner(file2);
while (input.hasNext()) {
 String firstName = input.next();
String mi = input.next();
String lastName = input.next();
int score = input.nextInt();
System.out.println(firstName + " " + mi + " " + lastName + " " + score);
 input.close();
}}
catch(FileNotFoundException e){
System.out.println(e);
}

   
         
         
     }
}
