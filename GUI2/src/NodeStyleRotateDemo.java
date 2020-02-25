import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane();
        Button btn = new Button("ok");
        btn.setStyle("-fx-border-color: blue");

        pane.getChildren().add(btn);

        pane.setRotate(45);
        pane.setStyle("-fx-border-color:red ; -fx-background-color: lightGray");

        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("NodeStyleRotateDemo");
        stage.setScene(scene);
        stage.show();

    }
}
