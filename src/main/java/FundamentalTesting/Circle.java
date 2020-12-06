package FundamentalTesting;

public class Circle {

    public double radius;
    public double calculatedCirclePerimeter;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculatedCirclePerimeter(){
        return 2 * Math.PI * radius;
    }

    public double calculatedCircleArea(){
        return Math.pow(radius,2) * Math.PI;
    }

}
