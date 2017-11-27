package programmers;

import java.util.Arrays;

public class No1 {
    
    public int solution(int[] nums) {
        int answer = 0;
        
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        answer = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i])
                answer++;
        }
        if (answer > nums.length / 2)
            answer = nums.length / 2;
        return answer;
    }

    public static void main(String[] args) {
        No1 no = new No1();
        int[] nums = {3,3,3,2,2,4};
        System.out.println(no.solution(nums));
    }

}
