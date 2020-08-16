import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket implements Iterable<Product> {

    private final List<Product> products = new ArrayList<>();
    private List<Product> newProducts;
    private List<Product> oldProducts;
    private final int NEW_ITEM_ID_STARTER = 3;
    private final int NOT_IN_BASKET = -1;



    public void add(Product product) {
        // add new product to the end of list.
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {
        // get index of product that need to be replace
        final int index = products.indexOf(oldProduct);
        // set method take the index of the list and add the new product
        // at that location.
        if (!(index == NOT_IN_BASKET)) {
            products.set(index, newProduct);
        }

    }
    public void delete(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void prepare() {
        // sor the list
        products.sort(Product.BY_ID);

        // find old products by id
        int splitPoint = findSplitPoint();

        // set product to new or old list
        oldProducts = products.subList(0, splitPoint);
        newProducts = products.subList(splitPoint, products.size());

    }

    private int findSplitPoint() {
        for (Product product: products) {
            if (product.getId() > NEW_ITEM_ID_STARTER) {
                return products.indexOf(product);
            }
        }
        return 0;

    }


    public List<Product> getNewProducts() {
        return newProducts;
    }

    public List<Product> getOldProducts() {
        return oldProducts;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
