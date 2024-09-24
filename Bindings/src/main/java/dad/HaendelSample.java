package dad;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;


public class HaendelSample {
    public static void  main(String[] args){
        IntegerProperty a = new SimpleIntegerProperty(5 , "a");
        IntegerProperty b = new SimpleIntegerProperty(7, "B");

        ChangeListener<Number> listener = (o, ov, nv) -> {
            if (o == a) {
                System.out.println("Soy 'a' y ahora valgo " + nv);
            } else if (o == b) {
                System.out.println("Soy 'b' y ahora valgo " + nv);
            }
        };

        a.addListener(listener);
        b.addListener(listener);
    }
}
