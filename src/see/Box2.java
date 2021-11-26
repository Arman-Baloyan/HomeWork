package see;

//Создание класса Box2
public class Box2 {
    private double width;
    private double height;
    private double depth;

    Box2(Box2 ob) {//Сконструировать клон объекта
        // передать объект конструктору

        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    //конструктор применяемый при указании всех размеров
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //конструктор применяемый в отсутствии размеров

    Box2() {
        width = -1;//значение -1 служит для обозначения
        depth = -1;//неиницилизированного
        height = -1;//параллепипеда
    }
    //конструктор применяемый при создании куба

    Box2(double len) {
        width = height = depth = len;
    }
    //расчитать и возвратить объем

    double volume(){
        return  width*depth*height;
    }

}
