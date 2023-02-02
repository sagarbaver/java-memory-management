package gc;

public class Main {

  public static void main(String[] args) {
    int N = 1000000;
    Runtime runtime = Runtime.getRuntime();

    long availableBytes = runtime.freeMemory();
    System.out.println("Available memory: " + availableBytes / 1024 + "k");

    // let's create a ton of garbage....
    Customer c;
    for (int i = 0; i < N; i++) {
      c = new Customer("John");
    }

    availableBytes = runtime.freeMemory();
    System.out.println("Available memory: " + availableBytes / 1024 + "k");

    // Suggests JVM to run GC. There is no guarantee that it will run.
    System.gc();

    availableBytes = runtime.freeMemory();
    System.out.println("Available memory: " + availableBytes / 1024 + "k");
  }


}
