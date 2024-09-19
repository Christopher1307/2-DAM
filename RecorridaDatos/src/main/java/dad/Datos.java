package dad;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Datos extends Application {

    private Button GuardarButton;
    private Button LimpiarButton;
    private Label nombreLabel;
    private Label apellidoLabel;
    private Label edadLabel;
    private TextField nombreText;
    private TextField apellidoText;
    private TextField edadText;





    public void start(Stage stage) throws Exception {

        // el texto del nombre asi como el cuadro , los colores y el relleno del cuadro
        nombreLabel = new Label();
        nombreText = new TextField();
        nombreText.setPromptText("colocar el nombre");
        nombreLabel.setText("Nombre:");
        nombreText.setStyle("-fx-border-color: #FF0000; -fx-border-width: 2px;");


        apellidoLabel = new Label();
        apellidoText = new TextField();
        apellidoText.setPromptText("colocar el apellido");
        apellidoLabel.setText("Apellido:");
        apellidoText.setStyle("-fx-border-color: #FF0000; -fx-border-width: 2px;");

        edadLabel = new Label();
        edadText = new TextField();
        edadText.setPromptText("colocar el edad");
        edadLabel.setText("Edad:");
        edadText.setStyle("-fx-text-fill: #FF0000;");
        edadText.setStyle("-fx-border-color: #FF0000; -fx-border-width: 2px;");


        GuardarButton = new Button("Guardar");
        GuardarButton.setDefaultButton(true);
        GuardarButton.setOnAction(actionEvent -> {GuardarTexto();});
        LimpiarButton = new Button("Limpiar");
        LimpiarButton.setOnAction(actionEvent -> {limpiarButton();});

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-background-color: #0bfcf9;");


        gridPane.add(nombreLabel, 0, 0); // (columna, fila)
        gridPane.add(nombreText, 1, 0);

        gridPane.add(apellidoLabel, 0, 1);
        gridPane.add(apellidoText, 1, 1);

        gridPane.add(edadLabel, 0, 2);
        gridPane.add(edadText, 1, 2);

        gridPane.add(GuardarButton, 0, 3);
        gridPane.add(LimpiarButton, 1, 3);




        Scene scene = new Scene(gridPane, 400 , 300);

        stage.setTitle("Recorrida de datos");
        stage.setScene(scene);
        stage.show();


    }

    private void GuardarTexto() {
        Persona p = new Persona();
        p.setNombre(nombreText.getText());
        p.setApellidos(apellidoText.getText());
        p.setEdad(Integer.parseInt(edadText.getText()));
    }

    private void limpiarButton() {
        nombreText.clear();
        apellidoText.clear();
        edadText.clear();
    }

}
