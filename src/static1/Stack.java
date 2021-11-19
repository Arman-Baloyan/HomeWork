package static1;
//Усовершенствованный класс Stack,в котором
//используется свойство длины массива
public class Stack {
    private int stack[];
    private int tos[];

    //выделить память под стек и инициализировать его
    Stack(int size){
        stack=new int[size];
        int tos=-1;
    }
    void push(int item){
        if(tos==stack)
            System.out.println("Стек заполнен");

    }

    public boolean pop() {
        return false;
    }
}
