package presentation.observer.customimpl.publish_subscribe;

/**
 * Created by inet on 3/23/2016.
 */
public interface Observer {

    //method to update the observer, used by subject
    void update();

    //attach with subject to observe
    void setSubject(Subject sub);
}
