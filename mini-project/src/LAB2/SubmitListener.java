package LAB2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;

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
            JOptionPane.showMessageDialog(null, "Your answe is incorrect, please try again!");
        }
    }    
}
