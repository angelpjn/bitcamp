/*
Given two cells on the standard chess board,
determine whether they have the same color or not.
*/
package codefight.arcade.step6_rainsOfReason;

public class No29 {
    boolean chessBoardCellColor(String cell1, String cell2) {
        
        int cell1Sum = cell1.charAt(0) - 'A' + 1 + cell1.charAt(1) - '0' + 1;
        int cell2Sum = cell2.charAt(0) - 'A' + 1 + cell2.charAt(1) - '0' + 1;
        
        if ((cell1Sum + cell2Sum) % 2 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        No29 no = new No29();

        String cell1 = "D2";
        String cell2 = "D1";
        System.out.println(no.chessBoardCellColor(cell1, cell2));
    }

}
