import java.util.Comparator;

public class Product {

    public  static final Comparator<Product> BY_ID = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return Integer.compare(o1.getId(), o2.getId());
        }
    };
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
}
