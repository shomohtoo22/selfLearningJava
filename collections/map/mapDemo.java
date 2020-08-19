import java.util.*;

public class MapDemo {


    public static void main(String[] args) {
        MapDemo map = new MapDemo();

        Map<Integer, String> intToString = new HashMap<>();

        // add a key and a value to the map
        intToString.put(1, "Grape");
        intToString.put(4, "Lime");
        intToString.put(5, "Kiwi");

        // if key is not in the map, it will get added
        intToString.putIfAbsent(2, "Apple");

        // get only the keys of the map and return a view
        Set<Integer> keySet = intToString.keySet();

        // get they key that is in the map and returns its value, if key not present,
        // return passed value.
        intToString.getOrDefault(3, "Orange");

        // get a view of the value in the map
        Collection<String> val = intToString.values();

        // will remove the key value pair in the map because its a view
        val.remove("Apple");

        // add to map if the key is not there
        intToString.computeIfAbsent(10, value -> "someFruit");

        // replace the value + value in this case of all key value pair in the map
        intToString.replaceAll((k,v) -> v+v);

        // entrySet is used commonly for looping over
        Set<Map.Entry<Integer, String>> fruits = intToString.entrySet();
        for(Map.Entry<Integer, String> fruit : fruits) {
            System.out.printf("Key:%d -> Value:%s\n",fruit.getKey(), fruit.getValue());
        }

        System.out.println(intToString);


    }
}
