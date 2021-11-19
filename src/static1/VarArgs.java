package static1;

public class VarArgs {
    //Теперь метод vaTest() объявляеться с аргументами
    //переменной длины
    static void vaTest(int...v){
        System.out.println("Количество аргументов:"
                +v.length+"Содержимое");
        for (int x:v){
            System.out.println(x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Обратите внимание на возможные способы вызовы
        //метода vaTest() с аргументами переменной длины
        vaTest(10);//1 аргумент
        vaTest(1,2,3);//3 аргумента
        vaTest();//без аргументов
    }
}
