public class Ops {
  public static int sum(int x, int y) {
    String hi = "Hello";
    return x + y;
  }
  public static int multiply(int x, int y) {
    return x * y;
  }
  public static int power (int x) {
    int y = 2;
    int p = x;
    for(int i = 0; i < y; i++) {
      p = p * x;
    }
    return p;
  }

  public static void main(String [] args) {
    System.out.println( sum(1, 2) );
    System.out.println( multiply(1, 2) );
    System.out.println( power(3) );
  }
}
