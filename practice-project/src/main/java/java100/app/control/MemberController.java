package java100.app.control;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Member;
import java100.app.util.Prompts;

public class MemberController extends GenericController<Member> {

    private String dataFilePath;
    
    public MemberController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
    
    @Override
    public void destroy() {
        try (PrintWriter out = 
                new PrintWriter(
                        new BufferedWriter(
                                new FileWriter(this.dataFilePath))); ) {
            for (Member member : this.list) {
                out.write(member.toCSVString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void init() {
        try (
                BufferedReader in = 
                new BufferedReader(
                        new FileReader(this.dataFilePath));

                Scanner lineScan = new Scanner(in);
                ) {
            String csv = null;
            while (lineScan.hasNext()) {
                csv = lineScan.nextLine();
                try {
                    list.add(new Member(csv));
                } catch (CSVFormatException e) {
                    System.out.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void execute() {
        loop: while (true) {
            System.out.print("회원관리> ");
            String input = keyScan.nextLine();

            switch (input) {
            case "list": this.doList(); break;
            case "add": this.doAdd(); break;
             case "view": this.doView(); break;
             case "update": this.doUpdate(); break;
             case "delete": this.doDelete(); break;
            case "main": break loop;
            default:
                System.out.println("해당 명령이 없습니다.");
            }
            System.out.println();
        }
    }

    private void doList() {
        System.out.println("[회원 목록]");

        Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.printf("%-4s, %s\n",
                    member.getName(), member.getEmail());
        }
    }

    private void doAdd() {
        System.out.println("[회원 등록]");

        Member member;
        member = new Member();

        member.setName(Prompts.inputString("이름? "));
        member.setEmail(Prompts.inputString("이메일? "));
        member.setPassword(Prompts.inputString("암호? "));
        
        boolean isExist = false;
        Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEmail().equals(member.getEmail())) {
                isExist = true;
                break;
            }
        }
        
        if (isExist) {
            System.out.println("이미 등록된 이메일입니다.");
        } else {
            list.add(member);
            System.out.println("입력하였습니다.");
        }

    }

    private void doView() {
        System.out.println("[회원 상세 정보]");
        String email = Prompts.input("이메일? ");
        
        Member member = findByEmail(email);
        
        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
        } else {
            System.out.printf("이름 : %s\n", member.getName());
            System.out.printf("이메일 : %s\n", member.getEmail());
            System.out.printf("암호 : %s\n", member.getPassword());
        }
    }

    private void doUpdate() {
        System.out.println("[회원 변경]");
        String email = Prompts.input("이메일? ");
        
        Member member = findByEmail(email);
        
        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
        } else {
            
            String name = member.getName();
            try {
                name = Prompts.inputString("이름? ", member.getName());
            } catch (Exception e) {}
            
            String password = member.getPassword();
            try {
                password = Prompts.inputString("암호? ", member.getPassword());
            } catch (Exception e) {}
            
            if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
                member.setName(name);
                member.setPassword(password);
                System.out.println("변경하였습니다.");
                
            } else {
                System.out.println("변경을 취소하였습니다.");
            }
        }
    }
    
    private void doDelete() {
        System.out.println("[성적 삭제]");
        String email = Prompts.input("이메일? ");
        
        Member member = findByEmail(email);
        
        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(member);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
    }
    
    private Member findByEmail(String email) {
        Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getEmail().equals(email)) {
                return member;
            }
        }
        return null;
    }

}
