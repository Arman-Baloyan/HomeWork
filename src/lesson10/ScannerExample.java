package lesson10;

import arrayUtil1.Calculatror;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a");
        int a = scanner.nextInt();
        System.out.println("please input b");
        int b = scanner.nextInt();

        Calculatror calculator = new Calculatror();
        System.out.println("please input operation(+,_,*,/)");
        String c = scanner.next();
        switch (c){
            case"+":
                System.out.println(calculator.gumarum(a,b));
                break;
            case"-":
                System.out.println(calculator.hanum(a,b));
                break;
            case"*":
                System.out.println(calculator.bazmapatkum(a,b));
                break;
            case"/":
                System.out.println(calculator.bazmapatkum(a,b));
                break;
            default:
                System.out.println("Invalid operation");
        }


    }
}
