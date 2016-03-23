package presentation.akka_reactive_streams;

import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;
import akka.stream.javadsl.Source;

/**
 * Created by Serhii K. on 3/1/2016.
 */
public class TestStream {
    final Source<Integer, NotUsed> source = Source.range(1, 100);

    final ActorSystem system = ActorSystem.create("QuickStart");
    final Materializer materializer = ActorMaterializer.create(system);

    public static void main(String[] args) {
        new TestStream().foo();
    }

    private void foo() {
        source.runForeach(i -> System.out.println(i), materializer);
    }
}
