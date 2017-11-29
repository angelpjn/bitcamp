/*            {0,0,0,0,0,0,0,0,0},
            {5,5,5,0,0,0,0,0,0},
            {0,0,0,5,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,9},*/

package programmers;

import java.util.LinkedList;
import java.util.Queue;

class Point {
    int x;
    int y;
    Point parent;
    
    public Point(int x, int y, Point parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }
    
    public Point getParent() {
        return this.parent;
    }
    
    public String toString() {
        return "x = " + x + " y = " + y;
    }
}

public class Solution {


  public Queue<Point> q = new LinkedList<Point>();

  public Point getPathBFS(int x, int y, int[][] maps) {

      q.add(new Point(x,y, null));

      while(!q.isEmpty()) {
          Point p = q.remove();

//          if (arr[p.x][p.y] == 9) {
          System.out.println(4);
          if (p.x == maps.length - 1 && p.y == maps[x].length - 1) {
              System.out.println("Exit is reached!");
              return p;
          }

          if(isFree(p.x+1, p.y, maps)) {
              maps[p.x][p.y] = - 1;
              Point nextP = new Point(p.x+1,p.y, p);
              q.add(nextP);
          }

          if(isFree(p.x-1, p.y, maps)) {
              maps[p.x][p.y] = - 1;
              Point nextP = new Point(p.x-1,p.y, p);
              q.add(nextP);
          }

          if(isFree(p.x, p.y+1, maps)) {
              maps[p.x][p.y] = - 1;
              Point nextP = new Point(p.x,p.y+1, p);
              q.add(nextP);
          }

          if(isFree(p.x, p.y-1, maps)) {
              maps[p.x][p.y] = - 1;
              Point nextP = new Point(p.x,p.y-1, p);
              q.add(nextP);
          }

      }
      return null;
  }

  public boolean isFree(int x, int y, int[][] maps) {
      if((x >= 0 && x < maps.length) && (y >= 0 && y < maps[x].length) && (maps[x][y] == 1 || maps[x][y] == 9)) {
          return true;
      }
      return false;
  }

  public int solution(int[][] maps) {
      Point p = getPathBFS(0, 0, maps);

      System.out.println(1);
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length; j++) {
                System.out.printf("%3d", maps[i][j]);
            }
            System.out.println();
        }
        
        if (p == null)
            return -1;
//        System.out.println(2);
      int count = -1;
//      System.out.println(3);
      while(p.getParent() != null) {
            System.out.println(p);
          p = p.getParent();
          count--;
      }
      
      System.out.println(count);
      int answer = Math.abs(count);
      return answer;
  }
    
  public static void main(String[] args) {
      Solution solution = new Solution();

      int[][] arr = new int[][] {
          {1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}
        };
        
      System.out.println(solution.solution(arr));

  }

}