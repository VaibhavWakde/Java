package java_task.volumeInterface;

import java_task.volumeInterface.ShapeInterface;

/**
 * Area of Rectangle : l x b
 */
public class RectangleInterface implements ShapeInterface{

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
    public RectangleInterface(int breadth, int length){
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return (length*breadth);
    }
}
