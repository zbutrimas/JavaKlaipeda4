package Advanced.NamuDarbai.PolygonDestytojo;

public class EquilateralTriangle implements RegularPolygon {

    private int length;

    public EquilateralTriangle(int length) {
        this.length = length;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return length;
    }
}