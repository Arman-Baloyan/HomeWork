package lesson5;

public class ContinueLabel1 {
    public static void main(String[] args) {

        other:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(j>i){
                    System.out.println();
                    continue ;
                }
            }
            System.out.println(" "+(i*'j'));
        }
        System.out.println();
    }

}
