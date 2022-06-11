public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 1000;
        product.name = "PC";
        productManager.add(product);
// Inner Class Usage
//        DatabaseHelper.Crud.delete();
//        DatabaseHelper.Connection.createConnection();

    }
}