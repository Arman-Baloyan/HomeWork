package lesson9;

import jdk.jshell.EvalException;

public class BoxDemo1 {
    public static void main(String[] args) {
        Box mybox1=new Box(10,20,15);
        Box mybox2=new Box(21,12,15);
        double vol1;
        mybox1.widht=10;
        mybox1.height=20;
        mybox1.depth=15;
        vol1 =mybox1.widht* mybox1.height* mybox1.depth;

        System.out.println("volume for myBox:" +vol1);


        mybox2.widht=10;
        mybox2.height=20;
        mybox2.depth=15;
        vol1=mybox2.widht* mybox2.height* mybox2.depth;

        System.out.println("volume for myBox:" +vol1);


    }
    }






