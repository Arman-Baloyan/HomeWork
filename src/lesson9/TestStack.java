package lesson9;

public class TestStack {
    public static void main(String[] args) {

        Stack stack=new Stack();
         stack.push(23);
         stack.push(34);
         stack.push(21);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(29);
        stack.push(31);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Stack mystack1=new Stack();
        Stack mystack2=new Stack();
        for (int i = 0; i < 10; i++)mystack1.push(i); {
            for (int i = 0; i < 20; i++) mystack2.push(i);{
                System.out.println("Содержание стейка mystack1:");
                for (int i = 0; i < 10; i++) {
                    System.out.println(mystack1.pop());
                    System.out.println("Содержимое стека mystack2:");
                    for (int j = 0; i < 10; i++) {
                        System.out.println(mystack2.pop());

                    }

                }

            }

        }
    }


}
