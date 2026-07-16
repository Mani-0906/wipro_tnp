import java.util.*;

interface DigitCount {
    int count(int n);
}

class NumberOperation {

    static int digitCount(int n) {

        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }

        return count;
    }
}

public class p2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        DigitCount dc = NumberOperation::digitCount;

        System.out.println("Number of digits = " + dc.count(n));
    }
}