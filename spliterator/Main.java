import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
        Path path = Paths.get("src/com/selflearning/spliteratorpractice/people.txt");

        try (Stream<String> lines = Files.lines(path)) {
            Spliterator<String> lineSpliterator = lines.spliterator();
            Spliterator<Person> personSpliterator = new PeopleSpliterator(lineSpliterator);

            Stream<Person> people = StreamSupport.stream(personSpliterator, false);
            people.forEach(System.out::println);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
