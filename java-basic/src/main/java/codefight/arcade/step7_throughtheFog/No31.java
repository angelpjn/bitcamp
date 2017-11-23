/*
You have deposited a specific amount of dollars into your bank account.
Each year your balance increases
at the same growth rate. 
Find out how long it would take for your balance 
to pass a specific threshold with the assumption 
that you don't make any additional deposits.

For deposit = 100, rate = 20 and threshold = 170, the output should be
depositProfit(deposit, rate, threshold) = 3.

Each year the amount of money on your account increases by 20%. It means that throughout the years your balance would be:

year 0: 100;
year 1: 120;
year 2: 144;
year 3: 172.8
*/
package codefight.arcade.step7_throughtheFog;

public class No31 {
    int depositProfit(int deposit, int rate, int threshold) {
        
        double reserve = 0;
        int year = 0;
        while (true) {
            reserve = deposit * Math.pow(1 + (double)rate / 100, year);
            if (reserve >= threshold)
                break;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        No31 no = new No31();
        
        int deposit = 100;
        int rate = 1;
        int threshold = 101;
        
        System.out.println(no.depositProfit(deposit, rate, threshold));
    }

}
