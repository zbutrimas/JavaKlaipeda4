package Advanced.NamuDarbai.Shape;

public class RightAngleRectangle extends Rectangle{

    private int width;
    private int height;

    public RightAngleRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int areaOfATriangle() {
        return (width * height) / 2;
    }

    @Override
    public int areaOfTheRectangle() {
        return width * height;
    }
}
