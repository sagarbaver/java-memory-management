package internalizedstrings;

public class StringPools {

  public static void main(String[] args) {
    String one = "hello"; // A string object is created in the heap.
    // Since String pools are re-used, the JVM doesn't create a new immutable object. It merely creates a
    // variable in the Stack that references the same object.
    String two = "hello";

    if (one == two) {
      System.out.println("Equal"); // The == operator compares references
    }

    // OTOH, one.equals(two) compares values.

    String three = new Integer(76).toString(); // Computed string
    // 76 won't necessarily be available in the pool since the former was computed.
    String four = "76";

    if (three == four) {
      System.out.println("Won't be printed");
    }

    // The intern method forces the string to be internalized and stored to the pool. It, therefore, can be reused.
    String five = new Integer("76").toString().intern();
  }
}
