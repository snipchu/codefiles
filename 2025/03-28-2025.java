import java.util.*;

public class boatholes {
  private int numholes;
  private int[][] map;
  private Random rand = new Random();
  public boatholes(int n1, int n2) {
    numholes=0;
    map = new int[n1][n2];
    pokehole(rand.nextInt(n1), rand.nextInt(n2));
  }

  public void printmap() {
    for (int i=0; i<map.length; i++) {
      for (int j=0; j<map[0].length; j++) {
        System.out.print(map[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public void pokehole(int x, int y) {
    if (map[x][y]==0) {
      numholes++;
      map[x][y]=1;
      System.out.println("Poked hole at x="+x+", y="+y);

      if (x==map.length-1) {
        map[x][y]=2;
      } else {
        findwater(x,y);
      }
      printmap();
    }
    pokehole(rand.nextInt(map.length), rand.nextInt(map[0].length));
  }

  public void findwater(int x, int y) {
    for (int x1=x-1; x1<=x+1; x1++) {
      for (int y1=y-1; y1<=y+1; y1++) {
        if (x1>=0 && x1<map.length && y1>=0 && y1<map[0].length && map[x1][y1]!=0) {
          System.out.println("valid");
        }
      }
    }
  }

  public static void main(String[] args) {
    boatholes foo = new boatholes(5,5);
  }
}
