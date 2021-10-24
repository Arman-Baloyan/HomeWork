package lesson5;

public class ForEach {

    public static void main(String[] args) {

        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // используеться цикл for в стиле  for each для выхода из суммирования значений из части массива

        for (int x : nums) {
            System.out.println(" " + x);
            sum = sum + x;       // прервать цикл после после получения 9 значений
            if (x == 9) break;
        }
        for (int x : nums) {
            System.out.println(x + " ");   //этот оператор не оказывает никакого на массив nums
            x = x * 10;
        }
        System.out.println();
        for (int x : nums){
            System.out.println();
        }

    }

}

