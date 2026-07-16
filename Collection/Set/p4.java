import java.util.*;

public class p4 {

    TreeSet<String> T1 = new TreeSet<>();

    TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }

    String getCountry(String countryName) {

        Iterator<String> it = T1.iterator();

        while (it.hasNext()) {
            String country = it.next();

            if (country.equals(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        p4 obj = new p4();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println("Countries in TreeSet:");
        System.out.println(obj.T1);

        System.out.println();

        System.out.println("Searching for India:");
        System.out.println(obj.getCountry("India"));

        System.out.println();

        System.out.println("Searching for Canada:");
        System.out.println(obj.getCountry("Canada"));
    }
}