package practice.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
            ComputeNum compute = new ComputeNum();
            
            System.out.print("숫자 입력 :");
            int num1 = scan.nextInt();
            compute.plus(num1);
            
            System.out.print("숫자 입력 :");
            int num2 = scan.nextInt();
            compute.minus(num2);
            
            System.out.print("숫자 입력 :");
            int num3 = scan.nextInt();
            compute.multiple(num3);
            
            System.out.print("숫자 입력 :");
            int num4 = scan.nextInt();
            compute.devide(num4);
            
            System.out.println(ComputeNum.result);
    }
}
