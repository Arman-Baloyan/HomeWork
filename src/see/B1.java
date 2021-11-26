package see;

public class B1 extends A1{
    int i;//этот член i скрывает член i из класса А1
    B1(int a,int b){
        super.i=a;//член i из А1
        i=b;//член i из класса  B1
    }
    void  show(){
        System.out.println("Член i в суперклассе:"+super.i);
        System.out.println("Член i в подклассе:"+i);
    }
}
class UseSuper{
    public static void main(String[] args) {

        B1 subOb=new B1(1,2);
        subOb.show();
    }
}