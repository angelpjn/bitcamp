/* 
[14-1] 메서드를 람다식으로 변환하여 아래의 표를 완성하시오.

[메서드]

메서드1
max(int a, int b) {
return a > b ? a : b;
}

메서드2
int printVar(String name, int i) {
System.out.println(name+"="+i );
} 

메서드3
int square(int x) {
return x * x;
}

메서드4
int roll() {
return (int)(Math.random() * 6);
} 

메서드5
int sumArr(int[] arr) {
int sum = 0;
for(int i : arr)
sum += i;
return sum;
}

메서드6
int[] emptyArr() {
return new int[]{};
}

[람다식]

(int a, int b) -> a > b ? a : b
(a)
(b)
(c)
(d)
(e)
 
*/

package solve_original.solve_jungseok.ch14_LambdaStream;

