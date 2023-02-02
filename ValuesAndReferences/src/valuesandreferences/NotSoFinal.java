package valuesandreferences;

public class NotSoFinal {

  public static void main(String[] args) {
    final Customer c = new Customer("John");
    System.out.println(c.getNameWithSideEffects());
    System.out.println(c.getNameWithSideEffects());
  }

}
