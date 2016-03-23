package presentation.java_observer.javaimpl;

import java.util.Observable;

/**
 * Created by inet on 3/23/2016.
 */
public class ObservableValue extends Observable {

    private int n = 0;

    public ObservableValue(int n) {
        this.n = n;
    }

    public void setValue(int n) {
        this.n = n;
        setChanged();
        notifyObservers();
    }

    public int getValue() {
        return n;
    }
}
