import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        HBox pane = new HBox(20);
        pane.setMinSize(200,100);
        pane.setAlignment(Pos.CENTER);

        Button btOK = new Button("OK");
        pane.getChildren().add(btOK);
        Button btCancel = new Button("Cancel");
        pane.getChildren().add(btCancel);

        okHandler handler1 = new okHandler();
        btOK.setOnAction(handler1);
        cancelHandler handler2 = new cancelHandler();
        btCancel.setOnAction(handler2);

        Scene scene = new Scene(pane);
        stage.setTitle("HandleEvent");
        stage.setScene(scene);
        stage.show();
    }
}

class okHandler implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Ok Button Clicked");
    }
}

class cancelHandler implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Cancel Button Clicked!");
    }
}