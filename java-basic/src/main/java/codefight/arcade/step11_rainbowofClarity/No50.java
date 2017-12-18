/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step11_rainbowofClarity;

public class No50 {

    int chessKnight(String cell) {
        int count = 0;
        int col = cell.charAt(0) - 'a';
        int row = cell.charAt(1) - '1';
        System.out.printf("col => %d\n", col);
        System.out.printf("row => %d\n", row);
        for (int i = -2; i < 3; i++) {
            if (i == -2)
                col += i;
            else
                col++;
            if (col < 0 || col == cell.charAt(0) - 'a' || col > 7)
                continue;
            System.out.printf("col => %d\n", col);
            int tempRow = row;
            for (int j = 0; j < 2; j++) {
                if (Math.abs(i) == 2) {
                    if (j == 0)
                        tempRow = tempRow - 1;
                    else
                        tempRow = tempRow + 2;
                } else if (Math.abs(i) == 1) {
                    if (j == 0)
                        tempRow = tempRow - 2;
                    else
                        tempRow = tempRow + 4;
                }
                if (tempRow < 0 || tempRow > 7) {
                    continue;
                }
                System.out.printf("row => %d\n", tempRow);
                count++;
            }            
        }

        return count;
    }


    public static void main(String[] args) {
        No50 no = new No50();

        String cell = "b7";

        System.out.println(no.chessKnight(cell));
    }

}


















