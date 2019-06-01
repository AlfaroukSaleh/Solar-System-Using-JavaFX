
 package javafxapplication2;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
        import javafx.scene.text.*;
import javafx.scene.layout.HBox;
 import javafx.scene.layout.Pane;
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class JavaFXApplication2 extends Application {
    int x1=1,x2=1,x3=1,x4=1,x5=1,x6=1,x7=1,x8=1,x10=0;
   @Override
   public void start (Stage stage){
   Pane pane = new Pane();
   
   Circle sun = new Circle (40,Color.YELLOW);
   sun.setCenterX(500);
   sun.setCenterY(500);
   
   
   //*********************************
   Circle p11=new Circle (400,Color.WHITE);
   p11.setStroke(Color.BLACK);
   p11.setCenterX(500);
   p11.setCenterY(500);
   Circle p1 = new Circle (50,Color.BLUE);
   p1.setCenterX(500);
   p1.setCenterY(100);
   
   PathTransition pt1 = new PathTransition ();
   pt1.setDuration(Duration.millis(5000));
   pt1.setPath(p11);
   pt1.setNode(p1);
   pt1.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt1.setCycleCount(Timeline.INDEFINITE);
   pt1.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x1%2==1)
      pt1.play();  
       else pt1.pause();
       
       x1++;
   } 
};   
   p1.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);  
   
   //*********************************************************
   
    Circle p22=new Circle (350,Color.WHITE);
   p22.setStroke(Color.BLACK);
   p22.setCenterX(500);
   p22.setCenterY(500);
   Circle p2 = new Circle (45,Color.CADETBLUE);
   p2.setCenterX(500);
   p2.setCenterY(150);
   
   PathTransition pt2 = new PathTransition ();
   pt2.setDuration(Duration.millis(4000));
   pt2.setPath(p22);
   pt2.setNode(p2);
   pt2.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt2.setCycleCount(Timeline.INDEFINITE);
   pt2.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x2%2==1)
      pt2.play();  
       else pt2.pause();
       
       x2++;
   } 
};   
   p2.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler2);  
   
   //*********************************************************
   Circle p33=new Circle (300,Color.WHITE);
   p33.setStroke(Color.BLACK);
   p33.setCenterX(500);
   p33.setCenterY(500);
   Circle p3 = new Circle (40,Color.BROWN);
   p3.setCenterX(500);
   p3.setCenterY(200);
   
   PathTransition pt3 = new PathTransition ();
   pt3.setDuration(Duration.millis(3000));
   pt3.setPath(p33);
   pt3.setNode(p3);
   pt3.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt3.setCycleCount(Timeline.INDEFINITE);
   pt3.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler3 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x3%2==1)
      pt3.play();  
       else pt3.pause();
       
       x3++;
   } 
};   
   p3.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler3);  
   
   //*********************************************************
   Circle p44=new Circle (250,Color.WHITE);
   p44.setStroke(Color.BLACK);
   p44.setCenterX(500);
   p44.setCenterY(500);
   Circle p4 = new Circle (35,Color.CHOCOLATE);
   p4.setCenterX(500);
   p4.setCenterY(250);
   
   PathTransition pt4 = new PathTransition ();
   pt4.setDuration(Duration.millis(2000));
   pt4.setPath(p44);
   pt4.setNode(p4);
   pt4.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt4.setCycleCount(Timeline.INDEFINITE);
   pt4.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler4 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x4%2==1)
      pt4.play();  
       else pt4.pause();
       
       x4++;
   } 
};   
   p4.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler4);  
   
   //*********************************************************
   Circle p55=new Circle (200,Color.WHITE);
   p55.setStroke(Color.BLACK);
   p55.setCenterX(500);
   p55.setCenterY(500);
   Circle p5 = new Circle (30,Color.CORNFLOWERBLUE);
   p5.setCenterX(500);
   p5.setCenterY(300);
   
   PathTransition pt5 = new PathTransition ();
   pt5.setDuration(Duration.millis(1500));
   pt5.setPath(p55);
   pt5.setNode(p5);
   pt5.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt5.setCycleCount(Timeline.INDEFINITE);
   pt5.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler5 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x5%2==1)
      pt5.play();  
       else pt5.pause();
       
       x5++;
   } 
};   
   p5.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler5);  
   
   //*********************************************************
   Circle p66=new Circle (150,Color.WHITE);
   p66.setStroke(Color.BLACK);
   p66.setCenterX(500);
   p66.setCenterY(500);
   Circle p6 = new Circle (25,Color.DARKORANGE);
   p6.setCenterX(500);
   p6.setCenterY(350);
   
   PathTransition pt6 = new PathTransition ();
   pt6.setDuration(Duration.millis(1300));
   pt6.setPath(p66);
   pt6.setNode(p6);
   pt6.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt6.setCycleCount(Timeline.INDEFINITE);
   pt6.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler6 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x6%2==1)
      pt6.play();  
       else pt6.pause();
       
       x6++;
   } 
};   
   p6.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler6);  
   
   //*********************************************************
     Circle p77=new Circle (120,Color.WHITE);
   p77.setStroke(Color.BLACK);
   p77.setCenterX(500);
   p77.setCenterY(500);
   Circle p7 = new Circle (23,Color.DARKMAGENTA);
   p7.setCenterX(500);
   p7.setCenterY(380);
   
   PathTransition pt7 = new PathTransition ();
   pt7.setDuration(Duration.millis(1200));
   pt7.setPath(p77);
   pt7.setNode(p7);
   pt7.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt7.setCycleCount(Timeline.INDEFINITE);
   pt7.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler7 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x7%2==1)
      pt7.play();  
       else pt7.pause();
       
       x7++;
   } 
};   
   p7.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler7);  
   
   //*********************************************************
   Circle p88=new Circle (70,Color.WHITE);
   p88.setStroke(Color.BLACK);
   p88.setCenterX(500);
   p88.setCenterY(500);
   Circle p8 = new Circle (18,Color.BLACK);
   p8.setCenterX(500);
   p8.setCenterY(430);
   
   PathTransition pt8 = new PathTransition ();
   pt8.setDuration(Duration.millis(1000));
   pt8.setPath(p88);
   pt8.setNode(p8);
   pt8.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt8.setCycleCount(Timeline.INDEFINITE);
   pt8.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler8 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x8%2==1)
      pt8.play();  
       else pt8.pause();
       
       x8++;
   } 
};   
   p8.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler8);  
   
   //*********************************************************
     
   
   
   
   
   pane.getChildren().addAll(p11,p1,p22,p2,p33,p3,p44,p4,p55,p5,p66,p6,p77,p7,p88,p8,sun);
   
   
   
   
  Scene scene = new Scene(pane,1000,1000);
  
  
  
  scene.setOnKeyPressed(e->{
    if (e.getCode()==KeyCode.SPACE&& (x10%2==1)){
  pt1.pause();
    pt2.pause();
  pt3.pause();
  pt4.pause();
  pt5.pause();
  pt6.pause();
  pt7.pause();
  pt8.pause();
  x10++;
    }
    else if (e.getCode()==KeyCode.SPACE&& (x10%2!=1)) {
  pt1.play();
    pt2.play();
  pt3.play();
  pt4.play();
  pt5.play();
  pt6.play();
  pt7.play();
  pt8.play();
  x10++;
  
  }      
      else if (e.getCode()==KeyCode.UP){
  p1.setRadius(p1.getRadius()+5);
    p2.setRadius(p2.getRadius()+5);
  p3.setRadius(p3.getRadius()+5);
  p4.setRadius(p4.getRadius()+5);
  p5.setRadius(p5.getRadius()+5);
  p6.setRadius(p6.getRadius()+5);
  p7.setRadius(p7.getRadius()+5);
  p8.setRadius(p8.getRadius()+5);
  }
  else if (e.getCode()==KeyCode.DOWN){
  p1.setRadius(p1.getRadius()-5);
    p2.setRadius(p2.getRadius()-5);
  p3.setRadius(p3.getRadius()-5);
  p4.setRadius(p4.getRadius()-5);
  p5.setRadius(p5.getRadius()-5);
  p6.setRadius(p6.getRadius()-5);
  p7.setRadius(p7.getRadius()-5);
  p8.setRadius(p8.getRadius()-5);
  }
  
  });
  
  stage.setScene(scene);
  stage.setTitle("Student Form");
  stage.show();
   
   }
   
    

    
     
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

