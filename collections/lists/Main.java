public class Main {

    public static void main(String[] args) {
	// write your code here
        Product apple = new Product("Apple", 4);
        Product orange = new Product("Orange", 2);
        Product pear = new Product("Pear", 1);
        Product banana = new Product("Banana", 3);

        Product grape = new Product("Grape", 5);

        Basket basket = new Basket();

        // add all product in basket
        basket.add(apple);
        basket.add(orange);
        basket.add(pear);
        basket.add(banana);

        // delete banana form list
        basket.delete(banana);

        // replace pear with grape
        basket.replace(pear, grape);

        // sort product and separate them by new or old
        basket.prepare();
        
        // should get product id that are greater than 3
        basket.getNewProducts();
    }
}
