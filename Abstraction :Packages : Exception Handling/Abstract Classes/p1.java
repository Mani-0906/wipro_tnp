import java.util.*;
abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment";
    }
}

public class p1 {

    public static void main(String[] args) {

        Random r = new Random();

        Compartment[] c = new Compartment[10];

        for (int i = 0; i < 10; i++) {

            int n = r.nextInt(4) + 1;

            switch (n) {
                case 1:
                    c[i] = new FirstClass();
                    break;
                case 2:
                    c[i] = new Ladies();
                    break;
                case 3:
                    c[i] = new General();
                    break;
                case 4:
                    c[i] = new Luggage();
                    break;
            }
        }

        System.out.println("Compartments:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + c[i].notice());
        }
    }
}