package Advanced.NamuDarbai.Daugiakampiai;

public class EquilateralTriangle implements  RegularPolygon{

    private double length;

    public EquilateralTriangle(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() { return length; }

    @Override
    public double getArea() { return ((getSideLength()*getSideLength())*1.73205)/4; }

    @Override
    public double getPerimeter() { return getNumSides() * length; }
}
