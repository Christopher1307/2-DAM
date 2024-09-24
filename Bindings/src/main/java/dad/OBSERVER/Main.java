package dad.OBSERVER;

public class Main {

    public static void main(String[] args) {
        StringObservable str = new StringObservable();

        // Suscribirse antes de hacer cambios
        str.subscribe(value -> System.out.println("El valor de str ha cambiado a " + value));

        // Realizar cambios en el observable
        str.setValue("hola");
        str.setValue("adios");
        str.setValue("bon giorno!");
        str.setValue("Muito obrigado");
    }

    // Método fuera de main
    public static void queEstaPasando(String value) {
        System.out.println("El valor de str ha cambiado a " + value);
    }
}
