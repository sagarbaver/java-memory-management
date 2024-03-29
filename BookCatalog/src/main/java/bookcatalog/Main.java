package bookcatalog;


public class Main {

  public static void main(String[] args) {
    BookCollection bc = new BookCollection();
    bc.printAllBooks();
    System.out.println("====================");
    // get price of book called Tom Jones in EUR
    System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));
    bc.printAllBooks(); // Notice that the price of Tom Jones has changed.
  }
}
