import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactoriesDemo
{

        public static Product door = new Product(1, "Wooden Door", 35);
        public static Product floorPanel = new Product(2, "Floor Panel", 25);
        public static Product window = new Product(3, "Glass Window", 10);


    private final List<Product> items = new ArrayList<>();
    private int totalWeight = 0;

    public void add(Product product)
    {
        items.add(product);
        totalWeight += product.getWeight();
    }

    public List<Product> getItems()
    {
        // Collections.unmodifiableList makes the list immutable
        return Collections.unmodifiableList(items);
    }

    public String toString()
    {
        return "Shopping Basket of \n" + items + "\nwith weight: " + totalWeight;
    }

    public static void main(String[] args)
    {
        FactoriesDemo basket = new FactoriesDemo();
        basket.add(door);
        System.out.println(basket);

        basket.add(floorPanel);
        System.out.println(basket);

        // will throw exception since we get a view when we call the getItem method
        // and the view is now immutable
        basket.getItems().add(window);
        System.out.println(basket);


    }
}