package javafxapplication2;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
        import javafx.scene.text.*;
import javafx.scene.layout.HBox;
 import javafx.scene.layout.Pane;
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import javafx.scene.shape.Line;

import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Ellipse;
import javafx.util.Duration;
/**
 *
 * @author al-farouksaleh
 




public class JavaFXApplication2 extends Application {

    
    public void start(Stage primaryStage) {


        GridPane pane = new GridPane();
         TextField [][]text = new TextField [100][100]; 
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
              text [i][j]= new TextField( Integer.toString((int)(Math.random() * 2)));
                text [i][j].setMinWidth(50);
                text [i][j].setMaxWidth(50);
                text [i][j].setMinHeight(50);
                text [i][j].setMaxHeight(50);
                pane.add(text [i][j], j, i);
            }
        }
        int x;
        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {  
        text[i][j].setOnAction(e->{
        try {
            
           
               // int m=i; int n=j;
        x=Integer.parseInt(text[i][j].getText());
        
                
           
        }
        
        catch (NumberFormatException e){
        text[i][j].setText("#");
        }
        
        };) 
            
            }}    
        
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
                primaryStage.setTitle("100 by 100 matrix");
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}








*****************/



/*************
 * solar System*********
 
 * 
 package javafxapplication2;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
        import javafx.scene.text.*;
import javafx.scene.layout.HBox;
 import javafx.scene.layout.Pane;
 import javafx.scene.image.Image;
 import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class JavaFXApplication2 extends Application {
    int x1=1,x2=1,x3=1,x4=1,x5=1,x6=1,x7=1,x8=1,x10=0;
   @Override
   public void start (Stage stage){
   Pane pane = new Pane();
   
   Circle sun = new Circle (40,Color.YELLOW);
   sun.setCenterX(500);
   sun.setCenterY(500);
   
   
   //*********************************
   Circle p11=new Circle (400,Color.WHITE);
   p11.setStroke(Color.BLACK);
   p11.setCenterX(500);
   p11.setCenterY(500);
   Circle p1 = new Circle (50,Color.BLUE);
   p1.setCenterX(500);
   p1.setCenterY(100);
   
   PathTransition pt1 = new PathTransition ();
   pt1.setDuration(Duration.millis(5000));
   pt1.setPath(p11);
   pt1.setNode(p1);
   pt1.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt1.setCycleCount(Timeline.INDEFINITE);
   pt1.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x1%2==1)
      pt1.play();  
       else pt1.pause();
       
       x1++;
   } 
};   
   p1.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);  
   
   //*********************************************************
   
    Circle p22=new Circle (350,Color.WHITE);
   p22.setStroke(Color.BLACK);
   p22.setCenterX(500);
   p22.setCenterY(500);
   Circle p2 = new Circle (45,Color.CADETBLUE);
   p2.setCenterX(500);
   p2.setCenterY(150);
   
   PathTransition pt2 = new PathTransition ();
   pt2.setDuration(Duration.millis(4000));
   pt2.setPath(p22);
   pt2.setNode(p2);
   pt2.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt2.setCycleCount(Timeline.INDEFINITE);
   pt2.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler2 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x2%2==1)
      pt2.play();  
       else pt2.pause();
       
       x2++;
   } 
};   
   p2.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler2);  
   
   //*********************************************************
   Circle p33=new Circle (300,Color.WHITE);
   p33.setStroke(Color.BLACK);
   p33.setCenterX(500);
   p33.setCenterY(500);
   Circle p3 = new Circle (40,Color.BROWN);
   p3.setCenterX(500);
   p3.setCenterY(200);
   
   PathTransition pt3 = new PathTransition ();
   pt3.setDuration(Duration.millis(3000));
   pt3.setPath(p33);
   pt3.setNode(p3);
   pt3.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt3.setCycleCount(Timeline.INDEFINITE);
   pt3.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler3 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x3%2==1)
      pt3.play();  
       else pt3.pause();
       
       x3++;
   } 
};   
   p3.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler3);  
   
   //*********************************************************
   Circle p44=new Circle (250,Color.WHITE);
   p44.setStroke(Color.BLACK);
   p44.setCenterX(500);
   p44.setCenterY(500);
   Circle p4 = new Circle (35,Color.CHOCOLATE);
   p4.setCenterX(500);
   p4.setCenterY(250);
   
   PathTransition pt4 = new PathTransition ();
   pt4.setDuration(Duration.millis(2000));
   pt4.setPath(p44);
   pt4.setNode(p4);
   pt4.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt4.setCycleCount(Timeline.INDEFINITE);
   pt4.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler4 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x4%2==1)
      pt4.play();  
       else pt4.pause();
       
       x4++;
   } 
};   
   p4.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler4);  
   
   //*********************************************************
   Circle p55=new Circle (200,Color.WHITE);
   p55.setStroke(Color.BLACK);
   p55.setCenterX(500);
   p55.setCenterY(500);
   Circle p5 = new Circle (30,Color.CORNFLOWERBLUE);
   p5.setCenterX(500);
   p5.setCenterY(300);
   
   PathTransition pt5 = new PathTransition ();
   pt5.setDuration(Duration.millis(1500));
   pt5.setPath(p55);
   pt5.setNode(p5);
   pt5.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt5.setCycleCount(Timeline.INDEFINITE);
   pt5.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler5 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x5%2==1)
      pt5.play();  
       else pt5.pause();
       
       x5++;
   } 
};   
   p5.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler5);  
   
   //*********************************************************
   Circle p66=new Circle (150,Color.WHITE);
   p66.setStroke(Color.BLACK);
   p66.setCenterX(500);
   p66.setCenterY(500);
   Circle p6 = new Circle (25,Color.DARKORANGE);
   p6.setCenterX(500);
   p6.setCenterY(350);
   
   PathTransition pt6 = new PathTransition ();
   pt6.setDuration(Duration.millis(1300));
   pt6.setPath(p66);
   pt6.setNode(p6);
   pt6.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt6.setCycleCount(Timeline.INDEFINITE);
   pt6.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler6 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x6%2==1)
      pt6.play();  
       else pt6.pause();
       
       x6++;
   } 
};   
   p6.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler6);  
   
   //*********************************************************
     Circle p77=new Circle (120,Color.WHITE);
   p77.setStroke(Color.BLACK);
   p77.setCenterX(500);
   p77.setCenterY(500);
   Circle p7 = new Circle (23,Color.DARKMAGENTA);
   p7.setCenterX(500);
   p7.setCenterY(380);
   
   PathTransition pt7 = new PathTransition ();
   pt7.setDuration(Duration.millis(1200));
   pt7.setPath(p77);
   pt7.setNode(p7);
   pt7.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt7.setCycleCount(Timeline.INDEFINITE);
   pt7.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler7 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x7%2==1)
      pt7.play();  
       else pt7.pause();
       
       x7++;
   } 
};   
   p7.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler7);  
   
   //*********************************************************
   Circle p88=new Circle (70,Color.WHITE);
   p88.setStroke(Color.BLACK);
   p88.setCenterX(500);
   p88.setCenterY(500);
   Circle p8 = new Circle (18,Color.BLACK);
   p8.setCenterX(500);
   p8.setCenterY(430);
   
   PathTransition pt8 = new PathTransition ();
   pt8.setDuration(Duration.millis(1000));
   pt8.setPath(p88);
   pt8.setNode(p8);
   pt8.setOrientation(
   PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
   pt8.setCycleCount(Timeline.INDEFINITE);
   pt8.setAutoReverse(false);
 

   
   EventHandler<MouseEvent> eventHandler8 = new EventHandler<MouseEvent>() { 
   @Override 
   public void handle(MouseEvent e) { 
       if (x8%2==1)
      pt8.play();  
       else pt8.pause();
       
       x8++;
   } 
};   
   p8.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler8);  
   
   //*********************************************************
     
   
   
   
   
   pane.getChildren().addAll(p11,p1,p22,p2,p33,p3,p44,p4,p55,p5,p66,p6,p77,p7,p88,p8,sun);
   
   
   
   
  Scene scene = new Scene(pane,1000,1000);
  
  
  
  scene.setOnKeyPressed(e->{
    if (e.getCode()==KeyCode.SPACE&& (x10%2==1)){
  pt1.pause();
    pt2.pause();
  pt3.pause();
  pt4.pause();
  pt5.pause();
  pt6.pause();
  pt7.pause();
  pt8.pause();
  x10++;
    }
    else if (e.getCode()==KeyCode.SPACE&& (x10%2!=1)) {
  pt1.play();
    pt2.play();
  pt3.play();
  pt4.play();
  pt5.play();
  pt6.play();
  pt7.play();
  pt8.play();
  x10++;
  
  }      
      else if (e.getCode()==KeyCode.UP){
  p1.setRadius(p1.getRadius()+5);
    p2.setRadius(p2.getRadius()+5);
  p3.setRadius(p3.getRadius()+5);
  p4.setRadius(p4.getRadius()+5);
  p5.setRadius(p5.getRadius()+5);
  p6.setRadius(p6.getRadius()+5);
  p7.setRadius(p7.getRadius()+5);
  p8.setRadius(p8.getRadius()+5);
  }
  else if (e.getCode()==KeyCode.DOWN){
  p1.setRadius(p1.getRadius()-5);
    p2.setRadius(p2.getRadius()-5);
  p3.setRadius(p3.getRadius()-5);
  p4.setRadius(p4.getRadius()-5);
  p5.setRadius(p5.getRadius()-5);
  p6.setRadius(p6.getRadius()-5);
  p7.setRadius(p7.getRadius()-5);
  p8.setRadius(p8.getRadius()-5);
  }
  
  });
  
  stage.setScene(scene);
  stage.setTitle("Student Form");
  stage.show();
   
   }
   
    

    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}

* 
* 
* 
* 
* 
* 
* 
**********************************/

