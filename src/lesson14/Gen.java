/*package lesson14;

import org.w3c.dom.ls.LSOutput;

public class Gen <T>{
    T ob;//объявить объект типа T
    //передать конструктору ссылку на объект типа T
    Gen (T o){
        ob=o;
    }
    //возвратить объует ob
    T getob(){
        return ob;
    }
    //показать тип T
    void showType(){
        System.out.println("Типом T являеться" + ob.getClass().getName());
    }
    static class GenDemo{
        public  static void main (String [] args){
            //Создать ссылку типа Gen для целых чисел
            Gen<Integer>iob;
            iob=new Gen<Integer>(88);
            iob.showType();
            int v =iob.getob();
            System.out.println("Значения"+v);
            System.out.println();

        }
    }
    //Создать объект типа Gen для символьных строк
    //   Gen<String>strob=new Gen<String>("ТЕКСТ СООБЩЕНИЙ");
  //  strob.showType();
 //   String str=strob.getob();
 //   System.out.println(" Значение:"+ str);
}
*/
