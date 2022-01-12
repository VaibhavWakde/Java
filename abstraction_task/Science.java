package java_task.abstraction_task;


public class Science extends Student{

    @Override
    void getDetails() {
        System.out.println("Science Marks:");
    }

    @Override
    int getMarks() {
        return 88;
    }

    int science = getMarks();
}
