package dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        da.add(10);
        int byIndex= da.getByIndex(0);
        System.out.println(byIndex);
        da.print();
    }
}
