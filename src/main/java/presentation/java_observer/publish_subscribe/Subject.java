package presentation.java_observer.publish_subscribe;

/**
 * Created by inet on 3/23/2016.
 */
public interface Subject {

    //methods to register and unregister observers
    void register(Observer obj);

    void unregister(Observer obj);

    //method to notify observers of change
    void notifyObservers();

    //method to get updates from subject
    Object getUpdate(Observer obj);
}
