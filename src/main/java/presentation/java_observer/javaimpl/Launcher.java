package presentation.java_observer.javaimpl;

/**
 * Created by inet on 3/23/2016.
 */
public class Launcher {

    public static void main(String[] args) {
        ObservableValue ov = new ObservableValue(0);
        TextObserver to = new TextObserver(ov);
        ov.addObserver(to);

        ov.setValue(1);
    }
}
