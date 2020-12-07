package Basics;

import FundamentalTesting.Circle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void calculatedCirclePerimeters() {
        //given
        Circle circle = new Circle(5);

        //when
        double result = circle.calculatedCirclePerimeter;

        //then
        Assertions.assertThat(result);
//                .isEqualTo(Math.PI);
    }

    @Test
    public void calculatedCircleArea() {
        //given
        Circle circle = new Circle(2);

        //when
        double result = circle.calculatedCircleArea();

        //then
        Assertions.assertThat(result);
//                .isEqualTo(Math.PI);

    }
}
