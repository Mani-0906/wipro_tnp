import java.util.*;
class Calculator {
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer and its power: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result = " + Calculator.powerInt(a, b));
        System.out.print("Enter a double value and its power: ");
        double x = sc.nextDouble();
        int y = sc.nextInt();
        System.out.println("Result = " + Calculator.powerDouble(x, y));
    }
}