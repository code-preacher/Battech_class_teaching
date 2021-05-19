package GROUP_B;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Practical_2 {
    private final JFrame frame;
    private final JPanel panel;
    private final JLabel label;
    protected final JTextField input;
    private final JButton submit;
    private final JButton exit;
    Practical_2()
    {
      frame =  new JFrame("Do you know multiplication?");
        frame.setLayout(new GridLayout(3,1));
        frame.setDefaultCloseOperation(2);
        frame.setLocation(400,200);
        frame.setResizable(true);
        
        input = new JTextField("");
        input.setFont(new Font("sherif", Font.BOLD,12));
        
        label = new JLabel();
        label.setText(null);
        
        panel = new JPanel(new FlowLayout());
        
        SubmitListener submitObj  = new SubmitListener(label, input);
        label.setText(submitObj.generateQuestion());
        
        submit = new JButton("SUBMIT");
        submit.setFont(new Font("sherif", Font.BOLD,12));
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        
        submit.addActionListener(submitObj);
        
        exit = new JButton("EXIT");
        exit.setFont(new Font("sherif", Font.BOLD,12));
        exit.setBackground(Color.red);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(new ExitListener());
        
        panel.add(submit);
        panel.add(exit);
        
        frame.add(label);
        frame.add(input);
        frame.add(panel);
        
        frame.pack();
        frame.setVisible(true);
    
    }
     
     
public static void main(String[] args) 
    {
       new Practical_2();
    }
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

public class SubmitListener implements ActionListener {
    
    protected String answer;
    JLabel label;
    JTextField input;
    private int score = 0;
      
    
    SubmitListener(JLabel label, JTextField input){
        this.label = label;
        this.input = input;
    }
    
    protected String generateQuestion(){
        int num1 = 1 + (int)(Math.random() * 9);
        int num2 = 1 + (int)(Math.random() * 9);
        answer = (num1 * num2)+"";
        return num1+" x "+num2+" = ?";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(input.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter your  answer and try again");
        }
        else if(input.getText().equalsIgnoreCase(answer)){
            ++score;
            JOptionPane.showMessageDialog(null, "Congratulations, your answer is correct!\n Score: "+score);
            label.setText(generateQuestion());
            input.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Your answer is incorrect, please try again!");
        }
    }    
}

}