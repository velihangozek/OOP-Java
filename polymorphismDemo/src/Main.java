public class Main {

    public static void main(String[] args) {
//        EmailLogger emailLogger = new EmailLogger();
//        DatabaseLogger databaseLogger = new DatabaseLogger();
//        FileLogger fileLogger = new FileLogger();
//        BaseLogger baseLogger = new BaseLogger();
//        emailLogger.Log("Logged");
//        databaseLogger.Log("Logged2");
//        fileLogger.Log("Logged3");
//        baseLogger.Log("Logged4");

        // PROFESSIONAL ALTERNATIVE USAGE

        BaseLogger[] loggers = {
                new DatabaseLogger(),
                new FileLogger(),
                new EmailLogger(),
                new ConsoleLogger()
        };
        for (BaseLogger logger : loggers) {
            logger.log("Logged!");
        }

        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();
    }
}
