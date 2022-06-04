public class Main {

    public static void main(String[] args) {
	Customer customer = new Customer();
    customer.email = "velihangozek@hotmail.com";
    Employee employee = new Employee();
    employee.salary = 10_000;
    EmployeeManager employeeManager = new EmployeeManager();
    employeeManager.employeeOfTheMonth();
    CustomerManager customerManager = new CustomerManager();
    customerManager.add();
    }
}
