package xier2;

import java.time.LocalDate;

public class Customer {
    private String name;
    private int frequency;
    LocalDate date =LocalDate.now();

    public Customer() {
    }

    public Customer(String name, int frequency, LocalDate date) {
        this.name = name;
        this.frequency = frequency;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return "顾客姓名:"+getName()+"到店次数:"+getFrequency()+"最新到店时间:"+getDate();
    }
}
