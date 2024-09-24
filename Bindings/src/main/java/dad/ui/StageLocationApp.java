package dad.ui;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StageLocationApp extends Application {

    private Label coordsLabel;
    private Label sizeLabel;

    @Override
    public void start(Stage stage) throws Exception {
        // Crear los bindings para las propiedades de ancho y alto
        StringBinding width = stage.widthProperty().asString();
        StringBinding height = stage.heightProperty().asString();

        // Crear los bindings para las coordenadas
        StringBinding x = stage.xProperty().asString();
        StringBinding y = stage.yProperty().asString();

        // Crear etiquetas
        coordsLabel = new Label();
        coordsLabel.textProperty().bind(
                Bindings.concat("Posición: (", x, ", ", y, ")")
        );

        sizeLabel = new Label();
        sizeLabel.textProperty().bind(
                Bindings.concat("Tamaño: ", width, " x ", height)
        );

        // Configurar el diseño
        VBox root = new VBox();
        root.setSpacing(5);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(coordsLabel, sizeLabel);

        // Crear la escena
        Scene scene = new Scene(root, 640, 480);

        // Configurar y mostrar el escenario
        stage.setScene(scene);
        stage.setTitle("Size and Location");
        stage.show();
    }


}

