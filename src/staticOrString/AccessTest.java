package staticOrString;

public class AccessTest {
    public static void main(String[] args) {
        Test ob=new Test(10,20);
        ob.a=10;
        ob.b=20;
        // неверный оператор
       // ob.c=100; Ошибка

        //Доступ к члену с данного класс должен осуществляться с помощью методов его класса
      //  ob.setc(100);
        System.out.println("a,b,c:"+ob.a+" " + ob.b+ " " + ob.getClass());

    }
}
