package Advanced.NamuDarbai.Shape.ShapeDestytojo;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeDescription, double radius) {
        super(shapeDescription);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}