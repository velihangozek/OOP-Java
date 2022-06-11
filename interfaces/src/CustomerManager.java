public class CustomerManager{
    private final ICustomerDal _customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this._customerDal = customerDal;
    }
    public void add() {
        // Work codes.
        // OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); // Dependency. So try to avoid it. It means it can only work on Oracle, we don't want that.
        this._customerDal.add();
    }

}
