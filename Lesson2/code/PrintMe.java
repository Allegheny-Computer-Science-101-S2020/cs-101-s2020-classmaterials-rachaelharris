public class PrintMe {
  public static void main (String[] args) {
    int i = 0;
    /*
    while (i < 10) {
        //System.out.println(i);
        if (i % 2 == 0)
          System.out.println(i + " is even");
        else
          System.out.println(i + " is odd");
      i++;
      */
      while (true) {
        if (i % 2 == 0)
          System.out.println(i + " is even");
        else
          System.out.println(i + " is odd");
        i++;
        if (i < 10)
          break;
      }
    }
  }
}
