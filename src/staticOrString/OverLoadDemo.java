package staticOrString;

public class OverLoadDemo {
    void test(){
        System.out.println("Параметры отсуствуют");
    }
    void test(int a){
        System.out.println("a:"+ a);
    }
    double test(double a){
        System.out.println("double a:"+a);
        return a*a;
    }
void test(int a,int b){
    System.out.println("a и b:"+a+" "+b);
}
void test(double a,double b){
    System.out.println("Внутреннее преоброзование при вызове" + " test(double)a:"+a);
}
}
