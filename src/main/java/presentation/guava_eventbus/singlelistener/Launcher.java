package presentation.guava_eventbus.singlelistener;

import com.google.common.eventbus.EventBus;

/**
 * Created by Serhii K. on 3/1/2016.
 */
public class Launcher {

    public static void main(String[] args) {
        // given
        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener();

        eventBus.register(listener);

        // when
        eventBus.post(new OurTestEvent(200));

        // then
        System.out.println(listener.getLastMessage());
    }
}
