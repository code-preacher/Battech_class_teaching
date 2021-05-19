package javaapplication1;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the etexttor.
 */
/**
 *
 * @author OWNER
 */
public class HexaTable {

    private int length = 0;
    public static String[][] tmpTable = new String[17][17];
    
//Point2D.Double temp1 = new Point2D.Double(0 , 1);  
  
    
    public static String[][] generateTable(String key) {
        String keyString = "";
        String[] chin = new String[]{"丨","一","冖","黹","冫","黽","至","匚","匸","他","口",
        "六","囗","胖","鬼","不","亅","鬲","贵","韭","几","鼎","龜","黃", "十","鳥",
        "尢","走","黑","土","辣","和","亠","食","累","辵","凵", "书","豸","衣","卜",
        "山","尸","你","士","身","新","脚","人","隶","鼻","首","刀","釆","麻","車",
        "卩","工","屮","齒","夊","長","咸","腿","入","面","瘦","酉","力","她","自",
        "肉","厂","巾","广","魚","夕","阜","也","绿","八","骨", "非","韋","勹","頁",
        "音","門","厶","干","幺","辰","大","靑","飛","红","冂","金","隹","鬥","匕",
        "疋","瓦","麥","又","黍","馬","是","女","雪","龠","叉","子","尺","髟","里",
        "宀","龍","癶","齊","寸","高","豕","会","小","网","茶","甜","曰","鹵","香",
        "吗","斤","跟","老","足","支","行","角","革","彳","廴","谷","海","月","目",
        "禾","辛","方","疒","邑","五","攴","课","白","鼠","心","廾","鬯","家","木",
        "赤","虍","穴","无","艮","矢","貝","文","四","玉","弋","戈","言","弓","二",
        "欠","虫","生","耳","日","而","豆","舛","斗","聿","玄","示","戶","耒","彡","三",
        "父","羽","点","禸","水","艸","見","用", "毛","色","矛","竹","手","舌","止",
        "九","爻","瓜","石","羊","火","糸","牙","臣","氏","立","血","臼","母","雨","歹",
        "两","爿","鹿","田","舟","这","犬","米","牛","气","缶","片","在","比","殳","風",
        "天","福","喜","热","风","穿","看","有","吃","笔","谁","那","我","只","件","个","元"};

        
        for (int i = 0; i < 256; i++) {
            keyString += (char) i;
        }
        // fill string array with empty string
        for (int i = 0; i <= 16; i++) {
            for (int j = 0; j <= 16; j++) {
                tmpTable[i][j] = "";
            }
        }
        
         key = " "+key.toLowerCase();
         //System.out.println(" the key is "+key);
        for (int k = 0; k < key.length(); k++) { 
           tmpTable[0][k] ="0".concat(""+key.charAt(k));     
        }
        
        
        // this for the column index 
        int w = 16;
        for (int k = 0; k <=16; k++) {
              String val =  Integer.toHexString(w--);
            tmpTable[k][0] =  val.length() < 2 ? 
               "0"+val : val;   
        }
        //////// ends here
        
        
        // this is for row
//        
        for (int m = 0; m <= 16; m++) {

            boolean repeat = false;
            boolean used = false;
             for (int j = 0; j <= 16; j++) {
                if (tmpTable[0][j].equals("0".concat(Integer.toHexString(keyString.charAt(m))))) {
                    repeat = true;
                } else if (tmpTable[0][j].equals("") && !repeat && !used) {
                    tmpTable[0][j] = ("" + Integer.toHexString(
                    keyString.charAt(m))).length() < 2 ? "0"
                    + Integer.toHexString(keyString.charAt(m)) : ""
                    + Integer.toHexString(keyString.charAt(m));
                    used = true;
                }
            }
        }
        // ends here
        
        for (int k = 0; k < keyString.length(); k++) {
            boolean repeat = false;
            boolean used = false;
            for (int i = 0; i <= 16; i++) {
                for (int j = 0; j <= 16; j++) {
                    if (tmpTable[1][1].equals("" + Integer.toHexString(keyString.charAt(k)))) {
                        repeat = true;
                      
                    } else if (tmpTable[i][j].equals("") && !repeat && !used) {
                        tmpTable[i][j] = chin[k];
                        k++;
                    }
                }
            }
        }
        return tmpTable;
    }
    
