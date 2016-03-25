package presentation.rxjava;

import rx.Observable;

import java.util.Collections;

/**
 * Created by inet on 3/25/2016.
 */
public class Creating {

    public static void main(String[] args) {
        Observable<String> o1 = Observable.just("one object");
        Observable<String> o2 = Observable.just("a", "b", "c");

        Observable<String> o3 = Observable.from(Collections.EMPTY_LIST);
    }
}
