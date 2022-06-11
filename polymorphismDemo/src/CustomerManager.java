public class CustomerManager {
    // PROFESSIONAL ALTERNATIVE
    private final BaseLogger logger;

    public CustomerManager(BaseLogger logger) { // Constructor,
        this.logger = logger;
    }

    public void add() {
        System.out.println("Customer Added!");
//       DatabaseLogger databaseLogger = new DatabaseLogger();
//       databaseLogger.Log("Logged!");
        this.logger.log("Logged!");
    }
}
