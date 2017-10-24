package practice;

public class MultipleTable {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 4; k++) {
                    int col = (i * 3 + k + 1);
                    if (col == 10) {
                        break;
                    }
                    System.out.printf("%d * %d = %d\t", col, j, col * j); 
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