/*@Override
   public void start (Stage stage)
   {
              StackPane pane = new StackPane ();

     Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        pane.getChildren().add(circle);
       //circle.setStroke(Color.BLACK);
       //circle.setFill(Color.WHITE);
      // pane.getChildren().add(circle);
      Label label = new Label ("JAVA FX");
      label.setFont(Font.font("Times New Roman",
FontWeight.BOLD, FontPosture.ITALIC, 20));
       circle.setStyle("-fx-stroke : black; -fx-fill: red;");
       pane.getChildren().add(label);
      stage.setTitle("circle");
      Scene scene = new Scene(pane,200,200);
      stage.setScene(scene);
      stage.show();
       
     /*  Stage stage2 = new Stage ();
       stage.setTitle("what r u doing");
       stage2.setScene(new Scene (new Button ("wb going out"),300,400));
       stage2.show();*/
     
    /* Button button = new Button ("hello mzfkkr");
     button.setScaleX(0.5);
     button.setScaleY(0.5);
     button . setStyle("-fx-border-color:black;");
     
     pane.getChildren().add(button);
     pane.setStyle ("-fx-border-color: black; -fx-background-color: red;");
     pane.setRotate(45);
     Scene scene = new Scene (pane,200,200);
     stage.setScene(scene);
     stage.show();*/
     


