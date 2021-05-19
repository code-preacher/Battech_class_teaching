/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MATDATS;


import java.io.File;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 *
 * @author User*/
public class MATDATS extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     primaryStage.initStyle(StageStyle.UNDECORATED);
     Label button = new Label("X");
     Label minimize = new Label("―");
     minimize.setId("mini");
     Label title = new Label("DiagnoseMe");
     title.setId("title");
     Label space = new Label("                                                               ");
     Label space1 = new Label("                                                               ");
     Label space2 = new Label("                                                               ");
     HBox header =  new HBox(title,space,space1,space2,minimize,button);
     File file = new File("C:\\Users\\User\\Desktop\\menu.png");
     Image image = new Image(file.toURI().toString());
     ImageView imgv = new ImageView();
     imgv.setImage(image);
     VBox box1 = new VBox(imgv);
          imgv.setFitHeight(35);
     imgv.setFitWidth(35);
     box1.setPrefWidth(35);
     box1.setPrefHeight(35);
     box1.setId("menu");
     box1.setPadding(new Insets(3));
     //second image begins here
     File file1 = new File("C:\\Users\\User\\Desktop\\camera.png");
     Image image1 = new Image(file1.toURI().toString());
     ImageView imgv1 = new ImageView();
     imgv1.setImage(image1);
     imgv1.setFitWidth(25);
     imgv1.setFitHeight(25);
     
     
     VBox box2 = new VBox(imgv1);
     box2.setPrefHeight(28);
     box2.setPrefWidth(28);
     box2.setPadding(new Insets(8));
     box2.setId("menu");
     //third image begins here
     File file2 = new File("C:\\Users\\User\\Desktop\\mosq.png");
     Image image2 = new Image(file2.toURI().toString());
     ImageView imgv2 = new ImageView();
     imgv2.setImage(image2);
     imgv2.setFitWidth(25);
     imgv2.setFitHeight(25);
     VBox box3 = new VBox(imgv2);
     box3.setPrefHeight(28);
     box3.setPrefWidth(28);
     box3.setPadding(new Insets(8));
     box3.setId("menu");
     //fourth image begins here
     File file3 = new File("C:\\Users\\User\\Desktop\\treat.png");
     Image image3 = new Image(file3.toURI().toString());
     ImageView imgv3 = new ImageView();
     imgv3.setImage(image3);
     imgv3.setFitWidth(25);
     imgv3.setFitHeight(25);
     VBox box4 = new VBox(imgv3);
     box4.setPrefHeight(28);
     box4.setPrefWidth(28);
     box4.setPadding(new Insets(8));
     box4.setId("menu");
     VBox box = new VBox(box1,box2,box3,box4);
     box.setId("menu1");
     box.setPrefHeight(240);
     box.setPrefWidth(45);
     box.setPadding(new Insets(9));
     header.setId("header");
     header.setPrefHeight(23);
     header.setPrefWidth(27);
     header.setPadding(new Insets(5));
     header.setSpacing(10);
     HBox footer =  new HBox();
     footer.setId("header");
     footer.setPrefHeight(30);
     footer.setPrefWidth(27);
     footer.setPadding(new Insets(5));
     button.setAlignment(Pos.TOP_RIGHT);
     button.setPadding(new Insets(5));
     button.setId("close");
     button.setPadding(new Insets(7));
     minimize.setPadding(new Insets(7));
     button.setOnMouseClicked(new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent ae) {
             primaryStage.close(); 
         }
     });
     minimize.setOnMouseClicked(new EventHandler<MouseEvent>(){
        public void handle(MouseEvent ae){
            
            primaryStage.hide();
        }
    });
     BorderPane root = new BorderPane();
     root.setTop(header);
     double width = root.getWidth();
     box1.setOnMouseClicked(new EventHandler<MouseEvent>(){
         public void handle(MouseEvent me){
           FadeTransition fade = new FadeTransition(Duration.seconds(10),homePage());
           fade.setFromValue(1.0);
           //fade.interpolatorProperty().set(Interpolator.EASE_BOTH);
           fade.setToValue(0.3);
           fade.play();
              
     }
     });
     
     imgv1.setOnMouseClicked(ae->{
         try {
             root.setCenter(getQuestion());
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null,""+e.toString());
         }
     });
     
     root.setId("scene");
     root.setCenter(homePage());
     root.setLeft(box);
     Scene scene = new Scene(root,800,600);
     URL url = getClass().getResource("style.css");
     String css = url.toExternalForm();
     scene.getStylesheets().add(css);
     primaryStage.setScene(scene);
     primaryStage.setMaxHeight(800);
     primaryStage.setMaxWidth(800);
     primaryStage.show();
    }
    
    FlowPane test(){
        
        Label question = new Label("1.  Do you have a headache? ");
        question.setId("questionColor");
        CheckBox checkBox1 = new CheckBox("Yes");
        CheckBox checkBox2 = new CheckBox("No");
        VBox flow = new VBox(question,checkBox1,checkBox2);
        flow.setSpacing(5);
        flow.setPadding(new Insets(10));
        Label question1 = new Label("2.  Do you have a headache? ");
        question1.setId("questionColor");
        CheckBox checkBox3 = new CheckBox("Yes");
        CheckBox checkBox4 = new CheckBox("No");
        VBox flow1 = new VBox(question1,checkBox3,checkBox4);
        flow1.setSpacing(5);
        flow1.setPadding(new Insets(10));
        FlowPane flowPane = new FlowPane(flow,flow1);
        flowPane.setHgap(20);
        return flowPane;
    } 
    VBox homePage(){
        Label title = new Label("Malaria and Typhoid Diagonis System");
        title.setId("questionColor");
        Label content = new Label("This is a malaria and typhod diagonis system that is only meant to\n "
                + "diagonose patients based on the results provided by the user of the system, which \n "
                + "means it is knowledge driven and it also prescribes drugs for the users and all the\n "
                + "patients are to ensure they provide accurate answers to get the best service.A-team\n "
                );
        content.setId("questionColor");
        //loading the images
        File file1 = new File("C:\\Users\\User\\Desktop\\sick2.jpg");
        Image image1 = new Image(file1.toURI().toString());
        ImageView imageView1 = new ImageView();
        imageView1.setImage(image1);
        File file2 = new File("C:\\Users\\User\\Desktop\\water.jpg");
        Image image2 = new Image(file2.toURI().toString());
        ImageView imageView2 = new ImageView();
        imageView2.setImage(image2);
        File file3 = new File("C:\\Users\\User\\Desktop\\stomach.jpg");
        Image image3 = new Image(file3.toURI().toString());
        ImageView imageView3 = new ImageView();
        imageView3.setImage(image3);
        File file4 = new File("C:\\Users\\User\\Desktop\\clues.jpg");
        Image image4 = new Image(file4.toURI().toString());
        ImageView imageView4 = new ImageView();
        imageView4.setImage(image4);
        imageView1.setFitWidth(155);
        imageView1.setFitHeight(155);
        imageView2.setFitWidth(155);
        imageView2.setFitHeight(155);
        imageView3.setFitWidth(155);
        imageView3.setFitHeight(155);
        imageView4.setFitWidth(155);
        imageView4.setFitHeight(155);
        //Scalling Transitions
        ScaleTransition st = new ScaleTransition(Duration.seconds(.2), imageView1);
        
        imageView1.setOnMouseEntered((MouseEvent me) -> {
            st.setNode(imageView1);
            st.setToX(3.8);
            st.setToY(2.6);
            st.playFromStart();
            });
        imageView1.setOnMouseExited((MouseEvent me)-> {
            st.setNode(imageView1);
            st.setToX(1);
            st.setToY(1);
            st.playFromStart();
        
        });
        imageView2.setOnMouseEntered((MouseEvent me) -> {
            st.setNode(imageView2);
            st.setToX(3.8);
            st.setToY(2.6);
            st.playFromStart();
            });
        imageView2.setOnMouseExited((MouseEvent me)-> {
            st.setNode(imageView2);
            st.setToX(1);
            st.setToY(1);
            st.playFromStart();
        
        });
        imageView3.setOnMouseEntered((MouseEvent me) -> {
            st.setNode(imageView3);
            st.setToX(3.8);
            st.setToY(2.6);
            st.playFromStart();
            });
        imageView3.setOnMouseExited((MouseEvent me)-> {
            st.setNode(imageView3);
            st.setToX(1);
            st.setToY(1);
            st.playFromStart();
        
        });
        imageView4.setOnMouseEntered((MouseEvent me) -> {
            st.setNode(imageView4);
            st.setToX(3.8);
            st.setToY(2.6);
            st.playFromStart();
            });
        imageView4.setOnMouseExited((MouseEvent me)-> {
            st.setNode(imageView4);
            st.setToX(1);
            st.setToY(1);
            st.playFromStart();
        
        });
       
        HBox hbox = new HBox(imageView1,imageView2,imageView3,imageView4);
        
        
        TranslateTransition slide = new TranslateTransition(Duration.INDEFINITE,hbox);
        
        slide.setByX(250);
        slide.play();
        hbox.setSpacing(30);
        hbox.setPadding(new Insets(7));
        VBox box = new VBox(title,content,hbox);
        box.setSpacing(10);
        box.setPadding(new Insets(5));
    return box;
    }
    
    //frame for holding questions
    
    Label getQuestion() throws Exception{
        File file = new File("C:\\Users\\User\\Desktop\\questions.txt");
        Scanner input = new Scanner(file);
         String in = null;
        Label text = null;
        while(input.hasNextLine()){
            
             text = new Label(in = input.nextLine());
             
        }
        text.setId("question");
        return text;
    }
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
