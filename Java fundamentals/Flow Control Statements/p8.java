import java.util.*;
class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char code = Character.toUpperCase(sc.next().charAt(0));
        switch(code) {
            case 'R' -> System.out.println("Red");
            case 'B' -> System.out.println("Blue");
            case 'G' -> System.out.println("Green");
            case 'O' -> System.out.println("Orange");
            case 'Y' -> System.out.println("Yellow");
            case 'W' -> System.out.println("White");
            default -> System.out.println("Invalid Code");
        }
    }
}