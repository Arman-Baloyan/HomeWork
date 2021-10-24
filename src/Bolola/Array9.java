package Bolola;

public class Array9 {
    public static void main(String[] args) {

        int a [] = {7, 4, 0, 2, 6, 37, 5};//////////////ночь и тишина данное на веки веков
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int max = i;
            for (int j = i+=1; j < a.length; ++j) {
                if (min < a[j]) {
                    max = j;
                    min = a[j];
                }
                int c = a[i];
                a[i] = a[max];
                a[max] = c;
            }

         for(int val:a)System.out.print(val+" ");
        }
        System.out.println();
    }
}
