import java.util.*;
class Box {
    int width, height, depth;
    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    int volume() {
        return width * height * depth;
    }
}
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Width: ");
        int width = sc.nextInt();
        System.out.print("Enter Height: ");
        int height = sc.nextInt();
        System.out.print("Enter Depth: ");
        int depth = sc.nextInt();
        Box b = new Box(width, height, depth);
        System.out.println("Volume of Box = " + b.volume());
    }
}