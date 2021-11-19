package static1;

public class PassArray {

    static void vaTest(int v[]){
        System.out.println("Количество аргументов:"+v.length
                +"Содержимое:");
        for (int x:v){
            System.out.println(x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Обратите внтмание на порядок создание массива
        //для хранения аргументов
        int n1[]={10};
        int n2[]={1,2,3};
        int n3[]={};
        vaTest(n1);//1аргумент
        vaTest(n2);//3аргумента
        vaTest(n3);//без аргумента
    }
}
