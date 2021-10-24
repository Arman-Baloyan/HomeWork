package Bolola;

public class Bolola {
    public static void main(String[] args) {

        char[] name=new char [6];
        name[0] = 'b';
        name[1] = 'o';
        name[2] = 'l';
        name[3] = 'o';//so hardly but i am to spell char[]
        name[4] = 'l';
        name[5] = 'a';
        int count=0;
        for (int i = 0; i < name.length; i++) {
            char c=name[i];
            if(c=='o'){
                count++;
            }

        }
        System.out.println("count="+count);
    }
}
