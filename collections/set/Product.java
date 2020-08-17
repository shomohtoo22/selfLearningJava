import java.util.Comparator;
import java.util.Objects;

public class Product {

    public static Comparator<Product> BY_NAME = Comparator.comparing(Product::getName);
    private String name;
    private int id;

    public Product(String name, int id ) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    // needed so that if we add new product of the same name and id, it wont add to the set
    // since set are unique.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
