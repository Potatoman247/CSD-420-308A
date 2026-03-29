package ajacoby.module1discussoin;

///Used imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.Group;
import javafx.scene.paint.Color;


/**
 * Aidan Jacoby Module 1 Discussion
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        //creating the Shape Objects
        Ellipse e = new Ellipse(320.0f, 330.f, 100.0f, 150.0f);
        Ellipse e2 = new Ellipse();
        e2.setCenterX(320.f);
        e2.setCenterY(150.f);
        e2.setRadiusX(100.f);
        e2.setRadiusY(150.f);
        
        //creating the Color objecs
        Color c = Color.rgb(155,245,0);
        Color c2 = Color.color(.45f,.95f,0);
        
        //Setting the shapes to the created color
        e2.setFill(c2);
        e.setFill(c);
        
        //adding shapes to the scene
        Group root = new Group(e,e2);
        
        //scene setup
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}