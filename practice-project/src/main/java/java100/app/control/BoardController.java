package java100.app.control;

import java.io.PrintWriter;
import java.util.List;

import java100.app.annotation.Component;
import java100.app.dao.BoardDao;
import java100.app.domain.Board;

@Component("/board")
public class BoardController implements Controller {
    
    BoardDao boardDao;
    
    public void setBoardDao(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Override
    public void destroy() {}

    @Override
    public void init() {}
    
    @Override
    public void execute(Request request, Response response) {

        switch (request.getMenuPath()) {
        case "/board/list": this.doList(request, response); break;
        case "/board/add": this.doAdd(request, response); break;
        case "/board/view": this.doView(request, response); break;
        case "/board/update": this.doUpdate(request, response); break;
        case "/board/delete": this.doDelete(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 목록]");
        
        try {
            List<Board> list = boardDao.selectList();
            for (Board board : list) {
                out.printf("%d, %s, %s, %d\n", 
                        board.getNo(),
                        board.getTitle(),
                        board.getRegDate(),
                        board.getViewCount());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 등록]");
        
        try {
            Board board = new Board();
            board.setTitle(request.getParameter("title"));
            board.setContent(request.getParameter("conts"));
            
            boardDao.insert(board);
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    } 
    
    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 상세 정보]");
        
        int no = Integer.parseInt(request.getParameter("no"));
        
        try {
            Board board = boardDao.selectOne(no);

            if (board != null) {
                out.printf("번호: %d\n", board.getNo());
                out.printf("제목: %s\n", board.getTitle());
                out.printf("내용: %s\n", board.getContent());
                out.printf("등록일: %s\n", board.getRegDate());
                out.printf("조회수: %d\n", board.getViewCount());
            } else {
                out.printf("'%s'번 게시물이 없습니다.\n", no);
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    } 
    
    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 변경]");
        
        try {
            Board board = new Board();
            board.setNo(Integer.parseInt(request.getParameter("no")));
            board.setTitle(request.getParameter("title"));
            board.setContent(request.getParameter("conts"));
            if (boardDao.update(board) > 0) {
                out.println("변경하였습니다.");
            } else {
                out.printf("'%s'번 게시물이 없습니다.\n", request.getParameter("no"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
    
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[게시물 삭제]");
        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (boardDao.delete(no) > 0) {
                out.println("삭제하였습니다.");
            } else {
                out.printf("'%s'번 게시물이 없습니다.\n", request.getParameter("no"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }
}








