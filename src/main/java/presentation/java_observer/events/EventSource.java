package presentation.java_observer.events;

import java.util.Observable;
import java.util.Scanner;

/**
 * Created by inet on 3/23/2016.
 */
public class EventSource extends Observable implements Runnable{

    public void run() {
        while (true) {
            String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }
}
