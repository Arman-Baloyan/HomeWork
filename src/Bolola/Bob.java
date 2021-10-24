package Bolola;

public class Bob {
    public static void main(String[] args) {

        boolean isBob=false;
        char[]charArray={'b','o','b','o','l','a'};
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]=='b'&& charArray[i+2]=='b')
                isBob=true;
            break;

        }


    }
}
