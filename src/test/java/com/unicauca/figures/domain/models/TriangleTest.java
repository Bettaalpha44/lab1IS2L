/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.unicauca.figures.domain.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Felipe Castro
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double base = 3;
        double height = 8;
        double side2 = 2;
        double side3 = 1;
        Triangle instance = new Triangle(base, height, side2, side3);
        double areaExpected = (base*height)/2;
        double areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalculateArea2() {
        System.out.println("calculateArea");
        double base = 245;
        double height = 643;
        double side2 = 700;
        double side3 = 300;
        Triangle instance = new Triangle(base, height, side2, side3);
        double areaExpected = (base*height)/2;
        double areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCalculateArea3() {
        System.out.println("calculateArea");
        double base = 5325;
        double height = 5235;
        double side2 = 2341;
        double side3 = 1000;
        Triangle instance = new Triangle(base, height, side2, side3);
        double areaExpected = (base*height)/2;
        double areaActual = instance.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    /**
     * Test of calculatePerimeter method, of class Triangle.
     */
    @Test
    public void testCalculatePerimeter() {
        
        System.out.println("calculatePerimeter");
        double base = 3;
        double height = 8;
        double side2 = 2;
        double side3 = 1;
        Triangle instance = new Triangle(base, height, side2, side3);
        double perimeterExpected = base + side2 + side3;
        double perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
    }

    @Test
    public void testCalculatePerimeter2() {
        
        System.out.println("calculatePerimeter");
        double base = 245;
        double height = 643;
        double side2 = 700;
        double side3 = 300;
        Triangle instance = new Triangle(base, height, side2, side3);
        double perimeterExpected = base + side2 + side3;
        double perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
    }
    
    @Test
    public void testCalculatePerimeter3() {
        
        System.out.println("calculatePerimeter");
        double base = 5325;
        double height = 5235;
        double side2 = 2341;
        double side3 = 1000;
        Triangle instance = new Triangle(base, height, side2, side3);
        double perimeterExpected = base + side2 + side3;
        double perimeterActual = instance.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
    }
    
    
    /**
     * Test of getBase method, of class Triangle.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Triangle instance = null;
        double expResult = 0.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class Triangle.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        double base = 0.0;
        Triangle instance = null;
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Triangle.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Triangle instance = null;
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class Triangle.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 0.0;
        Triangle instance = null;
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSide2 method, of class Triangle.
     */
    @Test
    public void testGetSide2() {
        System.out.println("getSide2");
        Triangle instance = null;
        double expResult = 0.0;
        double result = instance.getSide2();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSide2 method, of class Triangle.
     */
    @Test
    public void testSetSide2() {
        System.out.println("setSide2");
        double side2 = 0.0;
        Triangle instance = null;
        instance.setSide2(side2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSide3 method, of class Triangle.
     */
    @Test
    public void testGetSide3() {
        System.out.println("getSide3");
        Triangle instance = null;
        double expResult = 0.0;
        double result = instance.getSide3();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSide3 method, of class Triangle.
     */
    @Test
    public void testSetSide3() {
        System.out.println("setSide3");
        double side3 = 0.0;
        Triangle instance = null;
        instance.setSide3(side3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
