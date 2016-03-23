package presentation.guava_eventbus.singlelistener;

/**
 * Created by inet on 3/23/2016.
 */
public class OurTestEvent {

    private final int message;

    public OurTestEvent(int message) {
        this.message = message;
    }

    public int getMessage() {
        return message;
    }
}
