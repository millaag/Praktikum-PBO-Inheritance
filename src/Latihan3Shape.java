/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L0324020 - Milla Agustin
 */

abstract class Shape {
    abstract double area(); 
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Latihan3Shape {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Triangle(4, 3),
            new Rectangle(5, 2),
            new Circle(3)
        };

        double totalArea = 0;

        for (Shape s : shapes) {
            double a = s.area();
            System.out.println("Luas shape: " + a);
            totalArea += a;
        }

        System.out.println("Total area: " + totalArea);
    }
}
