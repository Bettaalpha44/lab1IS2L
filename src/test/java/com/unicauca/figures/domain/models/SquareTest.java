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
public class SquareTest {
    
    public SquareTest() {
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
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double side = 1.3;
        Square instance = new Square(side);
        double expResult = side * side;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.001);
    }
    
    @Test
    public void testCalculateArea2() {
        System.out.println("calculateArea");
        double side = 23351.53;
        Square instance = new Square(side);
        double expResult = side * side;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.001);
    }
    
    @Test
    public void testCalculateArea3() {
        System.out.println("calculateArea");
        double side = 5325325.1441;
        Square instance = new Square(side);
        double expResult = side * side;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.001);
    }
    

    /**
     * Test of calculatePerimeter method, of class Square.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double side = 1.3;
        Square instance = new Square(side);
        double expResult = 4*side;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
    }
    
    @Test
    public void testCalculatePerimeter2() {
        System.out.println("calculatePerimeter");
        double side = 23351.53;
        Square instance = new Square(side);
        double expResult = 4*side;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
    }
    
    @Test
    public void testCalculatePerimeter3() {
        System.out.println("calculatePerimeter");
        double side = 5325325.1441;
        Square instance = new Square(side);
        double expResult = 4*side;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.001);
    }
    

    /**
     * Test of getSide method, of class Square.
     */
    @Test
    public void testGetSide() {
        System.out.println("getSide");
        Square instance = null;
        double expResult = 0.0;
        double result = instance.getSide();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSide method, of class Square.
     */
    @Test
    public void testSetSide() {
        System.out.println("setSide");
        double side = 0.0;
        Square instance = null;
        instance.setSide(side);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
