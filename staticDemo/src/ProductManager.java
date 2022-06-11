public class ProductManager {
    public void add(Product product) {
       // ProductValidator validator = new ProductValidator(); // --> Static field is not newable.
        if (ProductValidator.isValid(product)) {
            System.out.println("Added to Database!"); // Sample Code.
        } else {
            System.out.println("Product information is not valid!");
        }
         //ProductValidator productValidator = new ProductValidator(); // -> Commented to make the constructor block is not run.
         //productValidator.something(); // Must be newed to use if non-static.
    }
}
