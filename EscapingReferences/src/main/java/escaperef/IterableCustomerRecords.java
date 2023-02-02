package escaperef;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterableCustomerRecords implements Iterable<Customer> {

  private Map<String, Customer> records;

  public IterableCustomerRecords() {
    this.records = new HashMap<String, Customer>();
  }

  public void addCustomer(Customer c) {
    this.records.put(c.getName(), c);
  }

  // Individual records can still be mutated. E.g., remove()
  @Override public Iterator<Customer> iterator() {
    return records.values().iterator();
  }
}
