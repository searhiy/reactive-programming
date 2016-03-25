package presentation.observer.javaimpl.values;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by inet on 3/23/2016.
 */
public class TextObserver implements Observer {

    private ObservableValue ov = null;

    public TextObserver(ObservableValue ov) {
        this.ov = ov;
    }

    public void update(Observable obs, Object obj) {
        if (obs == ov) {
            System.out.println(ov.getValue());
        }
    }
}
