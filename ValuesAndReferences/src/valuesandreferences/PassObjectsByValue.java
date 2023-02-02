package valuesandreferences;

public class PassObjectsByValue {

  public static void main(String[] args) {
    Customer c = new Customer("Sally");
    renameCustomer(c);
    System.out.println(c.getName());
  }

  private static void renameCustomer(Customer customer) {
    customer.setName("Diane");
  }

}
