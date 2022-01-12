package java_task.leapyear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year : ");
        int year = scanner.nextInt();
        if(year%4==0){
            System.out.println(year+" is a Leap Year");
        }
        else {
            System.out.println(year+" is not a Leap Year");
        }
    }
}
