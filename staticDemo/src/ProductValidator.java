public class ProductValidator {

    static {
        System.out.println("1st Constructor block has run! (Static)");
    }

    static {
        System.out.println("2nd Constructor block has run! (Static)");
    }

    static {
        System.out.println("3rd Constructor block has run! (Static)");
    }

    public ProductValidator() {
        System.out.println("Constructor block has run! (Non-Static)");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void something() {

    }

//    public static class AnotherClass { // Inner Class.
//        public static void delete() {
//
//        }
//    }

}
