import java.util.*;
import java.io.*;

public class SetBasics {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("./input.txt"));

    while (scan.hasNextLine()) {
      String currentline = scan.nextLine();
      System.out.println("Original List: "+currentline);
      
      Set<String> s = new HashSet<String>(Arrays.asList(currentline.split(" ")));
      System.out.println("Uniques: "+s);
      
      s.clear();
      Set<String> d = new HashSet<String>();
      for (String i:currentline.split(" ")) {
        if (!s.add(i)) {d.add(i);}
      }
      System.out.println("Dupes: "+d+"\n");
    }
  }
}
