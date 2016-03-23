package presentation.java_observer.events;

import java.util.Observable;

import static java.lang.System.out;

/**
 * Created by inet on 3/23/2016.
 */
public class Launcher {

    // java -d ./target/classes presentation.java_observer.event.Launcher
    public static void main(String[] args) {
        out.println("Enter Text >");
        EventSource eventSource = new EventSource();

        eventSource.addObserver((obj, arg) -> out.println("\nReceived response: " + arg));

        new Thread(eventSource).start();
    }
}
