package xier2;

public class InsufficientBalanceException extends RunTimeException{
    public InsufficientBalanceException(){
        super();
    }
    @Override
    public void error() {
        System.out.println("InsufficientBalanceException");
    }
}
