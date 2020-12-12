package Advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public  static void main (String[] args) {
        List<String> visitedCountries = new ArrayList<>();

        visitedCountries.add("German");
        visitedCountries.add("German");
        visitedCountries.add("Spain");
        visitedCountries.add("France");

        visitedCountries.remove("Spain");

        for (String country : visitedCountries){
            System.out.println(country);
        }

//        Set<String> unicueVisitedCountries = new
    }
}
