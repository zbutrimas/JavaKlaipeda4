package lt.coding.namuDarbai.countrys;

public class Countrys {

    private String name;
    private long co2Emission;
    private String pollutionFactor;

    public Countrys(String name) {
        this.name = name;
    }

    public Countrys(String name, long co2Emission, String pollutionFactor){
        this.name = name;
        this.co2Emission = co2Emission;
        this.pollutionFactor = pollutionFactor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPollutionFactor() {
        return pollutionFactor;
    }

    public void setPollutionFactor(String pollutionFactor) {
        this.pollutionFactor = pollutionFactor;
    }

    public long getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(long co2Emission) {
        this.co2Emission = co2Emission;
    }
}
