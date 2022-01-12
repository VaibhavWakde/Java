package java_task.test20december;

import java.util.Scanner;

public class AccountImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int option;

        Account account = new Account();

        account.addAccount();

        do{
            System.out.println("1. Withdraw Money");
            System.out.println("2. Diposit Money");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.println("*********************************");


            System.out.println("Enter Your Choice: ");
            option= scanner.nextInt();



            switch (option){
                case 1:
                    System.out.println("Enter Withdraw Amount: ");
                    double amount = scanner.nextDouble();
                    account.withdrawMoney(amount);
                    break;
                case 2:
                    System.out.println("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.depositMoney(depositAmount);
                    break;
                case 3:
                    account.DisplayData();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }

        }while (option<5);

    }
}
