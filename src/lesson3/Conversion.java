package lesson3;

public class Conversion {
    public static void main(String args[]){
        byte b;
        int i=257;
        double d=323.142;
        System.out.println("int byte");
        b=(byte) i;
        System.out.println("i b"+i+b);
        System.out.println("int");
        i=(int) d;
        System.out.println("d i"+d +i);
        System.out.println("byte");
        b=(byte) d;
    }
}
