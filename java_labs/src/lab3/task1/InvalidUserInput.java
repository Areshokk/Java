package lab3.task1;

public class InvalidUserInput extends Exception{
    public InvalidUserInput(final String message, final HttpCodeEnum code){
        super(code.getCode() + ": " + message);
    }
}
