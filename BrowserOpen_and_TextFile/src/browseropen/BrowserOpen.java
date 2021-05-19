/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browseropen;

/**
 *
 * @author Hon.Samson Okwu
 */
import java.awt.Desktop;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;


public class BrowserOpen {

    public static void main(String[] args) throws IOException, URISyntaxException {

            String lk="1234256";
            String pc=InetAddress.getLocalHost().getHostName();
            URI uri=new URI("http://localhost/piracy/piracy_check.php?cn="+pc+"&lk="+lk);
            Desktop.getDesktop().browse(uri);
       
    }
    
}
