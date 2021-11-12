package dynamicArray;

import lesson9.Stack;

public class DynamicArray {

    //Это наш главный массив,в котором будем хранить наш эллемент
    private int[] array = new int[10];

    {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array.length" + i +
                    " : " + array[i]);
        }
    }

    //Мaссив в котором будет добовляться наши элементы
    private int size = 10;

    {
        int size = 10;

        for (int i = 0; i < size; i++) {
            System.out.println(size + 1);


        }


    }

    //Проверить если в массиве место-> позвать extend()и добавить
    public void add(int value) {
        int[] add = new int[10];
        if (size == array.length) {
            extend();

        }

        int[] sum = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            sum[i] = array[i];

        }
        sum = array;

    }

    // 1.Создать из старого массива 10 элементный большой массив
    // 2.Ставить новый массив в старый массив
    //3.Оглавление старого массива связать с новым массивом
    private void extend() {
        int[] array = new int[10];
        int[] a = {1, 3, 5, 7, 9};
        System.out.println("New Integer After Copying");
        int[] b = {0, 2, 4, 6, 8};
        System.out.println("New Integer After Copying");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.println(array.length);
            }
        }
    }

    //Если данный индекс находиться внутри индекса преобразованного массива ,вернуть index-երրռրդ элемент.
//В противном случае вернуть -1
//
    public int getByIndex(int index) {
        if (index < 0 || index > array.length) ;
        System.out.println("Invalid index");
        return -1;
    }

    //Печатать добавленные элементы массива
    public void print() {
        System.out.println(getByIndex(3 - 1));
        System.out.println(array.length);
        System.out.println();


    }

    public void deleted(int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
        }

        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    public void add(int value, int index) {
        for (int i = size - 1; i <= index; i--) {
            array[i + 1] = array[i];
            array[index] = value;
            size++;

        }

    }


    public void set(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid index");

        } else {
            array[index] = value;
        }
    }

    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);

        }

    }

    public boolean isExist(int value) {
        for (int i : array) {
            return true;

        }
        return false;
    }

    public boolean isEmpty() {


        return size==0;
    }

}


