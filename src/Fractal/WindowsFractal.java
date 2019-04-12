package Fractal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class WindowsFractal extends Application{
    
    private final int WIDTH = 800;
    private final int HEIGHT = 700;
    private Pane pane;
    private Scene scene;
    private Canvas canvas;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Graphics");
        initComponents(primaryStage);
        primaryStage.show();
    }

    //inicializo componentes
    private void initComponents(Stage primaryStage) {
        //creo el pane y el scene para el primary stage
        this.pane = new Pane();
        this.scene = new Scene(this.pane, WIDTH, HEIGHT);
        
        //lienzo para pintar
        this.canvas = new Canvas(WIDTH, HEIGHT);
        this.pane.getChildren().add(this.canvas);
        GraphicsContext gc = this.canvas.getGraphicsContext2D();
        draw(gc,-300 , -300);
        
        primaryStage.setScene(this.scene);
    }

    private void draw(GraphicsContext gc, int a, int b) {
       //Recursivo
//        if(a<700){
//            if(b<650){ 
//                //Color
//                gc.setStroke(Color.BLUE);
//              //figura
//                gc.strokeOval(a, b, 800, 700);
//                gc.strokeOval(a, b, 800, 700);
//                draw(gc, a, b+=50);
//            }
//            draw(gc, a+=50, b);
//        }//fin recursivo    
        
        
        //Iterativo
        for (int i = -300; i <800; i+=30) {
            for (int j = -300; j < 700; j+=30) {  
                //Color
                gc.setStroke(Color.DARKRED);
                //figura
                gc.strokeOval(i, j, 30, 150);
                gc.strokeOval(i, j, 300, 300);   
            }
            
        }    

    }

}