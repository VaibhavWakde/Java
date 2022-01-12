package java_task.volume;

import java.util.Scanner;

/**
 * Area of Triangle : 1/2 x b x h
 */

public class Triangle extends Shape{

    private int breadth;
    private int height;

//    public int getBreadth(){
//        return breadth;
//    }
//
//    public void setBreadth(int breadth) {
//        this.breadth = breadth;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }

    public Triangle(int breadth,int height){
        this.breadth=breadth;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (0.5* breadth*height) ;
    }
}
