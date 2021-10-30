package arrayUtil1;

public class ArrayUtil1 {

    int max(int[]array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            System.out.print(max);
        }
        return max;
    }
}
