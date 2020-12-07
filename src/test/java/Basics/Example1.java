package Basics;

import org.junit.jupiter.api.*;

public class Example1 {

    @BeforeAll
    static void setUp(){
        System.out.println("This message be displayed once before executing for all testing methods");
    }

    @BeforeEach
    public  void init(){
        System.out.println("This message be displayed before executing of each testing methods");
    }

    @AfterEach
    public void tear(){
        System.out.println("This message be displayed after executing of each testing method");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("This message be displayed after all executing testing method");
    }

    @Test
    public void firstTest() {
        System.out.println("Executing first test...");
    }

    @Test
    public void secondTest() {
        System.out.println("Executing second test...");
    }

    @Test
    @DisplayName("Third test")
    public void thirdTest(){
        System.out.println("Executing third test...");
    }

    @Test
    @Disabled
    public void fourthTest(){
        System.out.println("Executing fourth test...");
    }
}
