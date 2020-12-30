package lt.coding.namuDarbai.countrys;

public class CountrysMain {

    public static Countrys getLeastPollutedCountry(Countrys[] countries) {
        Countrys leastPollutedCountry = countries[0];

        for (int i = 0; i < countries.length; i++) {
            if (calculateCo2Emission(leastPollutedCountry) > calculateCo2Emission(countries[i])) {
                leastPollutedCountry = countries[i];
            }
        }
        return leastPollutedCountry;
    }

    public static double getTotalEmissionsOfAllCountries(Countrys[] countries) {
        double totalEmission = 0;

        for (int i = 0; i < countries.length; i++) {
            totalEmission += calculateCo2Emission(countries[i]);
        }
        return totalEmission;
    }

    public static double getAverageEmissionOfAllCountries(Countrys[] countries) {
        double emissionCounter = 0;

        for (int i = 0; i < countries.length; i++) {
            emissionCounter += calculateCo2Emission(countries[i]);
        }
        return emissionCounter / countries.length;
    }

    public static double calculateCo2Emission(Countrys country) {
        switch (country.getPollutionFactor()) {
            case "factories":
                return country.getCo2Emission() * 1.4;
            case "transportation":
                return country.getCo2Emission() * 0.9;
            case "animal husbandry":
                return country.getCo2Emission() * 1.2;
            default:
                return country.getCo2Emission();
        }
    }
}
