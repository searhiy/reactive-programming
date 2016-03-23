package presentation.guava_eventbus.multilistener;

import com.google.common.eventbus.EventBus;

/**
 * Created by inet on 3/23/2016.
 */
public class Launcher {

    public static void main(String[] args) {
        // given
        EventBus eventBus = new EventBus("test");
        MultipleListener multiListener = new MultipleListener();

        eventBus.register(multiListener);

        // when
        eventBus.post(new Integer(100));
        eventBus.post(new Long(800));

        // then
        System.out.println(multiListener.getLastInteger()); // 100
        System.out.println(multiListener.getLastLong());    // 800
    }
}
