package see;

public class DemoSuper {
    public static void main(String[] args) {

        BoxWeight mybox1=new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2=new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3=new BoxWeight(13,4,5,6);
        BoxWeight mycube=new BoxWeight(3,24,4,3);
        BoxWeight myclone=new BoxWeight(mybox1.weight, mybox1.depth, mybox1.height, mybox1.weight);
        double vol;

        vol=mybox1.volume();
        System.out.println("mybox1 "+vol);
        System.out.println(" "+ mybox1.weight);
        System.out.println();
        vol=mybox2.volume();
        System.out.println("mybox2"+mybox2);
        System.out.println(""+mybox2.weight);
        System.out.println();
        vol=mybox3.volume();
        System.out.println(" mybox3"+mybox3);
        System.out.println(" "+mybox3.weight);
        System.out.println();
        vol=myclone.volume();
        System.out.println("myclone"+vol);
        System.out.println("myclone "+myclone.weight);
        System.out.println();
        vol=mycube.volume();
        System.out.println("mycube"+vol);
        System.out.println("mycube"+mycube.weight);
        System.out.println();
    }
}
