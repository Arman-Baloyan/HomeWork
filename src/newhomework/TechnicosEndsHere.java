package newhomework;

public class TechnicosEndsHere {
    public static void main(String[] args) {
int[]numbers=new int[10];
numbers[9]=23;
numbers[8]=12;
numbers[7]=23;
numbers[6]=12;
numbers[5]=1;
        int i = 9;
        System.out.println(numbers[5] + " ");
        System.out.println("Invalid operation");

        for (int j = 0; j < 10; j++) {
            numbers[i]=i+1;
            System.out.print(numbers[i]+ "dig ");

        }


    }

}
