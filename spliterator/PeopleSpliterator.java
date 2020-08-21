import java.util.Spliterator;
import java.util.function.Consumer;

public class PeopleSpliterator implements Spliterator<Person> {

    Spliterator<String> linesSpliterator;
    private String name;
    private int age;
    private String city;

    public PeopleSpliterator(Spliterator<String> lineSpliterator) {
        this.linesSpliterator = lineSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Person> action) {
        if (this.linesSpliterator.tryAdvance(line -> this.name = line) &&
            this.linesSpliterator.tryAdvance(line -> this.age = Integer.parseInt(line)) &&
            this.linesSpliterator.tryAdvance(line -> this.city = line)) {

            Person person = new Person(name, age, city);
            action.accept(person);
            return true;
        } else {
            return  false;
        }
    }

    @Override
    public Spliterator<Person> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return linesSpliterator.estimateSize() / 3;
    }

    @Override
    public int characteristics() {
        return linesSpliterator.characteristics();
    }
}
