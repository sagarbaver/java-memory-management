package escaperef;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords {

  private Map<String, Customer> records;

  public CustomerRecords() {
    this.records = new HashMap<String, Customer>();
  }

  public void addCustomer(Customer c) {
    this.records.put(c.getName(), c);
  }

  public Map<String, Customer> getCustomers() {
    return this.records; // Escaping reference since caller can mutate the Map. E.g., clear its values.
  }

}
