import java.util.*;

interface Factorial {
    int find(int n);
}

class MathOperation {

    int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}

public class p1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        MathOperation obj = new MathOperation();

        Factorial f = obj::factorial;

        System.out.println("Factorial = " + f.find(n));
    }
}