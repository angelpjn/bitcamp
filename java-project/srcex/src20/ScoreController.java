import java.util.ArrayList;
import java.util.Iterator;

public class ScoreController {
    
    private ArrayList<Score> list = new ArrayList<>();
    private Score score = null;
    private Iterator<Score> iterator = null;
    private String name = null;
    private Score temp = null;
    
    public void doAdd() {
        System.out.println("[학생 등록]");

        while (true) {
            score = new Score();
            score.input();

            list.add(score);

            if (!Prompts.confirm("계속하시겠습니까?(Y/n) "))
                break;
        }
    }

    public void doList() {
        System.out.println("[학생 목록]");
        iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    public void doView() {
        System.out.println("[학생 정보]");
        name = Prompts.input("이름? ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp.name.equals(name)) {
                score = temp;
                break;
            }
        }

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            score.printDetail();
        }
    }

    public void doDelete() {
        System.out.println("[학생 삭제]");
        name = Prompts.input("이름? ");

        score = null;
        iterator = list.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp.name.equals(name)) {
                score = temp;
                break;
            }
        }

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            if (Prompts.confirm2("정말 삭제 하시겠습니까?(y/N) ")) {
                list.remove(score);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
    }

    public void doUpdate() {
        System.out.println("[학생 정보 변경]");
        name = Prompts.input("이름? ");

        iterator = list.iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp.name.equals(name)) {
                score = temp;
                break;
            }
        }

        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            score.update();
        }
    }

    public void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }
}
