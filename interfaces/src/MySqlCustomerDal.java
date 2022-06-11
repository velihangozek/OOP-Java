public class MySqlCustomerDal extends ExampleClass implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("MySQL Added!");
    }
}
