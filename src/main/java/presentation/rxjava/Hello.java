package presentation.rxjava;

import rx.Observable;

/**
 * Created by inet on 3/23/2016.
 */
public class Hello {

    public static void main(String[] args) {
        hello("Ben", "George");
    }

    public static void hello(String... names) {
        Observable.from(names).subscribe(s -> {
            System.out.println("Hello " + s + "!");
        });
    }
}
