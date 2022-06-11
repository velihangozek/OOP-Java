public class Main {
    public static void main(String[] args) {
//        CustomerManager customerManager = new CustomerManager(new OracleDatabaseManager());
//        customerManager.getCustomers();
//        customerManager = new CustomerManager(new SqlServerDatabaseManager());
//        customerManager.getCustomers();

        // ALTERNATIVE USAGE WITHOUT CONSTRUCTOR

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();
        customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomers();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}