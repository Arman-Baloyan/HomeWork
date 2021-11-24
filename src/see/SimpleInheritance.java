package see;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb=new A();
        B subOb=new B();
        //Супер класс может использоваться самостояиельно
        superOb.i=7;
        superOb.j=8;
        superOb.k=9;
        System.out.println("Содержание оъекта subOb:");
        superOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Суммаi,j,k  объекте subOb:");
        subOb.sum();

    }
}
