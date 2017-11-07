
public class ScoreDao { // Data Access Object
    static Score[] scores = new Score[10000];
    static int cursor = 0;
    
    static void add(Score score) {
        if (cursor == scores.length) {
            System.err.println("저장 용량 초과");
            return; // void에서 return만 적으면 더 이상 실행하지 않고 나가겠다는 뜻
        }
        scores[cursor++] = score;
    }
    
    static int size() {
        return cursor;
    }
    
    static Score get(int index) {
        if (index < 0 || index >= cursor) {
            return null;
        }
        return scores[index];
    }
}
