public class Customer {

    public static Customer ANNA = new Customer("Anna");
    public static Customer JACK = new Customer("Jack");
    public static Customer TOM = new Customer("Tom");
    public static Customer EDDY = new Customer("Eddy");

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public void reply(String message) {
        System.out.printf("Hey %s: %s\n", name, message);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
