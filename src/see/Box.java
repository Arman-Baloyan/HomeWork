package see;

public class Box {
    //В этой программе наследование применяеться
    // для рассширения класса  Box
    double width;
    double height;
    double depth;

    //сконструировать клон объекта
    Box(Box ob) {//передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    //конструктор применяемый в отсутствие размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор применяемый в отсутствие размеров
    Box() {
        width = -1;//значение -1 служит для обозначения
        height = -1;//неинициализированного
        depth = -1;//параллепипеда

    }

    //конструктор применяемый при создании клуба
    Box(double len) {
        width = height = depth = len;
    }
    //расчитать и возвратить объем
    double volume(){
        return width*depth*height;
    }
}


