package lesson5;

public class BreakLoop3 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println(" "+i+":");
            for (int j = 0; j < 20; j++) {
                if(j==10)break;     //выход из цикла,значение переменной j равно 10
                System.out.println(j+" ");
            }
            System.out.println();
        }
        System.out.println("циклы завершены");
        }
    }

