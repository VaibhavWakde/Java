package java_task.prime_number;

import java.util.Scanner;

/**
 * prime nos are - 1,3,5,11
 */

public class PrimeNumber {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,7,8,9,10};
        int size = a.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int p = 0;

     

        System.out.println();


        for(int i =2;i<=num-1;i++){
            if (num%i==0){
                p+=1;
            }
            System.out.println(p);
        }
        if(p>0){
            System.out.println(num +" is not a prime number");
        }
        else {
            System.out.println(num +" is prime number");
        }
    }
}



//                if(a[i]%2==1){
//                if((a[i]%3==0 && a[i]!=9) | a[i]%5==0 | a[i]%7==0){
//                    System.out.println(a[i]);
//                }
//            }