package xier2;

import oop_interfaceDemo1.Rabbit;

public class Rabbits extends Animal{
    @Override
    public String toString() {
        return null;
    }
    public Rabbits(){

    }
    public Rabbits(String name, int age, String gender, double price){
        super(name,age,gender,100);
    }
}
