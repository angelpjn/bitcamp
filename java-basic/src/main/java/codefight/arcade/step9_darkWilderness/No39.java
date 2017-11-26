/*
You found two items in a treasure chest! 
The first item weighs weight1 and is worth value1, 
and the second item weighs weight2 and is worth value2.
What is the total maximum value of the items
you can take with you, 
assuming that your max weight capacity is maxW 
and you can't come back for the items later?

Note that there are only two items 
and you can't bring more than one item of each type,
i.e. you can't take two first items or two second items.

Example

For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4 and maxW = 8, the output should be
knapsackLight(value1, weight1, value2, weight2, maxW) = 10.
You can only carry the first item.

For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4 and maxW = 9, the output should be
knapsackLight(value1, weight1, value2, weight2, maxW) = 16.
You're strong enough to take both of the items with you.

For value1 = 5, weight1 = 3, value2 = 7, weight2 = 4 and maxW = 6, the output should be
knapsackLight(value1, weight1, value2, weight2, maxW) = 7.
You can't take both items, but you can take any of them.
*/
package codefight.arcade.step9_darkWilderness;

public class No39 {
    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        
        int result = 0;
        int maxWeight = Math.max(weight1, weight2);
        int minWeight = Math.min(weight1, weight2);
        int maxValue = Math.max(value1, value2);
        if (maxW >= weight1 + weight2) {
            result = value1 + value2;
        } else if (weight1 + weight2 > maxW && maxW >= maxWeight) {
            result = maxValue;
            
        } else if (weight1 + weight2 > maxW && maxWeight > maxW && maxW >= minWeight) {
            if (minWeight == weight1)
                result = value1;
            else
                result = value2;
        } else {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        No39 no = new No39();
        
        int value1 = 5;
        int weight1 = 3;
        int value2 = 7;
        int weight2 = 4;
        int maxW = 6;

        System.out.println(no.knapsackLight(value1, weight1, value2, weight2, maxW));
    }

}
