// 1)Shape.java Parent Class
	// Parent class Shape


package com.java;


	
class Shape {
    // Its  Default constructor
    public Shape() {
    }

    // Method to calculate the area (to be overridden by subclasses)
    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle class
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the getArea() method to calculate the area of a rectangle
    @Override
    public double getArea() {
        return length * width;
    }


public class  M {
    public static void main(String[] args) {
        // Create  the Rectangle class
        Rectangle rectangle = new Rectangle(12.0, 4.0);

        // Call the getArea() method on the rectangle object
        double area = rectangle.getArea();

        // Display the calculated area
        System.out.println("Area of the rectangle: " + area);
    }
}
}

