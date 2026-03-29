/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package com.mycompany.module1_3assignment;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 *
 * @author Aidan
 */


public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Random rand = new Random();
        final int cardOne = 0;
        final int cardTwo = 0;
        final int cardThree = 0;
        final int cardFour = 0;
        
        
        Button btn = new Button();
        btn.setText("Flip Cards");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                int c1;
                int c2;
                int c3;
                int c4;
                
                c1 = rand.nextInt(52);
                c2 = rand.nextInt(52);
                    while (c2 == c1) {
                        c2 = rand.nextInt(52);
                    }
                c3 = rand.nextInt(52);
                    while (c3 == c2) {
                        c3 = rand.nextInt(52);
                    }
                    while (c3 == c1) {
                        c3 = rand.nextInt(52);
                    }
                c4 = rand.nextInt(52);
                    while (c4 == c3) {
                        c4 = rand.nextInt(52);
                    }
                    while (c4 == c2) {
                        c4 = rand.nextInt(52);
                    }
                    while (c3 == c1) {
                        c4 = rand.nextInt(52);
                    }
                
                System.out.println(Integer.toString(c1)+ ' ' +Integer.toString(c2)+ ' ' +Integer.toString(c3)+ ' ' +Integer.toString(c4));
                
                cardOne = "C:/csd/CSD-420-308A/module-1/module1_3assignment/src/main/java/com/mycompany/module1_3assignment/cards/"+Integer.toString(c1)+".png";
                final int cardTwo = c2;
                final int cardThree = c3;
                final int cardFour = c4;
                System.out.println("C:/csd/CSD-420-308A/module-1/module1_3assignment/src/main/java/com/mycompany/module1_3assignment/cards/"+Integer.toString(c1)+".png");
            }
        String c1URL = "cards\\"+String.valueOf(cardOne)+".png";
        //String c2URL = "C:\\csd\\CSD-420-308A\\module-1\\module1_3assignment\\src\\main\\java\\com\\mycompany\\module1_3assignment\\cards\\"+String.valueOf(cardTwo)+".png";
        //String c3URL = "C:\\csd\\CSD-420-308A\\module-1\\module1_3assignment\\src\\main\\java\\com\\mycompany\\module1_3assignment\\cards\\"+String.valueOf(cardThree)+".png";
        //String c4URL = "C:\\csd\\CSD-420-308A\\module-1\\module1_3assignment\\src\\main\\java\\com\\mycompany\\module1_3assignment\\cards\\"+String.valueOf(cardFour)+".png";

        //Image card1 = new Image(c1URL);
        //Image card2 = new Image(c2URL);
        //Image card3 = new Image(c3URL);
        //Image card4 = new Image(c4URL);
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 700, 600);
        
        primaryStage.setTitle("Card Flipper");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
