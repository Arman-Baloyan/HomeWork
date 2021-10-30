package lesson9;

public class BoxDemo {

    public static void main(String[] args) {

        Box myBox=new Box();
        Box myBox1=new Box();
     //   System.out.println(myBox.widht);
    //    System.out.println(myBox.height);
     //   System.out.println(myBox.depth);
        double val;

        myBox.widht=10;
        myBox.height=20;
        myBox.depth=15;
        val=myBox.widht* myBox.height* myBox.depth;


        System.out.println("volume for myBox:" +val);
        System.out.println();


        myBox1.widht=200;
        myBox1.height=150;
        myBox1.depth=100;

        val= myBox1.height* myBox1.height* myBox1.depth;
        myBox1.widht=23;
        System.out.println("volume for myBox1:"+val);


    }
}
