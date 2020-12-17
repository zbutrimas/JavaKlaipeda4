package Advanced.NamuDarbai.Shape;

public class Circle extends CircleArea{

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float areaOfACircle() {
        return (float) (Math.PI*radius*radius);
    }

    @Override
    public float theLengthOfTheCircle() {
        return radius + radius;
    }
}
