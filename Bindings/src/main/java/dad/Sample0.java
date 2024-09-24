package dad;

import dad.OBSERVER.StringObservable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;


public class Sample0 {

    public static void  main (String[] args) {


        DoubleProperty a = new SimpleDoubleProperty(3.14);

        DoubleProperty b = new SimpleDoubleProperty();
        a.addListener((observable, oldValue, newValue) -> {
            System.out.println("ANTES: " + oldValue + " y ahora: " + newValue);
        });
        b.bind(a.multiply(10));

        b.unbind();
        b.set(123);
        a.set(5);


        }
    }

