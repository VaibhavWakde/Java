package java_task.abstraction_task;


public class Math extends Student{

    @Override
    void getDetails() {

        System.out.println("Maths Marks:");
    }

    @Override
    int getMarks() {

        return 87;
    }


    int math = getMarks();


}
