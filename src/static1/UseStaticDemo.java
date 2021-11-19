package static1;

public class UseStaticDemo {
    static int a=42;
    static int b=99;
    static  void callme(){
        System.out.println("a="+a);
    }
}
class StaticByName{
    public static void main(String[] args) {

        UseStaticDemo.callme();
        System.out.println("b="+ UseStaticDemo.b);
    }
}