package dad;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class HolaFX extends Application {

    @Override
    public void start (Stage stage) throws Exception {

        Label saludoLabel = new Label();
        saludoLabel.setText("Aqui comunismo lo tuyo es mio lo mio es mio");
        saludoLabel.setLayoutX(20); // coordenada x de la etiqueta
        saludoLabel.setLayoutY(20); // coordenada y de la etiqieta

        Button button = new Button("No me toques");
        button.setLayoutX(40);
        button.setLayoutY(40);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("me tocaron :( ");
            }
        });


        Pane root = new Pane();
        root.setStyle("-fx-background-color: red");
        root.getChildren().add(saludoLabel);
        root.getChildren().addAll(button);


        Scene scene = new Scene(root, 320, 200);

        stage.setScene(scene);
        stage.setTitle("Messi del codigo");
        stage.setResizable(false);
        stage.show();





    }
}
