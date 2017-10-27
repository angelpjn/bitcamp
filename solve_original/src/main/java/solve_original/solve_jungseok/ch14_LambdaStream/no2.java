/* 
[14-2] 람다식을 메서드 참조로 변환하여 표를 완성하시오. (변환이 불가능한 경우,
‘변환불가’라고 적어야함.)

[람다식] 
1. (String s) -> s.length()
2. ()-> new int[]{}
3. arr -> Arrays.stream(arr)
4. (String str1, String str2) -> str1.equals(str2)
5. (a, b) -> Integer.compare(a, b)
6. (String kind, int num) -> new Card(kind, num)
7. (x) -> System.out.println(x)
8. ()-> Math.random()
9. (str) -> str.toUpperCase()
10. () -> new NullPointerException()
11. (Optional opt) -> opt.get()
12. (StringBuffer sb, String s) -> sb.append(s)
13. (String s) -> System.out.println(s)

[메서드 참조]
*/

package solve_original.solve_jungseok.ch14_LambdaStream;

