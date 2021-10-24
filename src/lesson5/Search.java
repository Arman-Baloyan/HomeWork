package lesson5;

public class Search {
    public static void main(String[] args) {
        int nums[] = {12,32,45,6,111,212,1,9};
        int val=6;
        boolean found = false;//используеться цикл for в стиле for each для
                              //для поиска значения переменной val в массиве nums
        for (int x:nums){
            if(x==val){
                found=true;
                break;

            }

             if(found)
                 System.out.println("! ");
        }
    }
}
