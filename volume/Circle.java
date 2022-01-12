package java_task.volume;

import java.util.Scanner;

/**
 * Area of Circle : pie r^2
 */

public class Circle extends Shape{
    private int radius;

//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }

//    final int pie =22/7;
     public Circle(int radius){
        this.radius=radius;

    }

    @Override
    double calculateArea() {
        return (3.14*radius*radius);
    }
}
