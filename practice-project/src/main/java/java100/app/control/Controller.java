package java100.app.control;

public interface Controller {

    void execute();
    
    default void init() {}

    default void destroy() {}
}
