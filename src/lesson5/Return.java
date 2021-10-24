package lesson5;

public class Return {
    public static void main(String[] args) {
        boolean t =true;
        System.out.println( " До возврата");
        if(t) return;//Возврат в вызываюший код
        System.out.println("Этот оператор выполняться не будет");
    }
}
