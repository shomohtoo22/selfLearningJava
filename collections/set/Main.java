import java.util.Set;
import java.util.SortedSet;

public class Main {

    public static void main(String[] args) {
        Product apple = new Product("Apple", 4);
        Product orange = new Product("Orange", 2);
        Product pear = new Product("Pear", 1);
        Product banana = new Product("Banana", 3);
        Product grape = new Product("Grape", 5);


        Basket basket = new Basket();

        // add products in sets
        basket.addProduct(banana);
        basket.addProduct(grape);
        basket.addProduct(apple);
        basket.addProduct(orange);
        basket.addProduct(pear);

        // this will add grape if hashcode and equals are not override in product class
        basket.addProduct(new Product("Grape", 5));

        // product should not be duplicate and ordered.
        Set<Product> setProducts = basket.getSetProducts();

        // product should be sorted by id
        SortedSet<Product> sortedSetProduct = basket.getSortedSetProductsProducts();

        // product should not be duplicated and should be ordered by name
        Set<Product> treeSetProducts = basket.getTreeSetProductsProducts();

        System.out.println("Regular set");
        for(Product product : setProducts) {
            System.out.println(product);
        }

        System.out.println("\nSortedSet");
        for(Product product : sortedSetProduct) {
            System.out.println(product);
        }
        // working with tailSet. Should return everything including passed argument
        SortedSet<Product> tailSet = sortedSetProduct.tailSet(apple);
        System.out.println(tailSet);
        // working with headSet. Should return everything up to passed argument(Exclusive)
        SortedSet<Product> headSet = sortedSetProduct.headSet(apple);
        System.out.println(headSet);

        System.out.println("\nTreeSet");
        for(Product product : treeSetProducts) {
            System.out.println(product);
        }



    }
}
