package valuesandreferences;

public class PassPrimitivesByValue {

  public static void main(String[] args) {
    int localValue = 5;
    calculate(localValue);
    System.out.println(localValue);
  }

  private static void calculate(int calcValue) {
    calcValue = calcValue * 100;
  }

}
