/*
Each day a plant is growing by upSpeed meters.
Each night that plant's height decreases by downSpeed meters 
due to the lack of sun heat.
Initially, plant is 0 meters tall.
We plant the seed at the beginning of a day. 
We want to know when the height of the plant will reach a certain level.

Example

For upSpeed = 100, downSpeed = 10 and desiredHeight = 910, the output should be
growingPlant(upSpeed, downSpeed, desiredHeight) = 10.

[input] integer upSpeed

A positive integer representing the daily growth.

Guaranteed constraints:
5 ≤ upSpeed ≤ 100.

[input] integer downSpeed

A positive integer representing the nightly decline.

Guaranteed constraints:
2 ≤ downSpeed < upSpeed.

[input] integer desiredHeight

A positive integer representing the threshold.

Guaranteed constraints:
4 ≤ desiredHeight ≤ 1000.
*/
package codefight.arcade.step9_darkWilderness;

public class No38 {
    int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        
        int result = 1;
        
        int growingTotal = 0;
        
        while (true) {
            growingTotal += upSpeed;
            if (growingTotal >= desiredHeight)
                break;
            growingTotal -= downSpeed;
            result++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        No38 no = new No38();
        
        int upSpeed = 100;
        int downSpeed = 10;
        int desireHeight = 910;

        System.out.println(no.growingPlant(upSpeed, downSpeed, desireHeight));
    }

}
