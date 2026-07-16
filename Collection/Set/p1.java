import java.util.*;

public class p1 {

    HashSet<String> H1 = new HashSet<>();

    HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    String getCountry(String countryName) {

        Iterator<String> it = H1.iterator();

        while (it.hasNext()) {
            String country = it.next();

            if (country.equals(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        p1 obj = new p1();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println("Countries in HashSet:");
        System.out.println(obj.H1);

        System.out.println();

        System.out.println("Searching for India:");
        System.out.println(obj.getCountry("India"));

        System.out.println();

        System.out.println("Searching for Canada:");
        System.out.println(obj.getCountry("Canada"));
    }
}