package dad.OBSERVER;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    // Método para suscribir un observador
    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    // Método para notificar a los observadores
    public void notifyObservers(T value) {
        for (Observer<T> observer : observers) {
            observer.notify(value);
        }
    }

    // Interfaz para definir la acción de notificación
    public static interface Observer<T> {
        void notify(T value);
    }
}

