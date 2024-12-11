import java.util.*;
import java.lang.*;

public class prisonersim {
  public static int getrandomroll(ArrayList<Integer> list, int prisoner, int boxopens, int prisoners, ArrayList<Integer> boxes) {
    for (int i=0; i<boxopens; i++) {
      list.add((int) (Math.random()*prisoners+1));
      if (list.get(i)==prisoner) {return 1;}
    }
    return 0;
  }
  public static int getsmartroll(ArrayList<Integer> list, int prisoner, int boxopens, ArrayList<Integer> boxes) {
    list.add(boxes.get(prisoner));
    if (list.get(0)==prisoner) {return 1;}
    for (int i=1; i<boxopens; i++) {
      list.add(boxes.get(list.get(i-1)));
      if (list.get(i)==prisoner) {return 1;}
    }
    return 0;
  }

  public static void main(String[] args) {
    // get input
    Scanner scan = new Scanner(System.in);
    System.out.println("How many test cases?");
    int testcases = scan.nextInt();
    System.out.println("How many prisoners?");
    int prisoners = scan.nextInt();
    System.out.println("How many chances?");
    int boxopens = scan.nextInt();
    scan.close();

    // get current time
    long starttime = System.currentTimeMillis();
    // initialize boxes arraylist
    ArrayList<Integer> boxes = new ArrayList<Integer>();
    for (int i=0; i<prisoners; i++) {boxes.add(i);}
    Collections.shuffle(boxes);

    ArrayList<Integer> randomchoice = new ArrayList<Integer>(boxopens);
    ArrayList<Integer> smartchoice = new ArrayList<Integer>(boxopens);
    int randomscore = 0;
    int smartscore = 0;
    for (int round=0; round<testcases; round++) {
      // iterate over prisoners
      for (int prisoner=0; prisoner<prisoners; prisoner++) {
        // iterate over # of box opens
        randomscore += getrandomroll(randomchoice, prisoner, boxopens, prisoners, boxes);
        smartscore += getsmartroll(smartchoice, prisoner, boxopens, boxes);

        randomchoice.clear();
        smartchoice.clear();
      }
    }
    System.out.println("\nSmart score:");
    System.out.printf("\t%d/%d\n\t%f percent\n",smartscore,prisoners*testcases,(float) smartscore/(prisoners*testcases));
    System.out.println("Dumb score:");
    System.out.printf("\t%d/%d\n\t%f percent\n",randomscore,prisoners*testcases,(float) randomscore/(prisoners*testcases));
    long endtime = System.currentTimeMillis();
    System.out.println("Time elapsed: "+(endtime-starttime)+" ms");
  }
}
