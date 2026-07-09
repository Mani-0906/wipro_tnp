public class p2 {
    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println("Welcome " + args[0]);
        } else {
            System.out.println("Please provide one command line argument.");
        }
    }
}