package Advanced.NamuDarbai.Daugiakampiai;

public class RegularPolygonMain {
    public static void main(String[] args) {

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        System.out.println("Lygiakrascio trikampio perimetras: " + equilateralTriangle.getPerimeter());
        System.out.println("Lygiakrascio trikampio plotas: " + equilateralTriangle.getArea());

        Square square = new Square(5);
        System.out.println("Kvadrato perimetras: " + square.getPerimeter());
        System.out.println("Kvadrato plotas: " + square.getArea());

    }
}
