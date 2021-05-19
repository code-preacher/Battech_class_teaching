//@author PETER SAMUEL OCHE
package fakewebsite;
import java.net.*;
import java.io.*;
import static java.lang.System.*;
import java.util.*;
public class Fake_website_test_111 {
       public static void main(String [] args) {
           Scanner input=new Scanner(in);
           out.println("Please enter website url in this fomat https://www.amrood.com");
           String url_t=input.nextLine();
      try {
         URL url = new URL(url_t);
         
          out.println("URL is " + url.toString());
          out.println("protocol is " + url.getProtocol());
          out.println("authority is " + url.getAuthority());
          out.println("file name is " + url.getFile());
          out.println("host is " + url.getHost());
          out.println("path is " + url.getPath());
          out.println("port is " + url.getPort());
          out.println("default port is " + url.getDefaultPort());
          out.println("query is " + url.getQuery());
          out.println("ref is " + url.getRef());
      } catch (IOException e) {
      out.println(e);
      }
   }

}
