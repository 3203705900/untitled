package 异常处理;
//必须要这个类继承Exception,才能成为一个编译时异常
public class AgeIllegalException extends Exception{
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
