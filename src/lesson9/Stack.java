package lesson9;

public class Stack {
    int []array=new int[10];
    int index;
    Stack(){
        index=-1;
    }
    void push(int item){
        if(index==9){
            System.out.println("Стек заполнен");
        }else{
            array[++index]=item;
        }
    }
     int pop(){
        if(index<0){
            index=-1;
            System.out.println("Стек не загружен");
            return 0;
        }else{
            return array[index--];

     }

    }


}
