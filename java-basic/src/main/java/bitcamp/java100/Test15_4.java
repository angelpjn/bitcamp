
package bitcamp.java100;

public class Test15_4 {
    public static void main(String[] args){

        float f1 = 3.141592f, f2 = 5432.123f;
        int i1 = 7654321;
        System.out.printf("f1 = %f, i1 = %d\n", f1, i1);

        double r1 = (double)f1 + (double)i1; // => f1 + i1의 결과는 float이므로 이미 7자리를 제외한 나머지 값은 짤린 상태.
                             // => 그 상태에서 double로 넣어봐야 잘린 값이 들어감. 이렇게 암시적 형변환으로 해결 안되는
                             // => 문제에 있어서 사용하는 것이 명시적 형변환
        System.out.println(r1);
        r1 = f1 + i1; // 변수의 타입이 바뀌는 것이 아니라 그 결과 값이 변한 것이라는 증명.
                      // 해당 변수로 다시 계산하면 암시적 형변환에 의한 계산 결과 값이 나온다.
        System.out.println(r1);
    }
}