package xier2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyAnimalShop shop = new MyAnimalShop();
        shop.setBalance(500);
        ArrayList<Animal> list1 = new ArrayList<>();
        Cats c = new Cats("小咪",3,"雄",200);
        ChinesePastoralDog d = new ChinesePastoralDog("旺财",4,"雄",100,true);
        Rabbits r = new Rabbits("小白",2,"雌",150);
        list1.add(c);
        list1.add(d);
        list1.add(r);
        ArrayList<Customer> list2 = new ArrayList<>();
        Customer C =new Customer("张三",2, LocalDate.now());
        MyAnimalShop SHOP =new MyAnimalShop();
        SHOP.buy("小灰",1,"雄",150);
        SHOP.entertain(c,C,list1,list2);
        SHOP.Shutdown(LocalDate.now(),list2);
        }


    }

