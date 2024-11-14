import java.util.*;
import java.io.*;
import java.lang.Integer;

public class SetBasics {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("./input.txt"));

    while (scan.hasNextLine()) {
      // create set of current line
      Set<Integer> currentline = new HashSet<Integer>();
      for (String i:scan.nextLine().split(" ")) {
        currentline.add(Integer.valueOf(i));
      }

      Set<Integer> o = new TreeSet<Integer>();
      Set<Integer> e = new TreeSet<Integer>();
      Set<Integer> p = new TreeSet<Integer>();
      for (Integer i: currentline) {
        // find perfect numbers
        int sum=0;
        for (int j=1; j<i; j++) { if (i%j==0) {sum+=j;} }
        if (i>1 && sum==i) { p.add(i); }

        if (i%2==1) {
          o.add(i);
        } else {
          e.add(i);
        }
      }
      System.out.println("ODDS: "+o);
      System.out.println("EVENS: "+e);
      System.out.println("PERECTS: "+p);
      System.out.println();
    }
  }
}
