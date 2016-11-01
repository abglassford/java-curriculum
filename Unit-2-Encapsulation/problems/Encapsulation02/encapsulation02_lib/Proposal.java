package encapsulation02_lib;

public class Proposal {
  private String name = "Tacos";
  public String get () {
      return name;
  }
  public void set (String name) {
    this.name = name;
  }
}
