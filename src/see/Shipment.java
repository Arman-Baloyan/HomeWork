package see;

public class Shipment extends BoxWeight1 {
    double cost;

    //сконструировать клон объекта
    Shipment(Shipment ob) {//передать объект конструктору
        super(ob);
        cost = ob.cost;
    }
    //конструктор используемый при указании всех параметров
    Shipment(double d,double w,double h,double m,double c){
        super(w, h, d, m);//вызвать конструктор суперкласса
        cost=c;
    }
    //конструктоп применяемый при создании куба
    Shipment(double len,double m,double c){
        super(len, m);
        cost=c;
    }

    public double volume() {
        return 0;
    }
}
