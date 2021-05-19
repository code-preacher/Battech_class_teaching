
package GROUP_A;
import java.awt.*; 
import javax.swing.*;
public class practical_2 extends JApplet {
String output;
 public void init() {
 output = "Prime numbers between 1 and 10,000 are: ";

for ( int m = 1; m <= 10000; m++ )
if ( prime( m ) == true )
    output += "\n" + m;

JTextArea outputArea = new JTextArea( 15, 20 );
JScrollPane scroller = new JScrollPane( outputArea );
outputArea.setText( output );
Container container = getContentPane();
 container.add( scroller );
 }

 public boolean prime( int n )
 {
 for ( int v = 2; v <= n / 2; v++ )
if ( n % v == 0 )
return false;
 return true;
 }  
}

