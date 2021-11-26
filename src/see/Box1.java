package see;

public class Box1 {
    //Полная реализация класса BoxWeight
    private double width;
    private double height;
    private double depth;

    //Сконструировать клон объекта
    Box1(Box1 ob) {//передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор ,применяемый при указании всех размеров
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //конструктор применяемый в отсутствие размеров
    Box1(){
        width=-1;// значение -1 служит для обозначения
        height=-1;//неинициализированного
        depth=-1;//параллепипеда
    }
    //конструктор применяемый при создании куба
    Box1(double len){
        width=height=depth=len;
    }
    //растрачить и возвратить объем
    double volume(){
        return  width*height*depth;
    }
}
