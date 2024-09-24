package dad.ui;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloBindings extends Application {
    private TextField nameText;
    private Label greetingLabel;
    private CheckBox hasNameCheck; // Cambié Checkbox de AWT a CheckBox de JavaFX

    @Override
    public void start(Stage stage) throws Exception {
        nameText = new TextField();
        nameText.setPromptText("Introduce el nombre");

        greetingLabel = new Label();

        hasNameCheck = new CheckBox("¿HAY NOMBRE?"); // Ahora usando JavaFX CheckBox

        VBox root = new VBox(5);
        root.setFillWidth(false);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(nameText, greetingLabel, hasNameCheck);

        Scene scene = new Scene(root, 640, 480);

        stage.setTitle("Hello Bindings");
        stage.setScene(scene);
        stage.show();

        //bindeos
        greetingLabel.textProperty().bind(
                Bindings.concat(
                        "!holaaa",
                        Bindings.when(nameText.textProperty().isEmpty())
                                .then("a todo el mundo")
                                .otherwise(nameText.textProperty())
                        ,
                        "!!!"
                )
        );
        hasNameCheck.selectedProperty().bind(nameText.textProperty().isNotEmpty());
    }


}

