package presentation.rxjava_jdbc;

import com.github.davidmoten.rx.jdbc.Database;

import java.util.List;

/**
 * Created by inet on 3/23/2016.
 */
public class Launcher {

    public static void main(String[] args) {

        // don't launch that! just code shippet
        String url = "";
        Database db = Database.from(url);
        List<String> names = db
                .select("select name from person where name > ? order by name")
                .parameter("ALEX")
                .getAs(String.class)
                .toList().toBlocking().single();
        System.out.println(names);
    }

}
