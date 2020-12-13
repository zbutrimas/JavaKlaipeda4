package lt.coding.namuDarbai.houseProject;

public class House {

        private int area;
        private String district;
        private int builtYear;
        private String condition;

    public House(int area, String district, int builtYear, String condition){
            this.area = area;
            this.district = district;
            this.builtYear = builtYear;
            this.condition = condition;
        }

    public House() {

    }

    public String getCondition() { return condition; }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}