package java_task.volume;

import java.util.Scanner;

/**
 * Area of Rectangle : l x b
 */

public class Rectangle extends Shape{

//    public int getBreadth() {
//        return breadth;
//    }
//
//    public void setBreadth(int breadth) {
//        this.breadth = breadth;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }

    private int breadth;
    private int length;
    public Rectangle(int breadth,int length){
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    double calculateArea() {
        return (length*breadth);
    }
}
