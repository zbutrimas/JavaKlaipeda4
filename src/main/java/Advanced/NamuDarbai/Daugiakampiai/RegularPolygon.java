package Advanced.NamuDarbai.Daugiakampiai;

public interface RegularPolygon {

    double getNumSides();

    double getSideLength();

    default double getArea() {
        return 0;
    }

    default double getPerimeter() {
        return 0;
    }

}

