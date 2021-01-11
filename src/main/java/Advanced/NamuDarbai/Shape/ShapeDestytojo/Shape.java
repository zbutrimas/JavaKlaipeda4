package Advanced.NamuDarbai.Shape.ShapeDestytojo;

public abstract class Shape {
    protected String shapeDescription;

    public Shape(String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }
}