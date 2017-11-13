/*
6.10 독극물 : 1,000개의 음료수 중 하나에 독극물이 들어 있다. 그리고 독극물을 확인해 볼 수 있는 식별기 10개가 주어졌다.
독극물 한 방울을 식별기에 떨어뜨리면 식별기가 변한다. 만약 식별기에 독극물을 떨어뜨리지 않았다면
몇 번이든 재사용해도 된다. 하지만 이 테스트는 하루에 한 번만 할 수 있으며 결과를 얻기까지 일주일이 걸린다.
독극물이 든 음료수를 가능한 한 빨리 찾아내려면 어떻게 해야 할까?

1. 하나를 랜덤으로 선택한다.
2. 백개의 음료수 병 당 1개의 식별기를 배정한다.
3. 배정된 식별기별로 백개 이내의 테스트를 동일(십의 자리 이하의 숫자) 기준으로 매일 진행한다.
단, 해당된 테스트가 독극물과의 번호 기준 위인지 아래인지 알려줘야 한다.

*/

package ch06;

public class No10 {

    public static void main(String[] args) {

        int poison = (int) (Math.random() * 1000);
        int poisonCheckInit = (int) (Math.random() * 100) + 1;
        int[] poisonCheckArr = new int[10];
        int i = 0;
        int h = poison / 100;
        int re = poison - h * 100;

        System.out.println(h);

        for (i = 0; i < 10; i++) {
            poisonCheckArr[i] = poisonCheckInit + 100;
        }

        int count = 0;

        loop:
        while (true) {
            count++;
            if (poisonCheckArr[0] == re) {
                System.out.println("독약 병 번호 : " + poison);
                System.out.println(count);
                break;
            } else if (poisonCheckArr[0] < re) {
                int gap = poison - poisonCheckArr[0];
                if (gap % 2 != 0)
                    gap++;
                poisonCheckArr[0] = poisonCheckArr[0] + gap / 2;
            } else {
                int gap = poisonCheckArr[0] - re;
                if (gap % 2 != 0)
                    gap++;
                poisonCheckArr[0] = poisonCheckArr[0] - gap / 2;
            }
        }
    }
}
