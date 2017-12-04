/*

*/
package codefight.interview.heapsStackksQueues;

public class No1 {

    int kthLargestElement(int[] nums, int k) {
        
        int max = -1000000;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, Math.abs(nums[i]));
        }
        
        int[] nums2 = new int[max * 2 + 1];
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                nums2[max - Math.abs(nums[i])]++;
            else if (nums[i] == 0)
                nums2[max]++;
            if (nums[i] > 0)
                nums2[nums[i] + max]++;
        }
        
        
        int index = 0;
        for (int i = nums2.length - 1; i >= 0; i--) {
            if (nums2[i] == 0)
                continue;
            else {
                k -= nums2[i];
                if (k <= 0) {
                    if (i < nums2.length / 2) {
                        index = i - max;
                    } else {
                        index = i - nums2.length / 2;
                    }
                    break;
                }
            }
        }
        int result = index;

        return result;
    }
    
    public static void main(String[] args) {
        No1 no = new No1();
        int[] nums = {-1, -2, -3, -4, -5};
        
        int k = 1;
        
        System.out.println(no.kthLargestElement(nums, k));
    }
    
}
