package com.unicauca.figures.domain.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Libardo
 */
public class CircleTest {

    public CircleTest() {
    }

    /**
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double radius = 1.0;
        Circle circle = new Circle(radius);
        double areaExpected = Math.PI * Math.pow(radius, 2);
        double areaActual = circle.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
    }
    
    @Test
    public void testCalculateArea2() {
        System.out.println("calculateArea");
        double radius = 534;
        Circle circle = new Circle(radius);
        double areaExpected = Math.PI * Math.pow(radius, 2);
        double areaActual = circle.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
    }
    
    @Test
    public void testCalculateArea3() {
        System.out.println("calculateArea");
        double radius = 1435;
        Circle circle = new Circle(radius);
        double areaExpected = Math.PI * Math.pow(radius, 2);
        double areaActual = circle.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
    }

    
    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double radius = 1.0;
        Circle circle = new Circle(radius);
        double perimeterExpected = 2.0 * Math.PI * radius;
        double perimeterActual = circle.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
    }
    
    @Test
    public void testCalculatePerimeter2() {
        System.out.println("calculatePerimeter");
        double radius = 534;
        Circle circle = new Circle(radius);
        double perimeterExpected = 2.0 * Math.PI * radius;
        double perimeterActual = circle.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
    }
    
    @Test
    public void testCalculatePerimeter3() {
        System.out.println("calculatePerimeter");
        double radius = 1435;
        Circle circle = new Circle(radius);
        double perimeterExpected = 2.0 * Math.PI * radius;
        double perimeterActual = circle.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
    }

}