    private static Point getPoint(String c, String[][] table) {
        Point pt = new Point(0, 0);
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                if (c.equals(table[i][j])) {
                    pt = new Point(j, i);
                   // its suppose to be i, j ideally
                    // I changed this here to get the points for x and y take note
                
                }              
            }
        }
        return pt;
    }
     
    public static String encodeDigraph(String text, String[][] table, String selectedLanguage) {
       // System.out.println("the language type is... "+selectedLanguage);
        
        if(selectedLanguage.equalsIgnoreCase("english")) {
            return encodeEnglish(text, table);
        }else {
            return encodeOthers(text, table); 
        }
             
    }

    public static String encodeEnglish(String text, String[][] table) {
        
        StringBuilder enc =  new StringBuilder();
        StringBuilder joinedText = new StringBuilder();
        String newText =  (text.length() % 2 == 0) ? text : text+" ";
                
        for (int i = 0; i < newText.length(); i++) {
            
            char x = newText.charAt(i);

            String y = (Integer.toHexString(x)).length() < 2 ? "0"+ Integer.toHexString(x) : Integer.toHexString(x);
             
            joinedText.append(y);
            String xx, yy, xx2, yy2, aa, bb;
            int x1 = 0, y1 = 0;
             
            if(joinedText.length() == 4) {

               joinedText.reverse();
           
               aa = joinedText.substring(0,2);
               bb = joinedText.substring(2);
   
               yy = aa.substring(0,1);
               xx = aa.substring(1);
    
               yy2 = bb.substring(0,1);
               xx2 = bb.substring(1);
       
                for(int b = 1; b < table.length; b++) {
                    if(table[0][b].equalsIgnoreCase("0"+xx)) {
                        x1 = b; 
                    }

                    if(table[b][0].equalsIgnoreCase("0"+yy)) {  
                        y1 = b;
                    }
                }
                
                enc.append(tmpTable[y1][x1]); 
                System.out.println(" ");
                
                for(int b = 1; b < table.length; b++) {
                  swap(table, b );
                  System.out.print(table[0][b]+"\t"); 
                } 
                
                for(int b = 1; b < table.length; b++) {
                     if(table[0][b].equalsIgnoreCase("0"+xx2)) {
                        x1 = b; 
                    }

                    if(table[b][0].equalsIgnoreCase("0"+yy2)) {  
                        y1 = b;
                    }
                 // System.out.print(table[0][b]+"\t"); 
                }

                enc.append(tmpTable[y1][x1]); 
                System.out.println(" ");
                
                for(int b = 1; b < table.length; b++) {
                  swap(table, b );
                  System.out.print(table[0][b]+"\t"); 
                } 
                
                joinedText.delete(0, 4);

            }
   
        }
        System.out.println("\t");
        System.out.println("encryption swapping ended...");
        System.out.println("\t");

        writeFile(enc.toString());
        return enc.toString();
    }

    public static String encodeOthers(String text, String[][] table) {
        
        StringBuilder enc =  new StringBuilder();
        StringBuilder combinedHex = new StringBuilder();
        StringBuilder swappedText;
     
        for (int i = 0; i < text.length(); i++) {
            char x = text.charAt(i);
                        
            String paddedText = (Integer.toHexString(x)).length() < 2 ? "000"+ Integer.toHexString(x) 
                : (Integer.toHexString(x)).length() < 3 ? "00" + Integer.toHexString(x) 
                : (Integer.toHexString(x)).length() < 4 ? "0" + Integer.toHexString(x) 
                : Integer.toHexString(x);
           
            //System.out.println(" the paddedTrext is "+paddedText);

            combinedHex.append(paddedText);
           
           // System.out.println(" the hexvalue is "+combinedHex);
              
            swappedText = combinedHex.reverse();
   
           // System.out.println(" this is the swapped result "+swappedText);
            
            enc.append(encBody(swappedText.substring(0,2), table));
          
            enc.append(encBody(swappedText.substring(2), table));
       
            combinedHex.delete(0, 4);
                        
        }
        return enc.toString();          
    }
    
    public static String encBody(String hexValue, String[][] table) {
        int x1 = 0, y1 = 0; boolean ax = false, ay = false;
        StringBuilder enc = new StringBuilder();
        
        String   yy = hexValue.substring(0,1);
        String  xx = hexValue.substring(1);
                          
        for(int b = 0; b < table.length; b++) {
         
            if(table[0][b].equalsIgnoreCase("0"+xx)) {
                //System.out.println(" for x axis"+table[0][b] +" and 0"+xx);
                x1 = b; 
                ax = true;
               //System.out.println("x1 is "+x1);
            }

            if(table[b][0].equalsIgnoreCase("0"+yy)) {  
              //  System.out.println(" for y axis"+table[b][0] +" and 0"+yy);
                y1 = b;
                ay = true;
            }
            if(ax && ay) {
                break;
            }
         // System.out.print(table[0][b]+"\t"); 
        }

                        
        enc.append(tmpTable[y1][x1]); 
        System.out.println(" ");
            
        for(int b = 1; b < table.length; b++) {
            swap(table, b );
            System.out.print(table[0][b]+"\t"); 
        }
        
           
        System.out.println("\t");
        System.out.println("encryption swapping ended...");
        System.out.println("\t");

        writeFile(enc.toString());
        // System.out.println(" enc tab is "+enc.toString());
        return enc.toString();
    }
    
    public static String decipherText(String text, String[][] table, String selectedLanguage) {
        
        if(selectedLanguage.equalsIgnoreCase("english")) {
          return  decipherEnglishText( text, table);
        }else {
            return decipherOthers( text, table);
        }
    }
  
    public static String decipherEnglishText(String newText, String[][] table) {
         
        StringBuilder enc =  new StringBuilder();
        int x1, y1;
        
        StringBuilder combinedHex = new StringBuilder();
               
        for (int i = 0; i < newText.length(); i++) {
                       
            String x = ""+newText.charAt(i);
                        
            x1 = (int) getPoint(x, table).getX();
            y1 = (int) getPoint(x, table).getY();
     
            String xx = table[0][x1].equalsIgnoreCase("00") ? "0" : table[0][x1].replace("0", "");
            String yy = table[y1][0].equalsIgnoreCase("00") ? "0" : table[y1][0].replace("0", "");
            
            combinedHex.append(yy.concat(xx));
            System.out.println("the combined hexis "+combinedHex);
                            
                
             
            if(combinedHex.length() == 4) {
               combinedHex.reverse();
                          
                enc.append((char) (Integer.decode("#" +combinedHex.substring(0,2))).intValue());  

                enc.append((char) (Integer.decode("#" +combinedHex.substring(2))).intValue());             
            
                combinedHex.delete(0, 4);
            }
            
            for(int b = 1; b < table.length; b++) {
                swap(table, b );
                //System.out.print(table[0][b]+"\t"); 
            } 
            System.out.println("//////////////////////");       
        }
          System.out.println("decryption swapping ended...");
          System.out.println("\t");

        return enc.toString();
            
      }
        
    public static String decipherOthers(String text, String[][] table) {
        
        StringBuilder enc =  new StringBuilder();
        StringBuilder swappedText = new StringBuilder();
        StringBuilder combinedHex = new StringBuilder();
        int x1, y1;
      
         for (int i = 0; i < text.length(); i++) {
                        
            String x = ""+text.charAt(i);
            
            x1 = (int) getPoint(x, table).getX();
            y1 = (int) getPoint(x, table).getY();

             
            String xx = table[0][x1].equalsIgnoreCase("00") ? "0" : table[0][x1].replace("0", "");
            String yy = table[y1][0].equalsIgnoreCase("00") ? "0"  : table[y1][0].replace("0", "");
                 
            String xy = yy.concat(xx);
                       
            combinedHex.append(xy);
                                    
            for(int b = 1; b < table.length; b++) {
                swap(table, b );
                System.out.print(table[0][b]+"\t"); 
            } 
            System.out.println(" ");
             
            
            if(combinedHex.length() == 4) {
                 
                combinedHex.reverse();

                enc.append((char) (Integer.decode("#" +combinedHex)).intValue());
                combinedHex.delete(0, 4);
                swappedText.delete(0, 4);
            }
            
             
        }
          System.out.println("decryption swapping ended...");
          System.out.println("\t");
        return enc.toString();
//       
    }
    
    
    static void swap( String[][] tmpTable, int l){
        String tmp = tmpTable[0][l];
       int ll = l < 16 ? l+1 : l;
        tmpTable[0][l] = tmpTable[0][ll];
        tmpTable[0][ll] = tmp;
       
    }
      
    public static String readFile(String[][] table, String selectedLanguage){
        StringBuilder sb = new StringBuilder();
        try {
            
           // Scanner in = new Scanner(new FileReader("data.txt"));
             FileReader reader = new FileReader("data.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
             
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
               // System.out.println(line);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("error reading file "+e.getMessage());
        }
        return sb.toString();
        
    }
    
    
    public static void writeFile(String text){
        try{
             FileWriter writer = new FileWriter("data.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write(text);
           // bufferedWriter.write("See You Again!");
 
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("error writing to file "+e.getMessage());
        }
    }
   
     
}

