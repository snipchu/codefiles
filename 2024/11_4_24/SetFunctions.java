import java.util.*;
import java.io.*;
import java.lang.Integer;

public class SetBasics {
  public static void addall(Set<Integer> set, Set<Integer> s1, Set<Integer> s2) {
    set.clear();
    set.addAll(s1);
    set.addAll(s2);
  }

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("./input.txt"));

    while (scan.hasNextLine()) {
      Set<Integer> s = new TreeSet<Integer>();
      Set<Integer> s1 = new TreeSet<Integer>();
      Set<Integer> s2 = new TreeSet<Integer>();
      Set<Integer> total = new TreeSet<Integer>();
      for (String i:scan.nextLine().split(" ")) { s1.add(Integer.valueOf(i)); }
      for (String i:scan.nextLine().split(" ")) { s2.add(Integer.valueOf(i)); }

      System.out.println("Set one: "+s1);
      System.out.println("Set two: "+s2+"\n");
      
      addall(s, s1, s2);
      System.out.println("union: "+s);

      s.retainAll(s1);
      s.retainAll(s2);
      System.out.println("intersection: "+s);

      addall(s, s1, s2);
      s.removeAll(s2);
      total.addAll(s);
      System.out.println("different A-B: "+s);

      addall(s, s1, s2);
      s.removeAll(s1);
      total.addAll(s);
      System.out.println("different B-A: "+s);

      System.out.println("symmetric difference: "+total+"\n\n");
    }
  }
}
