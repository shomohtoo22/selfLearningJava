import java.util.HashSet;
import java.util.Set;

public class Basket {

    private final Set<Product> products = new HashSet<>();


    public Basket(){}

    public void addProduct(Product product) {
        products.add(product);
    }

    public Set<Product> getProducts() {
        return products;
    }
}
