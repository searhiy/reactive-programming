package presentation.guava_eventbus.multilistener;

import com.google.common.eventbus.Subscribe;

/**
 * Created by inet on 3/23/2016.
 */
public class MultipleListener {

    public Integer lastInteger;
    public Long lastLong;

    @Subscribe
    public void listenInteger(Integer event) {
        lastInteger = event;
    }

    @Subscribe
    public void listenLong(Long event) {
        lastLong = event;
    }

    public Integer getLastInteger() {
        return lastInteger;
    }

    public Long getLastLong() {
        return lastLong;
    }
}
