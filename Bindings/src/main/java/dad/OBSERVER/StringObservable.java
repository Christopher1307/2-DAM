package dad.OBSERVER;

public class StringObservable extends Observable<String> {
    private String value;

    // Método getter
    public String getValue() {
        return value;
    }

    // Método setter con notificación a los observadores
    public void setValue(String value) {
        this.value = value;
        notifyObservers(value); // Notificar a todos los observadores
    }
}
