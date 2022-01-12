package java_task.volumeInterface;

import java_task.volumeInterface.ShapeInterface;

/**
 * Area of Circle : pie r^2
 */

public class CircleInterface implements ShapeInterface{
    private int radius;

//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }

    //    final int pie =22/7;
    public CircleInterface(int radius){
        this.radius=radius;

    }

    @Override
    public double calculateArea() {
        return (3.14*radius*radius);
    }
}
