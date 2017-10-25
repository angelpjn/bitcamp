import java.util.Scanner;

class Score {
    String name;
    int[] subjects;
    int sum;
    float aver;
    
    
    Score() {  // 인스턴스 생성 후 값 만들 때
        this.subjects = new int[3];
    }
    
    Score(String name, int kor, int eng, int math) { // 값을 먼저 만들고 인스턴스를 생성할 때
        this.name = name;
        this.subjects = new int[] {kor, eng, math};
        this.compute();
    }
    
    // 즉, 이 클래스를 사용하는 개발자들에게 선택권을 부여하는 것이다.
     
    void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        
        this.subjects = new int[3]; // score에 subjects[]을 만들어야 국영수 점수 저장이 가능하다.
        
        System.out.print("국어 점수? ");
        this.subjects[0] = keyScan.nextInt();

        System.out.print("영어 점수? ");
        this.subjects[1] = keyScan.nextInt();
        
        System.out.print("수학 점수? ");
        this.subjects[2] = keyScan.nextInt();
        
        this.compute();
    }

    void compute() {
        this.sum = this.subjects[0] + this.subjects[1] + this.subjects[2];
        this.aver = this.sum / 3f;

    }

    void print() {
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                this.name, this.subjects[0], this.subjects[1], this.subjects[2], this.sum, this.aver);
    }
}

