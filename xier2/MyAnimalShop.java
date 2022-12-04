package xier2;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop{
    private double balance=500;
    private ArrayList<Animal> animal =new ArrayList<>();
    private ArrayList<Customer> customer = new ArrayList<>();
    private boolean inBusiness;

    public MyAnimalShop() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(ArrayList<Animal> animal) {
        this.animal = animal;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public boolean isInBusiness() {
        return inBusiness;
    }

    public void setInBusiness(boolean inBusiness) {
        this.inBusiness = inBusiness;
    }

    public InsufficientBalanceException getErr() {
        return err;
    }

    public void setErr(InsufficientBalanceException err) {
        this.err = err;
    }


    public MyAnimalShop(double balance, ArrayList<Animal> animal, ArrayList<Customer> customer, boolean inBusiness, InsufficientBalanceException err, Customer c) {
        this.balance = balance;
        this.animal = animal;
        this.customer = customer;
        this.inBusiness = inBusiness;
        this.err = err;

    }

    InsufficientBalanceException err = new InsufficientBalanceException();
    AnimalNotFountException err2 = new AnimalNotFountException();
    @Override
    public void buy(String name, int age, String gender, double price) {
        try {
            if(balance>=price){
                balance=balance-price;
                Animal a = new Animal(name, age, gender, price) {
                    @Override
                    public String toString() {
                        return null;
                    }
                };
                animal.add(a);

            }

        } catch (Exception e) {
            err.error();
        }
    }

    @Override
    public void entertain(Animal a,Customer c,ArrayList<Animal> list1,ArrayList<Customer> list2) {

        list2.add(c);
        try {
            if (animal.size() >= 1) {
                a.toString();
                balance=balance+a.getPrice();
                list1.remove(a);

            }
        }catch (Exception e) {
            err2.error();
        }
    }

    @Override
    public void Shutdown(LocalDate date,ArrayList<Customer> list2) {
        LocalDate start =LocalDate.parse("2022-12-01");
        LocalDate finish =LocalDate.parse("2023-01-09");
        if(date.isAfter(start)&&date.isBefore(finish)){
            System.out.println("正常营业中");
            for(int i =0;i<list2.size();i++){
                Customer c =list2.get(i);
                System.out.println(c.getName()+", "+c.getFrequency()+", "+c.getDate());
            }
            System.out.println(balance);
        }else{
            System.out.println("打烊放假啦");
        }
    }







}
