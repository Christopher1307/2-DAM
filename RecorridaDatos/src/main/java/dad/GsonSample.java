package dad;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;

public class GsonSample {

    public static void main (String[] args) throws IOException {

        Persona p = new Persona();
        p.setNombre("Elon");
        p.setApellidos("Musk");
        p.setEdad(53);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(p);

        File jsonFile = new File("datos.json");
        Files.writeString(jsonFile.toPath(),json);

         System.out.println(json);


    }
}
