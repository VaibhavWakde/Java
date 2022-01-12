package java_task.volume;

import java.util.Scanner;

/**
 *Area of Square = side^2
 */

public class Square extends Shape{

    private int side;

//    public int getSide() {
//        return side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//    }

    public Square(int side) {
        this.side=side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }
}
