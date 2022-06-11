public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public void getCustomers() {
        this.databaseManager.getData();
    }
}


    // CONSTRUCTOR USAGE
//    public CustomerManager(BaseDatabaseManager databaseManager) {
//        this.databaseManager = databaseManager;
//        databaseManager.getData();
//    }
//    }
