package presentation.guava_eventbus.dead_event;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

/**
 * Created by inet on 3/23/2016.
 */
public class DeadEventListener {

    boolean notDelivered = false;

    @Subscribe
    public void listen(DeadEvent event) {
        notDelivered = true;
    }

    public boolean isNotDelivered() {
        return notDelivered;
    }
}
