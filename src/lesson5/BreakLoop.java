package lesson5;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {     //выйти из цикла ,если значение переменной i равно 10
            if(i==10) break;
            System.out.println("i:" +i);

        }
        System.out.println(" завершения цикла ");
    }
}
