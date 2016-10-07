package presentation.rxjava2;

import rx.Observable;
import rx.Subscriber;

import java.util.Collections;

/**
 * Created by inet on 3/25/2016.
 */

public class Creating {

   public static void main(String[] args) {
        Observable<String> o1 = Observable.just("DE", "USA", "USA", "UKR");
        Observable<String> o2 = Observable.just("a", "b", "c");

        Observable<String> o3 = Observable.from(Collections.EMPTY_LIST);

        o1
                .skip(1)
                .take(3)
                .filter(b -> "USA".equals(b))
                .map(b-> "country " + b)
                .subscribe(
                        beer -> System.out.println(beer),
                        err -> System.out.println(err),
                        () -> System.out.println("Streaming is completed")
                );

        // the same
        o1
                .skip(1)
                .take(3)
                .filter(b -> "USA".equals(b))
                .map(b-> "country " + b)
                .subscribe(new Subscriber<String>() {
                               @Override
                               public void onCompleted() {
                                   System.out.println("Streaming is completed");
                               }

                               @Override
                               public void onError(Throwable e) {
                                   System.out.println(e);
                               }

                               @Override
                               public void onNext(String s) {
                                   System.out.println(s);
                               }
                           });

        hello("Ben", "George");
    }

    public static void hello(String... names) {
        Observable.from(names).subscribe(s -> System.out.println("Hello " + s + "!"));
    }
}
