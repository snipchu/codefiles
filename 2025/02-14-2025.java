import java.util.*;
import java.io.*;

public class maze {
  private static boolean solvable = false;
  private static char[][] maze;
  private static int startx;
  private static int starty;

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("./02-10-2025.txt"));
    while (scan.hasNextLine()) {
      int mazerows = scan.nextInt();
      scan.nextLine();
      maze = new char[mazerows][];
      for (int i=0; i<mazerows; i++) {
        maze[i] = scan.nextLine().toCharArray();
        System.out.println(maze[i]);
        for (int j=0; j<maze[i].length; j++) {
          if (maze[i][j] == 'S') {
            startx=j; starty=i;
            break;
          }
        }
      }
      solve(startx, starty, "start");
      solvable = false;
      System.out.println("---");
    }
  }
  public static void solve(int x, int y, String output) {
    if (maze[x][y] == 'E') {
      solvable = true;
      System.out.println(output);
    } else {
      maze[x][y] = 'x';
      if (x>0 && maze[x-1][y] != 'x') {solve(x-1, y, output+", up");}
      if (x<maze.length-1 && maze[x+1][y] != 'x') {solve(x+1, y, output+", down");}
      if (y>0 && maze[x][y-1] != 'x') {solve(x, y-1, output+", left");}
      if (y<maze[0].length-1 && maze[x][y+1] != 'x') {solve(x, y+1, output+", right");}
      maze[x][y] = '.';
    }
  }
}
