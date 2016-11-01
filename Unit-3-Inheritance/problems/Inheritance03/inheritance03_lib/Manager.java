package inheritance03_lib;

public class Manager extends Employee {
  private String status = "employed";
  
  public String getStatus() {
    return "This manager is " + this.status;
  }
}
