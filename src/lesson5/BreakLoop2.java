package lesson5;

public class BreakLoop2 {
    public static void main(String[] args) {

        int i=0;
        while(i<20) {
            if(i==10) break;
            System.out.println("i:" +i);
            i++;
        }
        System.out.println("завершение цикла ");
    }
}