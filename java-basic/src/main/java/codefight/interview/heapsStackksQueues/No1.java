/*
input:
s: "VizQEogigkRZJacVELulHjG"
Expected Output:
"viz q eogigk r z jac v e lul hj g"
"viz q eogigk r z jac v e lul hj g"
Console Output:
Empty
*/
package codefight.interview.heapsStackksQueues;

import java.util.HashMap;
import java.util.Set;

public class No1 {

    int kthLargestElement(int[] nums, int k) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        Set<Object> keySet = props.keySet();
        for (Object key : keySet) {
            String name = (String)key;
            Class<?> clazz = Class.forName(props.getProperty(name));
            
            Object obj = clazz.newInstance();
            
            pool.put(name, obj);
        }
        
        map.get(key);
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < map.size(); j++) {
//                if (nums[i] == ) {
                    count++;
//                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        No1 no = new No1();
        int[] nums = 
            {-1, 2, 0};
        
        int k = 2;
        
        System.out.println(no.kthLargestElement(nums, k));
    }
    
}
