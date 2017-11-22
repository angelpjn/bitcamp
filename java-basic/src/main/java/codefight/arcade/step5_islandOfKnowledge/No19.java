/*
Call two arms equally strong if the heaviest weights they each are able to lift are equal.

Call two people equally strong 
if their strongest arms are equally strong 
(the strongest arm can be both the right and the left),
and so are their weakest arms.

Given your and your friend's arms' lifting capabilities find out if you two are equally strong.

Input:
yourLeft: 1
yourRight: 10
friendsLeft: 10
friendsRight: 0
Expected Output: false

Input:
yourLeft: 10
yourRight: 15
friendsLeft: 5
friendsRight: 20
Expected Output: false
*/
package codefight.arcade.step5_islandOfKnowledge;

public class No19 {

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        if (yourLeft + yourRight - friendsLeft - friendsRight != 0)
            return false;
        if (yourLeft != friendsLeft &&
                yourLeft != friendsRight &&
                        yourRight != friendsLeft &&
                                yourRight != friendsRight)
            return false;
        return true;
    }

    public static void main(String[] args) {
        No19 no = new No19();

        int yourLeft = 5;
        int yourRight = 10;
        int friendsLeft = 10;
        int friendsRight = 10;
        

        System.out.println(no.areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight));
    }

}
