package Java.HomeWork6;

import java.util.*;

public class task1 {
    public static void main(String[] args){

        Cat cat1 = new Cat();
        cat1.age = 5;
        cat1.name = "Снежок";
        cat1.breed = "Персидский";
        cat1.color = "Белый";

        Cat cat2 = new Cat();
        cat2.age = 6;
        cat2.name = "Барсик";
        cat2.breed = "Сиамский";
        cat2.color = "Серый";

        Cat cat3 = new Cat();
        cat3.age = 4;
        cat3.name = "Черныш";
        cat3.breed = "Сибирский";
        cat3.color = "Черый";

        Cat cat4 = new Cat();
        cat4.age = 5;
        cat4.name = "Снежок";
        cat4.breed = "Персидский";
        cat4.color = "Белый";

        var cats = new HashSet<Cat>(Arrays.asList(cat1, cat2, cat3, cat4));
        System.out.println(cats);

        System.out.println(cat1.equals(cat4));

        

    }
}
