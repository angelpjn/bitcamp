package practice.controll;

public interface Controller {

    void execute(Request request, Response response);

    void init();
    
    void destroy();
}
