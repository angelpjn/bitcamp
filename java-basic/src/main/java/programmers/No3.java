package programmers;

public class No3 {
    
    public int solution(String arr[]) {
        String operator = "";
        for (int i = 0; i < arr.length; i++) {
            operator += arr[i];
        }

        String reverseOperator = new StringBuffer(operator).reverse().toString();
        
        int len = operator.length();
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < len; i++) {
            if (operator.charAt(i) == '-' && start == 0)
                start = i;
            if (reverseOperator.charAt(i) == '-' && end == 0) {
                end = i;
                end = len - end - 1;
            }
        }
        int answer = 0;
        for (int i = 0; i < end + 1; i++) {
            if (reverseOperator.charAt(i) == '+') {
                answer = answer * 1;
            } else if (reverseOperator.charAt(i) == '-') {
                answer = answer * (-1);
            } else if ('0' <= reverseOperator.charAt(i) && reverseOperator.charAt(i) <= '9') {
                answer = answer + (reverseOperator.charAt(i) - '0');
            }
        }
        
        int resultSum = 0;
        for (int i = 0; i < start + 1; i++) {
            if ('0' <= operator.charAt(i) && operator.charAt(i) <= '9')
                resultSum += operator.charAt(i) - '0';
        }
        answer = answer + resultSum;
        return answer;
    }

    public static void main(String[] args) {
        No3 no = new No3();
        String[] arr= {"5", "-", "3", "+", "1", "+", "2", "-", "4"};
        System.out.println(no.solution(arr));
    }

}
