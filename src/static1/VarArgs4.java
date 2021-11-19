package static1;

public class VarArgs4 {
    static void vaTest(int...v){
        System.out.print("vaTest(int ...):"
        +"Количество аргументов:"
        +v.length+"Содержание:");
        for (int x:v){
            System.out.print(x+"");
            System.out.println();
        }
    }
    static  void vaTest(boolean ...v){
        System.out.print("vaTest(boolean ...):"
                +"Колличество аргументов:"
        +v.length+"Содержание");
        for (boolean x:v){
            System.out.print(x+"");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(1,2,3);//Верно
        vaTest(true,false,false);//Верно
        vaTest(4);//Ошибка: неодназначность,если оставлю пустую
       // скобку то задача не выполниться как надо, для этого
          //      пишу к примеру 4 что бы программа задействовало
           //     на ура.
    }
}
