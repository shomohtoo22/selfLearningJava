import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Basket {

    private final Set<Product> products = new HashSet<>();
    private final Set<Product> treeSetProducts = new TreeSet<>(Product.BY_NAME);


    public Basket(){}

    public void addProduct(Product product) {
        products.add(product);
        treeSetProducts.add(product);
    }

    public Set<Product> getProducts() {
        return products;
    }

    public Set<Product> getTreeSetProductsProducts() {
        return treeSetProducts;
    }
}
