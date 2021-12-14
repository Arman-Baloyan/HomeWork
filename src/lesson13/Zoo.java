package lesson13;

public class Zoo {
    public static void main(String[] args) {

  //      System.out.println(args[0]);
    //    System.out.println(args[1]);
    }
    public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) { return i; }

        }
        return -1;

    }

}
