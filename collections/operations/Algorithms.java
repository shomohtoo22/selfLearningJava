import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Algorithms {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("orange");
        fruits.add("Banana");
        fruits.add("Pear");

        // add all at once
        Collections.addAll(fruits, "Tiger", "Lions", "Bird");

        System.out.println("Regular: " + fruits);

        // shuffle the list like a card being shuffle
        Collections.shuffle(fruits);
        System.out.println("Shuffled: " + fruits);

        Collections.rotate(fruits, 3);
        System.out.println("Rotation 3: " + fruits);

        // sort the fruits in reversedOrder
        // if ony giving one argument, it wil sort in assending order
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Sorted: " + fruits);

        // faster and more readable
        fruits.sort(Comparator.reverseOrder());
        System.out.println("Java 8: " + fruits);
    }
}
