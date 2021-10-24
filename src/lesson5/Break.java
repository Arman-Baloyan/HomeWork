package lesson5;

public class Break {
    public static void main(String[] args) {
        boolean t =true;
        first:{
            second:{
            third:{
                System.out.println(" предшествует оператору  break");
                if(t)break second;
                System.out.println("этот оператор не будет выполняться");
            }
                System.out.println("этот оператор следует за блоком  second");
            }
        }
    }
}
