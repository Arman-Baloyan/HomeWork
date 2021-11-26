package see;

//вес паралепипеда
public class BoxWeight1 {
    double weight;

    //сконструировать клон объекта
    BoxWeight1(BoxWeight1 ob) {//передать объект конструктору
        super();
        weight = ob.weight;
    }
    //конструктор применяемый при указании всех параметров
    BoxWeight1(double w,double h,double d,double m){
        super();
        weight=m;
    }
    //конструктор применяемый по умолчанию
    BoxWeight1(){
        super();
        weight=-1;
    }
    //конструктор применяемый при создании куба
    BoxWeight1(double len,double m){
        super();
        weight=m;
    }
}
