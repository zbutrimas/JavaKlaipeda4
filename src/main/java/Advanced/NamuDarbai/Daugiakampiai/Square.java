package Advanced.NamuDarbai.Daugiakampiai;

public class Square implements RegularPolygon{

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    @Override
    public double getNumSides() {
        return 4;
    }

    @Override
    public double getSideLength() {
        return length;
    }

    @Override
    public double getArea() {
        return getSideLength() * getSideLength();
    }

    @Override
    public double getPerimeter() {
        return getSideLength() * getNumSides();
    }

}



