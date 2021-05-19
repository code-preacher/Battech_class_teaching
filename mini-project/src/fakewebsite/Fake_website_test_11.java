//@author PETER SAMUEL OCHE
package fakewebsite;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class Fake_website_test_11 {
     public static void main(String args[]) {
       //using swing
   String url_test2= JOptionPane.showInputDialog("Enter your URL: http://www.google.com");
boolean check2=Fake_website_test_1.exists(url_test2);
if(check2){
JOptionPane.showMessageDialog(null, url_test2 + " is a real website");
}
else{ 
  JOptionPane.showMessageDialog(null, url_test2 + " is a fake website");
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
