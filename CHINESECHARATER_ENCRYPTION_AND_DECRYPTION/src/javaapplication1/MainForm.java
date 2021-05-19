/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.alee.laf.scroll.WebScrollPane;
import com.alee.laf.text.WebTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author OWNER
 */
public class MainForm extends JFrame implements ActionListener {

    private JTextField mKey;
      JTextArea mArea;
    private JButton btnEncrypt, btnDecrypt, btnFile;
    private JCheckBox mCheckMode;
    private JLabel mFileSize, mTimeTaken;
    private final WebTextArea plainTextArea, cypherTextArea;
    private final JComboBox<String> cb;
    private String selectedItem, tmp,selectedLanguage;
    private String encKey, newKey, decKey = "";
    //private final WebTextArea cypherTextArea;

    public MainForm() {
        super("Modified Playfair");
        setSize(726, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(15, 15));
        
        String[] languages = { "English","Swahili", "Chinese", "Arabic", "Hebrew",
                                "Greek", "Thai"};


        JPanel jLeft = new JPanel();
        JPanel jCenter = new JPanel();
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JPanel jp4 = new JPanel();
        JPanel jp5 = new JPanel();
        
        cb = new JComboBox<>(languages);
        cb.setVisible(true);
        
        jLeft.setBackground(new Color(70,80,70));
        jp4.setBackground(Color.YELLOW);
         jp3.setBackground(Color.YELLOW);
         jp2.setBackground(Color.YELLOW);
          jp1.setBackground(Color.YELLOW);
         jCenter.setBackground(Color.YELLOW);




        jLeft.setLayout(new BorderLayout(15, 15));
//        jLeft.setBorder(BorderFactory.createEtchedBorder());
        jp1.setLayout(new GridLayout(6, 10, 10, 10));
        mCheckMode = new JCheckBox("Mode");
        mCheckMode.setSelected(true);
        mCheckMode.addActionListener(this);
        
        mKey = new JPasswordField();
        
        btnEncrypt = new JButton("Encrypt");
        btnEncrypt.addActionListener(this);
        
        btnDecrypt = new JButton("Decrypt");
        btnDecrypt.addActionListener(this);
        btnDecrypt.setEnabled(false);

        btnFile = new JButton("Read File Content");
        btnFile.addActionListener(this);
//        jp1.add(new JLabel(""));
//        jp1.add(new JLabel(""));
        
         jp1.add(mCheckMode);
         jp1.add(new JLabel(""));
        
        
        jp1.add(new JLabel("Select Language"));
        jp1.add(cb);

       
        jp1.add(new JLabel("Encryption Key"));
        jp1.add(mKey);

        jp1.add(btnEncrypt);
        jp1.add(btnDecrypt);
        jp1.add(btnFile);
        
        
        jp2.setLayout(new GridLayout(2, 2, 10, 10));
        jp2.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createBevelBorder(BevelBorder.RAISED), "Summary",
                TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 3, 12)));
        mFileSize = new JLabel("0KB");
        mFileSize.setFont(new java.awt.Font("Tahoma", 1, 12));
        mTimeTaken = new JLabel("0 sec");
        mTimeTaken.setFont(new java.awt.Font("Tahoma", 1, 12));

        jp2.add(new JLabel("Text size:"));
        jp2.add(mFileSize);
        jp2.add(new JLabel("Duration :"));
        jp2.add(mTimeTaken);

        jp3.setLayout(new BorderLayout(2, 2));
        jp3.add(new JLabel("Plain Text"), BorderLayout.NORTH);
        plainTextArea = new WebTextArea();
        plainTextArea.setMargin(10);
        plainTextArea.setBackground(Color.black);
        plainTextArea.setForeground(Color.white);
        plainTextArea.setLineWrap(true);
        plainTextArea.setEditable(true);
        plainTextArea.setWrapStyleWord(true);
        plainTextArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
        plainTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mFileSize.setText(plainTextArea.getText().length() + " KB");
            }
        });

        WebScrollPane mScrollP = new WebScrollPane(plainTextArea);
       
        jp3.add(mScrollP, BorderLayout.CENTER);

        jp4.setLayout(new BorderLayout(2, 2));
        jp4.add(new JLabel("Cipher Text"), BorderLayout.NORTH);
        cypherTextArea = new WebTextArea();
        cypherTextArea.setBackground(Color.BLACK);
         cypherTextArea.setForeground(Color.WHITE);
        cypherTextArea.setMargin(10);
        cypherTextArea.setLineWrap(true);
        cypherTextArea.setEditable(true);
        cypherTextArea.setWrapStyleWord(true);
        cypherTextArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
        WebScrollPane mScrollC = new WebScrollPane(cypherTextArea);
        jp4.add(mScrollC, BorderLayout.CENTER);

        jCenter.setLayout(new GridLayout(2, 1, 2, 2));
        jCenter.add(jp3);
        jCenter.add(jp4);

        jLeft.add(jp1, BorderLayout.NORTH);
        jLeft.add(jp2, BorderLayout.SOUTH);

        add(jLeft, BorderLayout.WEST);
        add(jCenter, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainForm(); 
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      newKey = mKey.getText().replaceAll("(.)(?=.*\\1)", "").toLowerCase();
      
        String pattern = "^([a-f]+[0-9][a-f0-9]*)|([0-9]+[a-f][a-f0-9]*)";
        
                
        if(!newKey.matches(pattern)){
           JOptionPane.showMessageDialog(null, "Password must contain atleast a character (A-F) and A digit without repetition!!!"); 
           return;
        }
        else if(newKey.length() < 2) {
             JOptionPane.showMessageDialog(null, "Password cannot be less than 8 xters without Repetitons!!!"); 
           return;
        }
            
        Object source = e.getSource();

       //retrieving the selected text here from dropdown
       Object selecteditem = cb.getSelectedItem();
        selectedLanguage = selecteditem.toString();

       if (source == mCheckMode) {
           boolean b = mCheckMode.isSelected();
           btnEncrypt.setEnabled(b);
           btnDecrypt.setEnabled(!b);
           cypherTextArea.setEditable(!b);
           //this is where he calls encrypt or decrypt dependnig on the the checkbox status
       } else if (source == btnEncrypt) {
           if(plainTextArea.getText().trim().length() < 1){
               JOptionPane.showMessageDialog(null, "Enter text to encrypt!!!"); 
                return;  
           }
           execute(0);

       } else if (source == btnDecrypt) {
           if(cypherTextArea.getText().trim().length() < 1){
               JOptionPane.showMessageDialog(null, "Enter text to decrypt!!!"); 
                return;  
           }
           execute(1);
       } else if(source == btnFile) {
           execute(2);
       }
        
    }

    private void execute(int mOperation) {
      
        String fileOps = HexaTable.readFile(HexaTable.generateTable(newKey), selectedLanguage);
        
         if(mOperation == 0) {
             tmp =  plainTextArea.getText();
             mArea = cypherTextArea;
             encKey = newKey;
         }
         else if(mOperation == 1) {
             tmp =  cypherTextArea.getText();
             mArea = plainTextArea;
             decKey = newKey;
         }
         else if(mOperation == 2){            
            tmp =  fileOps.trim();
             mFileSize.setText(tmp.length() + " KB");
            mArea = plainTextArea;
         }
         
         
        if (tmp.length() > 0) {
//            mError.setText("");
            long sLong = System.currentTimeMillis();
            HexaTable.tmpTable = HexaTable.generateTable(newKey);
            for(int i = 0; i <= 16; i++){
               for(int j = 0; j <= 16; j++){
                   System.out.print(HexaTable.tmpTable[i][j] + "\t");
               }
               System.out.println(" ");
            }
            
            System.out.println("table generated...");
            System.out.println("\t");

             String result;
            if(mOperation == 0){
                result = this.getEncoded();
            }
            else if(mOperation == 1) {
               
                result = this.getDeciphered(); 
               
            }
            else {
                result = tmp;
            }
                       
           
            mArea.setText(result);
            mTimeTaken.setText((System.currentTimeMillis() - sLong) / 1000.0 + " sec");
            cypherTextArea.setEditable(true);
        } 
    }
    
    public String getDeciphered(){
        return (HexaTable.decipherText(tmp, HexaTable.tmpTable, selectedLanguage));
    }
    
    public String getEncoded(){
        return (HexaTable.encodeDigraph(tmp, HexaTable.tmpTable, selectedLanguage));
    }
 

}
