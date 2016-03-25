package presentation.rxgroovy

// doesn't include automatically
import rx.Observable;

/**
 * Created by inet on 3/25/2016.
 */
class Hello {

    public static void main(String[] args) {
        new Hello().hello("Ben", "George")
    }

    def hello(String[] names) {
        Observable.from(names).subscribe { println "Hello ${it}!" }
    }
}
