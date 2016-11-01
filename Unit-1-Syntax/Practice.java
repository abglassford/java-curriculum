import java.util.*;

public class Practice {
  public static void main (String[] args) {
    ArrayList<String> artists = new ArrayList<String>();
    artists.add("John");
    artists.add("Alex");
    artists.add("Sam");

    System.out.println("Names are currently: " + artists);

    HashMap<Integer, String> apartments = new HashMap<Integer, String>();
    apartments.put(102, "Stark");
    apartments.put(201, "Mormont");
    apartments.put(109, "Lannister");

    System.out.println("Apartments: " + apartments);
  }
}
