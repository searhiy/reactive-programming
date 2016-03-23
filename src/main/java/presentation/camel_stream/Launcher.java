package presentation.camel_stream;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by inet on 3/23/2016.
 */
public class Launcher {

    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:origin").multicast().to("mock:foo", "mock:bar", "stream:out");
            }
        });
        ProducerTemplate template = context.createProducerTemplate();
        context.start();
        context.getRoutes().stream().forEach(r -> System.out.println(r));
        template.sendBody("direct:origin", "Hello from origin");
        context.stop();
    }
}
