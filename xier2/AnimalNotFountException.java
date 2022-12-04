package xier2;

public class AnimalNotFountException extends RunTimeException{
    public AnimalNotFountException(){
        super();
    }
    @Override
    public void error() {
        System.out.println("AnimalNotFountException");
    }
}
