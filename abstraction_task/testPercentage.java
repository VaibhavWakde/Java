package java_task.abstraction_task;


public class testPercentage {

    public static void main(String[] args){

        Student mathObj = new Math();
        Student scienceObj = new Science();
        Student historyObj = new History();

        System.out.println("Mathematics Marks : "+mathObj.getMarks());
        System.out.println("Science Marks : "+scienceObj.getMarks());
        System.out.println("History Marks : "+historyObj.getMarks());

        int sum = mathObj.getMarks() + scienceObj.getMarks() + historyObj.getMarks();

        System.out.println("Total Marks : "+sum);

        int percentage = ((sum*100)/300);

        System.out.println("percentage is : "+ ((mathObj.getMarks()+scienceObj.getMarks()+historyObj.getMarks())*100)/300+"%");


    }
}
