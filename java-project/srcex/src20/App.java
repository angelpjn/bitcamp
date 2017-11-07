
//: ## ver 20
//: - 기능 추가: 사용자 명령을 처리하는 코드 메서드로 분리
//: - 요구사항
//:   - 관련 기능 클래스로 분리
//: 
//: 

public class App {

    public static void main(String[] args) {

        loop: while (true) {
            String input = Prompts.input("성적관리> ");
            ScoreController scoreController = new ScoreController();
            
            switch (input) {
            case "add": scoreController.doAdd(); break;

            case "list": scoreController.doList(); break;

            case "view": scoreController.doView(); break;
            
            case "update": scoreController.doUpdate(); break;

            case "delete": scoreController.doDelete(); break;

            case "quit": scoreController.doQuit(); break loop;

            default: scoreController.doError();
            }
            System.out.println();
        }
    }


    

    
}
