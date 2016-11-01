package encapsulation03_lib;
import java.util.stream.*;

public class Account {
  private int index = 0;
  private int[] transactions = new int[10];
  private int balance = 0;
  public int balance () {
    return IntStream.of(this.transactions).sum();
  }
  public void deposit (int amount) {
    this.transactions[index] = amount;
    this.index++;
  }
  public int withdraw (int amount) {
    this.transactions[index] = amount;
    this.index++;
    return amount;
  }
}
