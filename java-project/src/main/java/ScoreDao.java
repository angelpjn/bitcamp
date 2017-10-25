
public class ScoreDao { // Data Access Object
    Score[] scores = new Score[10000];
    int cursor = 0;
    
    void add(Score score) {
        if (this.cursor == this.scores.length) {
            System.err.println("저장 용량 초과");
            return; // void에서 return만 적으면 더 이상 실행하지 않고 나가겠다는 뜻
        }
        this.scores[this.cursor++] = score;
    }
    
    int size() {
        return this.cursor;
    }
    
    Score get(int index) {
        if (index < 0 || index >= this.cursor) {
            return null;
        }
        return this.scores[index];
    }
}
