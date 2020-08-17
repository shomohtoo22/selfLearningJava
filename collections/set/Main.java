import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Product apple = new Product("Apple", 4);
        Product orange = new Product("Orange", 2);
        Product pear = new Product("Pear", 1);
        Product banana = new Product("Banana", 3);
        Product grape = new Product("Grape", 5);

        Basket basket = new Basket();

        basket.addProduct(banana);
        basket.addProduct(grape);
        basket.addProduct(apple);
        basket.addProduct(orange);
        basket.addProduct(pear);

        // this will add grape if hashcode and equals are not override in product class
        basket.addProduct(new Product("Grape", 5));

        // product should not be duplicate and ordered.
        Set<Product> products = basket.getProducts();

        // product should not be duplicated and should be ordered by name
        Set<Product> treeSetProducts = basket.getTreeSetProductsProducts();

        for(Product product : products) {
            System.out.println(product);
        }
        System.out.println("--------------------");
        for(Product product : treeSetProducts) {
            System.out.println(product);
        }

    }
}
