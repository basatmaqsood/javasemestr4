import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class HelloFX extends Application {
    @Override
    public void start(Stage stage) {
        Ellipse base = new Ellipse(80, 210, 80, 60);
        base.setFill(Color.WHITE);

        Ellipse middle = new Ellipse(80, 130, 50, 40);
        middle.setFill(Color.WHITE);

        Circle head = new Circle(80, 70, 30);
        head.setFill(Color.WHITE);

        Circle moon = new Circle (5,10,40);
        moon.setFill(Color.WHITE);
        Circle eye_left = new Circle (72,60,3);
        eye_left.setFill(Color.BLACK);
        Circle eye_right = new Circle (85,60,3);
        eye_right.setFill(Color.BLACK);

        Circle btn_1 = new Circle (80,120,4);
        btn_1.setFill(Color.RED);
        Circle btn_2 = new Circle (80,140,4);
        btn_2.setFill(Color.RED);


        Line leftArm = new Line(110, 130, 160, 130);
        leftArm.setStrokeWidth(3);

        Line rightArm = new Line(50, 130, 0, 100);
        rightArm.setStrokeWidth(3);
        Line mouth = new Line(70,80,90,80);
        mouth.setStrokeWidth(1);


        Rectangle hat_head = new Rectangle(60, 0, 40, 50);
        hat_head.setFill(Color.PURPLE);
        Rectangle  hat_bottom= new Rectangle(50, 45, 60, 5);
        hat_head.setFill(Color.PURPLE)
        ;
        Group hat = new Group(hat_head, hat_bottom);
    


        Group snowman = new Group(base, middle, head,moon,mouth,eye_left,eye_right, leftArm, rightArm,btn_1,btn_2, hat);
        snowman.setTranslateX(170);
        snowman.setTranslateY(50);

        Rectangle ground = new Rectangle(0, 250, 500, 100);
        ground.setFill(Color.GREEN);

        Group root = new Group(ground, snowman);
        Scene scene = new Scene(root, 500, 350, Color.BLACK);

        stage.setTitle("SNOWWMAN");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        }
       
}