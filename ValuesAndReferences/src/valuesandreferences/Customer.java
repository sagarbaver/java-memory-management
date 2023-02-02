package valuesandreferences;

public class Customer {

  private String name;

  public Customer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getNameWithSideEffects() {
    String temp = this.name;
    this.name = "Emma";
    return temp;
  }
  public void setName(String name) {
    this.name = name;
  }

}
