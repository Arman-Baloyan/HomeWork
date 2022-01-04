package comparisons;


import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Car>list=new ArrayList<>();
        list.add(new Car("re",1999));
        list.add(new Car("lada",1998));
        list.add(new Car("volvo",1989));
        list.add(new Car("bmw",1979));
        list.add(new Car("mers",1997));

        Collections.sort(list,new SortByYear());
        Collections.sort(list,new SortByModel());


        for (Car car:list){
            System.out.println(car.getModel()+"|"+ car.getYear());
        }
    }
}
