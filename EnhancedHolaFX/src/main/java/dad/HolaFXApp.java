package dad;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HolaFXApp extends Application {
    private TextField nombreText;
    private Button saludarButton;
    private Label saludoLabel;

    @Override
    public void start (Stage stage) throws  Exception {

        nombreText = new TextField();
        nombreText.setPromptText("nombre de la persona a saludar");

        saludarButton = new Button();
        saludarButton.setText("Saludar");
        saludarButton.setDefaultButton(true);
        saludarButton.setOnAction(this::onSaludarAction);

         saludoLabel = new Label();

        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.setSpacing(5);
        root.setFillWidth(false);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(nombreText, saludarButton , saludoLabel);

        Scene scene = new Scene(root , 640 , 480);

        stage.setTitle("HolaFX mejorado");
        stage.setScene(scene);
        stage.show();
    }

    private void onSaludarAction(ActionEvent e) {
        String nombre = nombreText.getText();
        String saludo = "hola" + nombre + "!";
        saludoLabel.setText(saludo);
    }
}
