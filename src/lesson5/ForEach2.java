package lesson5;

public class ForEach2 {
    public static void main(String[] args) {

        int sum = 0;
        int nums[][] = new int[4][3];
        //присваивание значения элементов nums
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = (i + 1) * (j + 1);
                System.out.println(i);
                System.out.println(j);

            }
             //используеться for в стиле for each для вывода и суммирования значений
            for(int x[]:nums){
                for(int y:x) {
                    System.out.println(" "+y);
                    sum=sum+y;
                }
                System.out.println(" "+ sum);
            }
        }
    }
}
