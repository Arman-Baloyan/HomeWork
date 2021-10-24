package lesson5;

public class BreakLoop4 {
    public static void main(String[] args) {
        outher:
        for (int i = 0; i < 3; i++) {
            System.out.println("Проход"+i+":");
            for (int j = 0; j < 20; j++) {
                if(j==10) break outher; // выход из обоих цикл
                System.out.println(j+" ");
            }
            System.out.println("Это строка не будет выводиться");
        }
        System.out.println("Циклы завершены");
    }
}
