public class Main {

    public static void main(String[] args) {
        Product product = new Product(2, "Gaming Laptop", "Lenovo", 10000, 2, "Red" );
//        product.setName("Laptop");
//        product.setId(1);//product.id = 1;
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(3);
//        product.setRenk("");
//        product.getKod();
        System.out.println(product.getName());
        System.out.println(product.getKod());


        ProductManager productManager = new ProductManager();
        productManager.add(product);


    }
}
