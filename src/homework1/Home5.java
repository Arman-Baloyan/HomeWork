package homework1;

public class Home5 {
    public static void main(String []  args){
        for(int i=4-1;i>=0;i--){
            for(int j=0;j<4-i-1;j++){
                System.out.print(" ");
            }
            for(int j=4-i-1;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
