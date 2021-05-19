//@author PETER SAMUEL OCHE
package fakewebsite;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import static java.lang.System.*;
public class Fake_website_test_1 {
      public static void main(String args[]) {
         Scanner input = new Scanner(in);
   out.println("Enter your URL: http://www.google.com");
   String url_test=input.nextLine();
boolean check=Fake_website_test_1.exists(url_test);
if(check){
out.println(url_test+" is a real website");
}
else{
  out.println(url_test+" is a fake website");  
  }

      }
    public static boolean exists(String URLName){
    try {
      HttpURLConnection.setFollowRedirects(false);
   
      HttpURLConnection con = (HttpURLConnection) new URL(URLName).openConnection();
      con.setRequestMethod("HEAD");
      return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
    }
    catch (Exception e) {
       return false;
    }   
          
          
      }
    
}
