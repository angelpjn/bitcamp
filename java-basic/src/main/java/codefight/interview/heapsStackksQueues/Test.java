package codefight.interview.heapsStackksQueues;

import java.util.Arrays;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] input = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        
        int max = -1000000;
        for (int i = 0; i < input.length; i++) {
            max = Math.max(max, input[i]);
        }
            
        int[] input2 = new int[max + 1];
        input2[0] = 0;
        
        for (int i = 0; i < input.length; i++) {
            input2[input[i]]++;
        }
        
        System.out.println(Arrays.toString(input2));
//        Set<String> keySet = map.keySet();
//        List<String> keyList = new ArrayList<String>(keySet);
    }

}
