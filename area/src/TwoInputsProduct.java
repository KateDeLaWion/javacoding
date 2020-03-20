//First way to do this
import java.util.Scanner;

public class TwoInputsProduct {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }

}


//Second way to do this

//import java.util.Scanner;
//
//public class TwoInputsProduct {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Input first number: ");
//        int num1 = scan.nextInt();
//
//        System.out.print("Input second number: ");
//        int num2 = scan.nextInt();
//
//        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
//    }
//
//}
