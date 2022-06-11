public class Main {
    public static void main(String[] args) {

//        ICustomerDal customerDal = new MySqlCustomerDal();
//        customerDal.add();
//        customerDal = new OracleCustomerDal();
//        customerDal.add();

        // Forgettable Pattern

//        CustomerManager customerManager = new CustomerManager();
//        customerManager.customerDal = new MySqlCustomerDal();
//        customerManager.add();
//        customerManager.customerDal = new OracleCustomerDal();
//        customerManager.add();

        // Use Constructor Instead, to make sure nothing is forgotten.

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();

    }
}
