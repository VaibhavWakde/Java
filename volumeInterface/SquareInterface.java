package java_task.volumeInterface;

/**
 *Area of Square = side^2
 */

public class SquareInterface implements ShapeInterface{

    private int side;

//    public int getSide() {
//        return side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//    }

    public SquareInterface(int side) {
        this.side=side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
