package galvanize;

import encapsulation02_lib.Proposal;

public class Encapsulation02 {
  public static void main(String[] args){
    Proposal prop = new Proposal();
    System.out.println("First " + prop.get());
    prop.set("Monkeys");
    System.out.println("Second " + prop.get());
  }
}
