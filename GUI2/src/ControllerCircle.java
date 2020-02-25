import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControllerCircle extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane();
        pane.setAlignment(Pos.CENTER);
        Circle circle = new Circle(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLUE);

        pane.getChildren().add(circle);

        HBox hBox = new HBox(20);
        hBox.setAlignment(Pos.CENTER);
        Button larger = new Button("Enlarge");
        Button shrink = new Button("Shrink");

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter((pane));
        borderPane.setBottom(hBox);
    }
}
