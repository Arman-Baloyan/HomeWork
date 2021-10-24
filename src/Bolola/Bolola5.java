package Bolola;

public class Bolola5 {
    public static void main(String[] args) {
        char[]text={' ',' ','b','o','l','o','l','a',' ',' '};
        char[]result=new char[5];
        int j=0;
        for (int i = 0; i < text.length; i++) {
            switch (text[i]){
                case ' ':
                    break;
                default:
                    result[j]=text[i];
                System.out.print(result[j]);
            }

        }
    }
}
