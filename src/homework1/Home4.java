package homework1;

public class Home4 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4-1-i;j++){
                System.out.print(" ");
            }
            for(int j=4-i-1;j<4;j++){
                System.out.println("* ");
            }
            System.out.println();
        }
        for(int i=2;i>=0;i--){
            for(int j=0;j<3-i;j++){
                System.out.println(" ");
            }
            for(int j=2-i-1;j<2;j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
/*
кроме этого труда много точнее с понедельника пытался но нечего не получилось ,но главное усердное работа  что то так
 */