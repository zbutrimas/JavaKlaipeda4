package Advanced.NamuDarbai.PolygonDestytojo;

public class Square implements RegularPolygon {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return length;
    }
}
