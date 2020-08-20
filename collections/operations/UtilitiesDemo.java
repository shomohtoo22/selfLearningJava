import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UtilitiesDemo {

    public static Product door = new Product(1, "Wooden Door", 35);
    public static Product floorPanel = new Product(2, "Floor Panel", 25);
    public static Product window = new Product(3, "Glass Window", 10);


    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        Collections.addAll(products, door, floorPanel, window);

        final Product productMin = Collections.min(products, Product.BY_NAME);
        final Product productMax = Collections.min(products, Product.BY_WEIGHT);

        System.out.println(productMin);
        System.out.println(productMax);

    }
}
