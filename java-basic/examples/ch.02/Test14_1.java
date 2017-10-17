/* 

# 과제_4
- 여러 명의 성적을 저장하고 다음과 같이 출력하라!

 ex. 
  홍길동, 100, 90, 80, 270, 90.0
  임꺽정, 90, 80, 80, 240, 80.0
  유관순, 100, 100, 100, 280, 100.0
*/
public class Test14_1 {
  
    public static void main(String[] args) {

        String [] names = {"홍길동", "임꺽정", "유관순"};
        int [][] stds = {{10, 20, 30}, 
                         {40, 50, 60}, 
                         {80, 90, 100}};

        int [] sum = new int [3];
        float count = names.length;

        for(int i = 0; i < stds.length; i++){

            System.out.printf("%d %s %s : ", i+1, ")\t", names[i]);

            for(int j = 0; j < stds[i].length; j++){

                System.out.print(stds[i][j]+"\t");
                sum[i] += stds[i][j];
            }
            System.out.printf("\n%s %d \n%s %.1f", "- 총 점 : ", sum[i], "- 평균 점수 : ",
            sum[i] / (float)stds[i].length);
            System.out.println();

        }
        System.out.println();         
    }
}
    