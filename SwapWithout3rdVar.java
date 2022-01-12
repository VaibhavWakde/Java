package java_task;

import java.util.Scanner;

public class SwapWithout3rdVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        int a = 10;
//        int b = 20;
//        int temp;
//        if(a<b){
//            temp=b;
//            a=temp;
//        }
//        else{
//            temp=a;
//            b=temp;
//        }
        System.out.println("before Swapping : "+a +" & "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping: "+a +" & "+b);


        char k='a';
        System.out.println(k);

    }
}
