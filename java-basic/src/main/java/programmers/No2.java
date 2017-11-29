package programmers;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;

public class No2 {

    ArrayList<Point> getPath(boolean[][] maze) {
        int count = 0;
        if (maze == null || maze.length == 0) return null;
        ArrayList<Point> path = new ArrayList<Point>();
        HashSet<Point> failedPoints = new HashSet<Point>();
        if (getPath(maze, maze.length - 1, maze[0].length - 1, path, failedPoints)) {
            count = path.size();
            System.out.println(count);
            return path;
        }
        return null;
    }
    
    boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints) {
//        범위를 벗어났거나 지나갈 수 없으면 false를 반환한다.
        if (col < 0 || row < 0 || !maze[row][col]) {
            return false;
        }
        
        Point p = new Point(row, col);

//        이미 방문했다면 false를 반환한다.
        if (failedPoints.contains(p)) {
            return false;
        }
        
        boolean isAtOrigin = (row == 0) && (col == 0);
        
//        경로가 존재하면 현재 위치를 더한다.
        if (isAtOrigin || getPath(maze, row, col - 1, path, failedPoints) ||
                getPath(maze, row - 1, col, path, failedPoints)) {
            path.add(p);
            return true;
        }
        failedPoints.add(p); // 캐시 결과
        return false;
    }
    

    public static void main(String[] args) {
        No2 no = new No2();
        boolean[][] maze = {{true, false,true, true, true},
                            {true, false,true, false,true},
                            {true, false,true, true, true},
                            {true, true, true, false,true},
                            {false,false,false,false,true}};
        
        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[0].length; c++) {
                no.getPath(maze);
            }
        }
    }

}
