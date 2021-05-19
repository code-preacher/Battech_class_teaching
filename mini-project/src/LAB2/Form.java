package LAB2;

import java.awt.*;
import javax.swing.*;

public class Form 
{ 
    private final JFrame frame;
    private final JPanel panel;
    private final JLabel label;
    protected final JTextField input;
    private final JButton submit;
    private final JButton exit;
    
    Form()
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
       new Form();
    }
    
}
