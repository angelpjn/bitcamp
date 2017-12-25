/*
six groups of two hexadecimal digits
0 to 9 or A to F
separated by hyphens
01-23-45-67-89-AB
*/
package codefight.arcade.step12_longestWorld;

import java.util.ArrayList;

public class No56 {

    int digitsProduct(int product) {
        if (product == 0) return 10;
        if (1 <= product && product <= 9) return product;

        ArrayList<Integer> list = new ArrayList<>();

        int tempProduct = product;
        int count = 9;
        while (tempProduct != 1) {
            count = 9;
            for (int i = 9; i >= 1; i--) {
                System.out.println(i);
                if (tempProduct % i == 0) {
                    list.add(i);
                    tempProduct /= i;
                    break;
                }
                count--;
                if (count == 1) return -1;
            }
            if (tempProduct == product) return -1;
        }
        
        int result = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            result += list.get(i) * Math.pow(10, i);
        }
        return result;
    }

    public static void main(String[] args) {
        No56 no = new No56();

//        int product = 33;
//        int product = 450;
//        int product = 12;
//        int product = 13;
//        int product = 1;
        int product = 0;
        System.out.println(no.digitsProduct(product));
    }

}
