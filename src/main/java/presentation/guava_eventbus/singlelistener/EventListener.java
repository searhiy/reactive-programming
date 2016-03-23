package presentation.guava_eventbus.singlelistener;

import com.google.common.eventbus.Subscribe;

/**
 * Created by inet on 3/23/2016.
 */
public class EventListener {

    public int lastMessage = 0;

    @Subscribe
    public void listen(OurTestEvent event) {
        lastMessage = event.getMessage();
    }

    public int getLastMessage() {
        return lastMessage;
    }
}
