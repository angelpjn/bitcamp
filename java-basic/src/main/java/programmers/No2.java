package programmers;

public class No2 {
    
    
    static int row = 0;
    static int col = 0;

    private int result(int[][] maze) {
        
        
        return -1;
    }

    public static void main(String[] args) {
        No2 no = new No2();
        int[][] maze = {{1,0,1,1,1},
                        {1,0,1,0,1},
                        {1,0,1,1,1},
                        {1,1,1,0,1},
                        {0,0,0,0,1}};
        
        System.out.println(no.result(maze));
        
    }

}
