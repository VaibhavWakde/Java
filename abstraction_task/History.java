package java_task.abstraction_task;

public class History extends Student{

    @Override
    void getDetails() {
        System.out.println("History Marks:");
    }

    @Override
    int getMarks() {
        return 89;
    }

    int history = getMarks();
}
