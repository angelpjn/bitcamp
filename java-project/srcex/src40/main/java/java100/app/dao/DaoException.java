// DaoException의 목적은 클래스 이름 그 자체가 목적. 
// 어디서 발생한 예외인지에 대해 예외 발생 시 알려주는 목적

package java100.app.dao;

public class DaoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DaoException() {
        super();
    }

    public DaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DaoException(String message) {
        super(message);
    }

    public DaoException(Throwable cause) {
        super(cause);
    }

    
}
