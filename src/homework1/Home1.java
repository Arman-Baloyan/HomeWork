package homework1;

public class Home1 {
    public static void main() {
        main();
    }

    public static void main(String [] args ){
        for(int i=0;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(" ");
            }
            for (int b=1;b<=i;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
