package dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {


        DynamicArray da = new DynamicArray();
        for (int i = 0; i < 10; i++) {

        }
        int[]numbers={11,22,33,44,55};
        da.add(numbers);
        da.print();
     /*   da.add(10);
        int byIndex= da.getByIndex(4);
        System.out.println(byIndex);
        da.print();
        da.set(12,5);
        System.out.println();
        da.print();
        da.add(13,6);
        System.out.println();
        da.print();
        System.out.println();*/
        da.add(9);
        System.out.println(da.isExist(9));
        System.out.println(da.isEmpty());
    }
}
