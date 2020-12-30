package Advanced.NamuDarbai.Shape;

public class ShapeDescription {
    public static void main(String[] args) {

        RightAngleRectangle myrightAngleRectangle = new RightAngleRectangle(12, 15);

        Circle myCircle = new Circle(8);

        System.out.println("Apskritimo plotas: " + myCircle.areaOfACircle());
        System.out.println("Apskritimo ilgis: " + myCircle.theLengthOfTheCircle());
        System.out.println("Stataus trikampio plotas: " + myrightAngleRectangle.areaOfATriangle());
        System.out.println("Staciakampio plotas: " + myrightAngleRectangle.areaOfTheRectangle());

    }

}
