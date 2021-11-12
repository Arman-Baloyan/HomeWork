package staticOrString;

public class StackTest2 {
    public static void main(String[] args) {
        StackTest2 mystack3=new StackTest2();
        StackTest2 mystack4=new StackTest2();
        //Разместить числа в стеке
        for (int i = 0; i < 10; i++)mystack3.push(i); {
            for (int j = 0; j < 20; j++) mystack4.push(j);{

                System.out.println(mystack3);
                for (int i = 0; i < 10; i++) {
                    System.out.println(mystack3.pop());

                }
            }
        }
    }

    private String pop() {
        return null;
    }

    private void push(int i) {
    }
}
