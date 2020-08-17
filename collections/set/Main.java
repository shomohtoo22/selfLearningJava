import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Product apple = new Product("Apple", 4);
        Product orange = new Product("Orange", 2);
        Product pear = new Product("Pear", 1);
        Product banana = new Product("Banana", 3);
        Product grape = new Product("Grape", 5);

        Basket basket = new Basket();

        basket.addProduct(apple);
        basket.addProduct(orange);
        basket.addProduct(pear);
        basket.addProduct(banana);
        basket.addProduct(grape);

        // this will add grape if hashcode and equals are not override in product class
        basket.addProduct(new Product("Grape", 5));

        Set<Product> products = basket.getProducts();

        for(Product product : products) {
            System.out.println(product);
        }

    }
}
