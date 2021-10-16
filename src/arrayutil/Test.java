package arrayutil;

public class Test {
    public static void main(String[] args) {

        for(int i=2;i<=10;i++){
            boolean lav=true;
            for(int j=2; j<i;j++){
                lav=false;
                if(i%j==0){
                    break;
                }
                if(lav){
                    System.out.println(i);
                }
            }
        }
    }
}
