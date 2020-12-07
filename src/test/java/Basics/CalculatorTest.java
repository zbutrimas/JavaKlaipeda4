package Basics;

import FundamentalTesting.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(2, 4);

        //then
        assertEquals( 6, result);
    }
    @Test
    public void testDivision(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(10, 5);

        //then
        assertEquals( 2, result);
    }
    @Test
    public void testOne(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.one(10, 5);

        //then
        assertEquals( 5, result);
    }
    @Test
    public void testTwo(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.two(10, 5);

        //then
        assertEquals( 50, result);
    }
}

