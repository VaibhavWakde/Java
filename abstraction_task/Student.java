package java_task.abstraction_task;


abstract class Student {

    Student(){
        System.out.println("Student Created");
    }

    abstract int getMarks();

    void getDetails(){
        System.out.println("Student Marks");
    }

}
