package LAB2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ExitListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        int choise = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
        if(choise == JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null, "Goodbye");
            System.exit(0);
        }
    }
    
}
