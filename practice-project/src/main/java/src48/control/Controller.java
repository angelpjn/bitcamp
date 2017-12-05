package src48.control;

public interface Controller {
    void execute(Request request, Response response);
    default void init() {}
    default void destroy() {}
}








