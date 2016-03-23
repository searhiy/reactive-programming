package presentation.guava_eventbus.dead_event;

import com.google.common.eventbus.EventBus;
import presentation.guava_eventbus.singlelistener.OurTestEvent;

/**
 * Created by inet on 3/23/2016.
 */
public class Launcher {

    public static void main(String[] args) {
        // given
        EventBus eventBus = new EventBus("test");

        DeadEventListener deadEventListener = new DeadEventListener();
        eventBus.register(deadEventListener);

        // when
        eventBus.post(new OurTestEvent(200));

        System.out.println(deadEventListener.isNotDelivered());
    }
}
