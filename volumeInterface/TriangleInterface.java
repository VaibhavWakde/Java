package java_task.volumeInterface;

/**
 * Area of Triangle : 1/2 x b x h
 */

public class TriangleInterface implements ShapeInterface{

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

    public TriangleInterface(int breadth, int height){
        this.breadth=breadth;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (0.5* breadth*height);
    }
}
