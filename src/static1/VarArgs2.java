package static1;

public class VarArgs2 {
    //В данном примере msg обычный параметр
    //a v -параметр переменной длины
    static  void vaTest(String msg,int...v){
        System.out.print(msg+v.length+"Содержание:");
        for (int x:v){
            System.out.print(x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest("Один параметр переменной длины:",10);
        vaTest("Три параметр переменной длины:",1,2,3);
        vaTest("Без параметров переменной длины:");
    }
}
