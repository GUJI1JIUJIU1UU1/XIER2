package xier2;

public class Cats extends Animal{
    @Override
    public String toString() {
        return null;
    }

    public Cats() {
    }

    public Cats(String name, int age, String gender, double price) {
        super(name, age, gender, 200);
    }
}