/*pane.setPadding(new Insets(5, 5, 5, 5));   
   //Image image = new Image ("https://www.gitexfuturestars.com/__media/libraries/exhibitors/993D18F1-5056-B757-5C01609CCF621D22-cover_image.jpg.png");
   
   
   //pane.getChildren().add(new ImageView(image));
  
  ImageView image2 = new ImageView("https://www.gitexfuturestars.com/__media/libraries/exhibitors/993D18F1-5056-B757-5C01609CCF621D22-cover_image.jpg.png"); image2.setFitHeight(100);
  image2.setFitWidth(150);
  image2.setFitHeight(100);
  //pane.getChildren().add(image2);
  
  ImageView image3 = new ImageView ("https://www.gitexfuturestars.com/__media/libraries/exhibitors/993D18F1-5056-B757-5C01609CCF621D22-cover_image.jpg.png");
  image3.setRotate(180);
  image3.setFitWidth(150);
   image3.setFitHeight(100);
  
  pane.getChildren().addAll(image3,image2);*/
   



  /*Line l1=new Line(100,100,500,100);l1.setStroke(Color.RED);
   Line l2=new Line(500,100,500,300);l2.setStroke(Color.YELLOW);
      Line l3=new Line(500,300,100,300);l3.setStroke(Color.BLACK);
        Line l4=new Line(100,300,100,100);l4.setStroke(Color.GREEN);

        Rectangle R = new Rectangle (150,150,300,120);
        R.setFill(Color.RED);
        R.setStroke(Color.BLACK);
        pane.getChildren().addAll(l1,l2,l3,l4,R);*/



/*FlowPane pane = new FlowPane();
   Label l1= new Label ("First Name");
   TextField t1= new TextField();
   t1.setPrefColumnCount(200);
   Label l2= new Label ("Last Name");
   TextField t2= new TextField();
   t2.setPrefColumnCount(300);

   Label l3= new Label ("ID");
   TextField t3= new TextField();
   t3.setPrefColumnCount(100);
  
   Button btn = new Button ("Submit");*/

/*Pane pane=new Pane();
   Line l1=new Line(100,100,500,100);l1.setStroke(Color.RED);
   Line l2=new Line(500,100,500,300);l2.setStroke(Color.YELLOW);
      Line l3=new Line(500,300,100,300);l3.setStroke(Color.BLACK);
        Line l4=new Line(100,300,100,100);l4.setStroke(Color.GREEN);

        Rectangle R = new Rectangle (150,150,300,120);
        R.setFill(Color.RED);
        R.setStroke(Color.BLACK);
        pane.getChildren().addAll(l1,l2,l3,l4,R);*/