package xier2;

import java.time.LocalDate;
import java.util.ArrayList;

public interface AnimalShop {
    public abstract void buy(String name, int age, String gender, double price);

    void entertain(Animal a,Customer c,ArrayList<Animal> list1,ArrayList<Customer> list2);


    public abstract void Shutdown(LocalDate date,ArrayList<Customer> list2);


}
