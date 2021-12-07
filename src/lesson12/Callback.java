package lesson12;

public interface Callback {
    int EXIT=0;
    void callback();


   default void method1(){
       System.out.println("kuku");

    }
    static  void method2(){
        System.out.println("kuku from static method");
    }
}
