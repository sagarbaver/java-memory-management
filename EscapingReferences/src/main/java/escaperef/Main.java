package escaperef;

public class Main {

  public static void main(String[] args) {
    printCustomerRecords();
    //    printIterableCustomerRecords();
    //    printCopiedCustomerRecords();
    //    printUnmodifiableCustomerRecords();
    //    printCustomerRecordsReadOnly();
  }

  private static void printCustomerRecords() {
    CustomerRecords records = new CustomerRecords();
    records.addCustomer(new Customer("John"));
    records.addCustomer(new Customer("Simon"));
    // records.getCustomers().clear(); // Possible

    for (Customer next : records.getCustomers().values()) {
      System.out.println(next);
    }
  }

  private static void printIterableCustomerRecords() {
    IterableCustomerRecords records = new IterableCustomerRecords();
    records.addCustomer(new Customer("John"));
    records.addCustomer(new Customer("Simon"));
    // records.iterator().remove(); // Possible
    for (Customer next : records) {
      System.out.println(next);
    }
  }

  private static void printCopiedCustomerRecords() {
    CopiedCustomerRecords records = new CopiedCustomerRecords();
    records.addCustomer(new Customer("John"));
    records.addCustomer(new Customer("Simon"));
    records.getCustomers().clear(); // Only clears the copy.

    for (Customer next : records) {
      System.out.println(next);
    }
  }

  private static void printUnmodifiableCustomerRecords() {
    UnmodifiableCustomerRecords records = new UnmodifiableCustomerRecords();
    records.addCustomer(new Customer("John"));
    records.addCustomer(new Customer("Simon"));
    records.getCustomers().clear(); // Throws an exception.

    for (Customer next : records) {
      System.out.println(next);
    }
  }

  private static void printCustomerRecordsReadOnly() {
    CustomerRecordsReadOnly records = new CustomerRecordsReadOnly();
    records.addCustomer(new Customer("John"));
    records.addCustomer(new Customer("Simon"));
    CustomerReadOnly john = records.getCustomerByName("John");
    // john.setName("Derek"); // No setters available.
  }

}
