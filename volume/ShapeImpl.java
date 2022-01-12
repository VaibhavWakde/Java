package java_task.volume;

import java.util.Scanner;

public class ShapeImpl {
    public static void main(String[] args) {
//        Shape shape = new Area();
//        Circle circle = new Circle();
//        Square square = new Square();
//        Rectangle rectangle = new Rectangle();

        Scanner scanner = new Scanner(System.in);


        int value;

        do {
            System.out.println("Choose One: ");
            System.out.println("1. Triangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            System.out.println("4. Rectangle");
            System.out.println("5. Exit");


            System.out.println("Choose One : ");
            value = scanner.nextInt();


            switch (value) {
                case 1:
                    System.out.println("Enter Breadth & Height: ");
                    int breadth = scanner.nextInt();
                    int height = scanner.nextInt();
                    Shape triangle = new Triangle(breadth, height);
                    System.out.println("Area of Triangle is : " + triangle.calculateArea());
                    break;

                case 2:
                    System.out.println("Enter Radius: ");
                    int radius = scanner.nextInt();
                    Shape circle = new Circle(radius);
                    System.out.println("Area of Circle is : " + circle.calculateArea());
                    break;
                case 3:
                    System.out.println("Enter Side: ");
                    int side = scanner.nextInt();
                    Shape square = new Square(side);
                    System.out.println("Area of Square is : " + square.calculateArea());
                    break;
                case 4:
                    System.out.println("Enter  Breadth & Length: ");
                    int breath = scanner.nextInt();
                    int length = scanner.nextInt();
                    Shape rectangle = new Rectangle(breath, length);
                    System.out.println("Area of Rectangle is : " + rectangle.calculateArea());
                    break;
                case 5:
                    System.exit(0);
            }
        } while (value < 6);
    }
}