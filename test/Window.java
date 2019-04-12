


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Window extends Application{
    
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
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
        draw(gc);
        
        primaryStage.setScene(this.scene);
    }

    private void draw(GraphicsContext gc) {
        //linea
        gc.strokeLine(25, 25, 175, 25);
        
        //rectángulo
        gc.strokeRect(25, 50, 150, 100);
      
        //polígono
        double x[] = new double[]{75, 100, 150, 100, 80, 80, 75};
        double y[] = new double[]{200, 240, 260, 280, 260, 240, 200};
        gc.fillPolygon(x, y, 7);
        
        //rectángulo
        gc.fillRect(25, 300, 150, 100);
        
        //óvalo
        gc.fillOval(25, 450, 125, 125);
        
        //rectángulo con esquinas redondeadas
        gc.fillRoundRect(200, 25, 150, 100, 50, 50);
        
        //óvalo sin relleno
        gc.strokeOval(200, 200, 150, 150);
        
        gc.strokeOval(500, 100, 50, 150);
        
        gc.strokeArc(350, 350, 350, 350, 5, 100, ArcType.CHORD);
        
        
    }

}
